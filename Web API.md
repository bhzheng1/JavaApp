### 1. What is the difference between SOAP and REST services. Which one do you prefer & why?
_SOAP is a protocal and REST is an architectural style. SOAP requires more bandwidth and resources and REST is easier to implement, with less bandwidth and resources. REST permits many different data formats like XML, plain text, JSON where as SOAP only permits XML._
### 2. Why did you use REST services and what framework did you use to create REST based services?
_REST is easier to implement and use less bandwidth and resources. ASP.Net Web API 2, Nodejs or PHP_
### 3. What are the advantages of REST services?
_REST supports different content format and use less resources._
### 4. Differences between GET, POST, PUT, DELETE & PATCH.
_GET is used to get content from api; POST used to send data to api; PUT used to add new resource; DELETE used to remove resource; PATCH used to update existing resource._
### 5. All the HTTP Status Codes (especially 2XX, 4XX and 5XX ones)
_200 OK, 201 Created, 202 ACCEPTED, 400 Bad Request, 401 Unauthorized, 403 Forbidden, 404 Not Found, 409 Conflict, 500 Internal Server Error, 502 Bad Gateway, 503 Service Unavailable_
### 6. How would you secure a Web API and what is token-based authentication in Web API?
_Use authentication to secure api. Like Role-based or token-based authentication method. Token-based authentication is when user submit the first call with username and password, server will return a token which can be added to header or cookies in future calls. In this case, user will not need to submit username and password every time._
### 7. Difference between JSON and XML
_XML is a markup language whereas JSON is a way of representing objects. JSON looks more like a datas tructure and XML uses tags as property names_
### 8. How would you handle exceptions in Web API? Which framework did you use to log those exceptions?
_Return proper HTTP Status code if error occurs and definetely not return exception trace to user. Or create customize exception handler and inherit from Exceptionhandler, replace the default exception handler. Log4Net_
### 9. How did you consume your RESTful / Web API services? (Need to know how to consume using c# with HttpClient, ajax in jQuery, JS and Angular and tool such as Postman)
_c#_

```c#
HttpClient client = new HttpClient();
HttpResponseMessage message = await client.GetAsync("url");
```
_jQuery_
```js
$.get('url', (data) => {console.log(data)});
```
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
_Angular_
```ts
import { HttpClient } from '@angular/common/http';
@Injectable()
export class ConfigService{
    constructor(private http:HttpClient){}
}

function() {
    return this.http.get('url');
}
```

### 10. Explain about HttpClient in .Net 4.5
_Add reference of System.Net.Http to use HttpClient in .Net 4.5_
### 11. How to do unit testing in web api? What tools you use to test web api?
_Create test project in visual studio to perform unit test for web api project. Or use postman or fiddler for testing_
