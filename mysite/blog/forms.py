import json
from django import forms
from blog.models import Post

from ibm_watson import NaturalLanguageUnderstandingV1
#from ibm_watson.natural_language_understanding_v1 import Features, EntitiesOptions, KeywordsOptions
from ibm_watson.natural_language_understanding_v1 import Features, KeywordsOptions, EntitiesOptions, CategoriesOptions, EmotionOptions, SentimentOptions


from ibm_cloud_sdk_core.authenticators import IAMAuthenticator

authenticator = IAMAuthenticator('Bh11npE8h4phWth3lyBAh2Z3xsAj2GbHZHJdI21Sbap3')
service = NaturalLanguageUnderstandingV1(
    version='2019-07-12',
    authenticator=authenticator
)



class PostForm(forms.ModelForm):

    class Meta:
        model = Post
        fields = ('title', 'text',)



class Analise():
	
	def watson(input_text):
		response = service.analyze(text=input_text,features=Features(sentiment=SentimentOptions(),keywords=KeywordsOptions())).get_result()
		print(json.dumps(response, indent=2))
		return json.dumps(response, indent=2)



class CommentForm(forms.Form):
	comment = forms.CharField(label="Comment", widget=forms.Textarea(attrs={'rows': 10}), required=True)

	def ask_watson(self):
		input_text = self.cleaned_data['comment']
		
		response = service.analyze(
		    text=input_text,
		    features=Features(entities=EntitiesOptions(),
				      keywords=KeywordsOptions())).get_result()

		#response = service.analyze(text="isso eh um teste", features=Features(entities=EntitiesOptions(), keywords=KeywordsOptions())).get_result()
		return json.dumps(response, indent=2)





