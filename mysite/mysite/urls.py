"""mysite URL Configuration

The `urlpatterns` list routes URLs to views. For more information please see:
    https://docs.djangoproject.com/en/2.0/topics/http/urls/
Examples:
Function views
    1. Add an import:  from my_app import views
    2. Add a URL to urlpatterns:  path('', views.home, name='home')
Class-based views
    1. Add an import:  from other_app.views import Home
    2. Add a URL to urlpatterns:  path('', Home.as_view(), name='home')
Including another URLconf
    1. Import the include() function: from django.urls import include, path
    2. Add a URL to urlpatterns:  path('blog/', include('blog.urls'))
"""

from blog import views
from django.contrib import admin
from blog.views import CommentView
from django.urls import path, include
from django.conf.urls import url





urlpatterns = [
    path('admin/', admin.site.urls),
    path('post/post_list', views.post_list, name='post'),
   # path('', views.post_list, name='post_list'),
    path('post/<int:pk>/', views.post_detail, name='post_detail'),
    path('post/new/', views.post_new, name='post_new'),

    url(r'^watson/', CommentView.as_view(), name='comment'),
    #url(r'^posts/', BlogPosts.as_view(), name='comment'),
]



