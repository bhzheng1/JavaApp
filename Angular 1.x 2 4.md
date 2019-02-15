### 1. What is Single Page Application?
_A SPA is a website that re-renders its content in response to navigation actions without making a request to the server to fetch new HTML._
### 2. What is typescript in angular?
_Angular is built entirely in TypeScript, and Angular will transalte TypeScript to efficient javascript when receive user requests._
### 3. What's the difference between $scope and $rootScope(1.x)
_$scope is an object that is accessible from current component, service only. $rootScope can be accessed everywhere, consider it as a global variable._
### 4. How do you pass data from controller to controller(similarly from component to component in Angular 4)
_Share data inside a service_
### 5. How do you create a two-way binding in Angualr?
_use ngModel_

```html
<input [(ngModel)] = "username">

<p>{{ username }}</p>
```
### 6. What's a parent component and a child component, why do you use them? How you pass data from a parent component to a child component and vice versa? (Angualr 4)
### 7. How do you submit a form?
_In HTML form tag set action, target, and method. Action with url, target can create a new page and method can be GET or POST_
### 8. What's the difference between NgForm, FormGroup and FormControl? How do they work together?
_FormGroup: A FormGroup aggregates the values of each child FormControl into one object, with each control name as the key. It calculates its status by reducing the status values of it children. For example, if one of the controls in a group is invalid, the entire group becomes invalid._  
_NgForm: Creates a top-level FormGroup instance and binds it to a form to track aggregated form value and validation status._
_FormControl: Tracks the value and validation status of an individual form control_
### 9. What are the new features of Angular 4? Why you used Angular 4?
_Router ParamMap: this.route.queryParamMap.map()_  
_Animations: Animations are to be provided in the module BrowserAnimationsModule from @anuglar/platform-browser/animations_  
_ngIf: can also be used with else_  
_New Pipe: Title Case_
_Angular CLI_
### 10. What's the difference between dirty, touched and pristine on a form element?
_$touched true if control has lost focus._  
_$dirty true if user has already interacted with the control_  
_$pristine true if user has not interacted with the control yet_
### 11. How can you access validation errors in the template to display error messages?
### 12. What is Async validation eand how it is done?
### 13. What is the purpose of NgModule
### 14. How did you organize your Angular project? Explain the folder structure etc.?
### 15. What is #Inputs and Outputs in Angular 4? How do components communicate with each other?
### 16. What are directives, give me examples of built-in directives and custom directives you created
### 17. Explain pipes or filters (AngularJS), how do you create custom pipes
_Pipes were called as filters in AngularJS. There are some default builtin pipes like date, currency, uppercase..._  
```typescript
import { Pipe, PipeTransform } from '@angular/core';

@Pipe({name: 'reverseStr'})
export class ReverseStr implements PipeTransform {
  transform(value: string): string {
    let newStr: string = "";
    for (var i = value.length - 1; i >= 0; i--) {
      newStr += value.charAt(i);
    }
    return newStr;
  }
}
```

```typescript
import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule } from '@angular/forms';
import { HttpModule } from '@angular/http';

import { AppComponent } from './app.component';
import { ReverseStr } from './reverse-str.pipe.ts';

@NgModule({
  declarations: [
    AppComponent,
    ReverseStr
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
```
### 18. What is an Angular 2 Service? What are the features of Angular 2 Service?
### 19. How do you make Ajax calls in Angular (HttpClient in Angular 4) $http in AngularJS?
_In Angular 4, create a service with HttpClient and use the servicec in components. The HttpClient returns Observable<>. In Angular JS, $http.get or $http.post with 2 parameters of path and data. _
### 20. What is router-outlet directive an Angular 4? Explain how routing works in Angular and what are Route Guards?
### 21. Explain your Angular Project/folder/directory structure
### 22. Did you use commands on Angular CLI or only build and deployment? Which commands you have used in angular CLI?
### 23. What are Observables? Where did you use them, explain forkJoin, combinelatest, mergemap operators in relation with Http and Angular?
### 24. What is SPA (Single page application)
### 25. Diff AngularJs & Angular 4
### 26. Working with data
  a. What is interpolation  
  b. Property binding  
  c. Attribute binding  
  d. Class binding  
  e. Style binding
### 27. What is directives, create custom directives and use built-in directives
  a. left navigation ng-for with bootstrap list group
  b. Small cards ng-for with bootstrap card
  c. Ng-if, to display links for authenticated and admin users
  d. Bootstrap navbar to display navigation and logo
  e. Put the footer
### 28. Collecting data from user, working with form, ng-model (two-way binding), event binding, click event…
### 29. Template driven forms
### 30. Form validation
### 31. Dependency injection, injecting services into component
  a. Inject services into component(movieService, genreService)
### 32. Routing and navigation
  a. canActivate:[Route guard]
### 33. Learn how to use Postman to test Rest API's
### 34. Token Based Authentication (JWT)

