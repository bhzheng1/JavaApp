### 1. What is your experience with JS? Have you used any JS libraries/frameworks?
_Yes, jQuery, Bootstrap, underscore etc. Frameworks: Angular, React_
### 2. What is the diff between == and ===?
_=== is strictly equal. 0 == false is true but 0 === false is false_
### 3. How can you use JS/jQuery/Angular to consume a web service (REST with JSON)?
_JS_
```js
var xhr = new XMLHttpRequest();

xhr.onreadystatechange = function() {
    if (this.readyState == 4 && this.status == 200) {
        console.log(JSON.parse(this.responseText));
    }
};
xhr.open("GET", 'url', true);
xhr.send();
```
### 4. Tell me your experience with responsive web design (Bootstrap)
_In the first page set viewport in meta tag_
```html
<meta name="viewport" content="width=device-width, initial-scale=1.0">
```
_Use grid width class to set element width. Usually grid layout contains 12 columns_
### 5. What is your experience with jQuery? Why did you use jQuery? Tell me sceanarios where you used jQuery
_Easier to call REST like $.get or $.post. Easier to get input element values like $("#id").val()_
### 6. What are the different selectors in jQuery?
_#id, .class, element tag like $("p"), also include other properties like focused $(":focus")_
### 7. Explain Promises in JS along with its use case?
_Promises represent eventual result of an asynchronous operiation. It is usually used in ajax calls, or customize promises with resolve and reject._
### 8. Explain Closures in JavaScript and where id you use?
_Closures is an inner function that has access to outer function's variables and global variables. You can use it for method encapsulation._
```js
a = (function () {
    var privatefunction = function () {
        alert('hello');
    }

    return {
        publicfunction : function () {
            privatefunction();
        }
    }
})();
```
_privatefunction cannot be called directly from a but publicfunction can_
### 9. What are Prototypes in JavaScript and what is their purpose?
_When you create a constructor, js engine automatically add prototype property to constructor which you can add property to it._
```js
function TestFunc()
{

}

TestFunc.prototype.name = "1";
TestFunc.prototype.sayName = function() { console.log(this.name); };

var a = new TestFunc();
a.sayName();
//console shows "1" and undefined because the sayName function doesn return anything;
```
### 10. Explain Callbacks in JS
_Callback is a function that is going to be executed after another function has finished executing._
```js
function Func1(obj, callback){
    console.log(obj);
    callback();
}

Func1(1, () => {console.log(2);});

//Which Func1's content will be executed first and then 2 will be output to console.
```
### 11. Explain hoisting in JavaScript
_Hoisting is JavaScript's default behavior of moving all declarations to the top of the current scope._
```js
x = 1;
var x;
```
```js
var x;
x = 1;
```
### 12. What is XMLHttpRequest and how can you consume an API in plain JavaScript without any library?
_XMLHttpRequest is use to interact with servers, this can be used to retrieve any type of data not just like XML but file as well._
### 13. Tell me how to make an AJAX call using jQuery
```js
$.ajax(
    url: 'api/demo',
    method: 'GET',//or 'POST'
    //data: {}  if post data
).done((d) => {}) //success
.fail(() => {}) //fail
.always(() => {}) 
```
### 14. How would you handle exceptions or errors in the front end(globally)?
_Define window.onerror to handle error or exceptions_
### 15. How would you debug yoru JS?
_In chrome use developer tools console, in Firefox use FireBug_
### 16. Tell some of the tabs you know in chrome Developer tools and what can you do with those?
_Console: show error, warning, or log messages; Network: show network traffic like get post etc.; Elements: show page elements with styles_