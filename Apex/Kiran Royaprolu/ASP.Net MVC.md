## ASP.NET MVC

#### What is the Razor View engine? 
_Razor is an ASP.Net programming syntax used to create dynamic web pages with C# or VB.Net programming languages._

#### What are HTML Helpers?
_Html Helper class is used to create HTML Controls programmatically. HTML Helpers are used in View to render HTML content. Like HtmlHelper.LabelFor, InputFor_

#### Describe ASP.NET routing? Do physical pages have to exist at the URL?
_ASP.Net routing enables user to use URLs that do not have to map into specific file in a website. Because the URL doesn’t have to map to a file, user can use URLs that are descriptive of the user’s action and therefore are more easily understood by users._

#### Where in an ASP.NET MVC application are the settings involved in setting up routing. 
_RouterConfig.cs if in .Net Core MVC is in the Startup.cs_

#### What are some of the return types the controller action method supports? 
_Most frequent used return type is ActionResult. Action result includes ViewResult, PartialViewResult, RedirectResult, RedirectToRouteResult, ContentResult, JsonResult, JavaScriptResult, FileResult, EmptyResult._

#### What are the 3 type of action filters? 
_OutputCache – This action filter caches the output of a controller action for a specified amount of time_
_HandleError – This action filter handles errors raised when a controller action executes_
_Authorize – This action filter enables you to restrict access to a particular user or role_