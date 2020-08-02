package xPath;

public class CustomXpath {

	public static void main(String[] args) {
		
		/*
		

		1.//html[@attribute = 'val'] 
		2.//html[contains(@att,'val')]
		3.//html[text()='val']
		4.//html[contains(text(),'val')]
		5.//html[starts-with(@id,'value')] 
		6.(data).[i] 
		7.Position function in xpath: (data)[position()=1]
		8.Last function in xpath: (data)[last()]
		9.and operator

1st.  //input[@id='username' and @type = 'email' and @class = 'form-control private-form__control login-email']
2nd. //input[contains(@id,'username') and contains(@type,'emai') and @class and contains(@id,'')]
3rd. //footer[text()='2020']
4th. //footer[contains(text(),'2020')]
5th. //input[starts-with(@id,'username') and contains(@type,'emai') and @class and contains(@id,'')]
6th. (//div[@class = 'private-form__input-wrapper'])[2]
7th. (//div[@class = 'private-form__input-wrapper'])[position() = 2]
8th. (//div[@class = 'private-form__input-wrapper'])[last()]
9th. done.



----------------------------2nd class of Xpath_2_advance----------------------------------------


1./..          				 //input[@id='username']/../..
2.//parent::tag				//input[@id='username']//parent::div
3.//child::tag				//div[@class = 'private-form__input-wrapper']//child::input
4.//ancestor::tag			//div[@class = 'private-form__input-wrapper']//child::input//ancestor::div
5.//preceding-sibling::tag //a[@_id='52754374']//parent::td//preceding-sibling::td/input[@type='checkbox']
6.//following-sibling::tag  //a[@_id='52754374']//parent::td//preceding-sibling::td/input[@type='checkbox']/..//following-sibling::td

----------------------------3nd class of CSS Selector----------------------------------------

id  #id or  htmltag#id
class .class or html.class


1.#id or html#id

#username  || input#username

2. .c1.c2.c3.c4...cn or html.c1.c2...cn. 

.form-control.private-form__control.login-email  || input.form-control.private-form__control.login-email

3 .onlyclassName. or html.onlyclass.

.login-email  || input.login-email

4. tag#id.class //  tag.class#id

input.login-email#username  || input#username.login-email

--------If no id or class for Css:---

  tag[attribute='value']    || input[id ='username']
//tag[@attribute='value']  -:for xpath

For two attribute , we will create another [] but in xpath we could use and operator.

input[id ='username'][class = 'form-control private-form__control login-email']  

tag[attribute1][attribute2] is also correct as it is searching for Css having these 2 attribute , value does not matter.

input[id][class]

for direct child , put a space and write childname.   this will give dir+ind child

div.private-form__set.m-bottom-4 div


tag.class childname -- this will give dir+ind child or can use > also as tag.class > childname  --this will give u only direct child

div.private-form__set.m-bottom-4 > div

--- contains: * means contains

tag[attribute*='value']
input[id*='name']

---starts-with:  ^ means starts with

tag[attribute^='value']
input[id^='user']


--ends with  $ means ends with

tag[attribute$ = 'value']
input[id$='ame']

-- comma in CSS:

tag#id, tag.class, tag#id -->> these are list value of 3 element alltogether ebing comma separated  
this is useful in case of usig is.displayed() function to check each fields existence line by by , so this comma separated single line code will help to get result in single line.
this is the advantage of Css over xPath.

input[id$='ame'], div.private-form__input-wrapper,  div.signup-link

special element of same tag:

tag.classname childclass:nth-of-type(i) for indexing
write (n) for all the elements.

in CSS we cant perform backward traversing , but can perform forward sibling. 
+ tag

so css is not prefered for webtable

---not operator in CSS:

to exclude on tag specefic

:not(.unique class name )



























*/
	}

}
