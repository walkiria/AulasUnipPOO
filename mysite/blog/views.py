from django.shortcuts import render, get_object_or_404

from django.http import HttpResponse
import json

# Create your views here.
from django.views.generic.edit import FormView
from blog.forms import CommentForm
from django.utils import timezone

from django.shortcuts import redirect

from .models import Post
from .forms import PostForm, Analise


def post_list(request):
    posts = Post.objects.filter().order_by('published_date') 
    return render(request, 'post.html', {'posts': posts})


def post_new(request):
     if request.method == "POST":
         form = PostForm(request.POST)
         if form.is_valid():
             post = form.save(commit=False)
             post.author = request.user
             post.published_date = timezone.now()
             post.analise = Analise.watson(post.text)
             post.save()
             
             return redirect('post_detail', pk=post.pk)
             #return redirect('CommentView.form_valid',pk=post.pk)
     else:
         form = PostForm()
     return render(request, 'post_edit.html', {'form': form})


def post_detail(request, pk):
    post = get_object_or_404(Post, pk=pk)
    return render(request, 'post_detail.html', {'post': post})



class CommentView(FormView):
    template_name = 'comments.html'
    form_class = CommentForm
    success_url = '.'

    def form_valid(self, form):
        serialized_json = json.dumps(form.ask_watson() , sort_keys=True, indent=4)
        return HttpResponse(serialized_json, content_type="application/json")




