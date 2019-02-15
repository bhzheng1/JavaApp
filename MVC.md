### 1. What are all the advanctages of MVC?
_Faster development process: MVC supports rapid and parallel development. If an MVC model is used to develop any particular web application then it is possible that one programmer can work on the view while the another can work on the controller to create business logic of the web application._  
_Ability to provide multiple views: Developers can create multiple views using the same model._  
_Modifications does not affect the entire model. For any web application, user interface tends to change more frequently than even the business rules of the company._
### 2. MVC's application life cycle.
_Application start -> Request -> Routing -> Controller Initialization -> Action Execution -> Result Execution -> (View Engine) -> Response_
### 3. Explain what Routing is in MVC along with attribute Routing
_Routing can be configured in RouterConfig.cs to add new routes using MapRoute function. Or use [Route] attribute to define special routes in controller._
### 4. Explain various action results in MVC.
_ViewResult, PartialViewResult, EmptyResult, ContentResult, JsonResult, FileResult, RedirectResult_
### 5. How do you pass data from Controller to View and from View to Controller?
_Use Model to pass data from Controller to View or View to Controller. Additionally, ViewBag can also pass data from Controller to View._
### 6. What are Partial Views in MVC? Give me some examples where you have used them?
_Partial Views are a part of view that can be returned from controller actions. It has it's own html code layout page and can be rendered inside a view. Example, there are several grid display several models with the same type. Each grid can be a partial view and render partial view several times with different model input._
### 7. Explain what are ViewBag, ViewData & TempData along with examples from your project.
_ViewData is a Dictionary of key and value. It's used to pass data from Controller to View. ViewBag is a wrapper of ViewData. TempData keeps data for the time of HTTP Request, which means that it holds data between two consecutive requests and only works during the current and subsequent request._
### 8. What are HTML Helpers and give me some examples and have your created any custom HTML Helpers?
_@Html.BeginForm("Action", "Controller", FormMethod.Post)_  
_@Html.InputFor(m => m.Id)_  
_Classes and id are defined within an annonymous object inside the helper function as a input parameter. It's not required._
```c#
public static class LabelExtensions
{
    public static string Label(this HtmlHelper helper, string target, string text)
    {
        return String.Format("<label for='{0}'>{1}</label>", target, text);
    }
}
```
### 9. What is ViewModel. What is the purpose of ViewModel. Could you explain on where you have used ViewModel?
_ViewModel is a model that you want to display in the view. The purpose of view model is to display the model in page or perform model validation and show error message in forms._
### 10. Could you explain all the filters in MVC and tell me what are all the custom filters that you have created. (Should at least explain Custom Authorization and Exception Filters)
_Authorization filters, Action filters, Result filters, Exception filters. Authorization filters performs authentication and authorizes before executing action method._  
_Authorization filter implements the IAuthorizationFilter interface. Action filters performs some operation before and after an action method executes implements IActionFilter.[Authorize]_  
_Action filters performs some operation before and after an action method executes._
_Result filter performs some operation before or after the execution of view result implements IResultFilter.[OutputCache]_  
_Exeception filters performs some operation if there is an unhandled exception thrown during the execution of the ASP.Net MVC Pipeline implements IExceptionFilter.[HandleError]_
### 11. How did you implement validations in MVC and how would you implement a custom validation in MVC?
_Use Data Annotation to validate data value. For example, specify data types or require, sometime require regular expression to validate strings. Also, use "ErrorMessage=" to customize error messages._  
_Custom validation implements ValidationAttribute and override IsValid method._
```c#
protected override ValidationResult IsValid(object value, ValidationContext validationContext)  
{  
    if (value != null)  
    {  
        string email = value.ToString();  
  
        if (Regex.IsMatch(email, @"[A-Za-z0-9._%+-]+@[A-Za-z0-9.-]+\.[A-Za-z]{2,4}", RegexOptions.IgnoreCase))  
        {  
            return ValidationResult.Success;  
        }  
        else  
        {  
            return new ValidationResult("Please Enter a Valid Email.");  
        }  
    }  
    else  
    {  
        return new ValidationResult("" + validationContext.DisplayName + " is required");  
    }  
} 
``` 
### 12. What are all the different state management techniques in ASP.Net(Server side: Sessions, Caching, Database, TempData & Client-side: localStorage, cookies, sessionStorage etc.)
_Session: Session state enables you to store and retrieve values for a user as the user navigates ASP.Net pages in a Web application. Session variables are saved in SessionStateItemCollection object that is exposed through the HttpContext.Session property. There are 5 session-sate modes: InProc, StateServer, SQLServer, Custom, Off._[Click here for more information](https://msdn.microsoft.com/en-us/library/ms178586.aspx)    

_Caching: ASP.Net provides two types of caching. OutputCaching allows you to store dynamic page and user control responses on any HTTP 1.1 cache-capable device in the output stream. The second type of caching is application data caching, which you can use to programmatically store arbitrary objects, such as application data, in server memory so that your application can save the time and resources it takes to recreate them._

_Temp data can be used in the subsequent request. TempData will be cleared out after the completion of a subsequent request._

_LocalStorage: aka DOM storage. Every time user return to the website, the local storage keeps all previous data. localStorage.setItem('', '')_

_SessionStorage: Session Storage object stores data only for one session. Data will be cleared once the browser tab is closed. sessionStorage.setItem('', '')_

_Cookie: Cookies are data stored in small text files, on user's computer. document.cookie+="username=mark"_
### 13. Describe the process of creating pages/page designing in MVC from initial to final step by using HTML & CSS. How the page styling can be done? What kind of tools it is required?
__

### 14. How would you display grid in Razor? How did you do Server-side pagination, and do you know about pagedList in MVC?
_In Razor, I would prefer using foreach to render different grid information. Or use a foreach loop with a partial view with a input model parameter. As for pagination, use entity framework with LINQ to .Skip() rows and .Take() certain amount of records then return records to view._[Click here for details about pageList](https://www.c-sharpcorner.com/article/paging-in-asp-net-mvc-4-using-pagelist/)