## Angular (2.0/4.0+ questions)
#### What is lazy loading in Angular? 
_Lazy loading is a technique in Angular that allows coder to load JavaScript components asynchronously when a specific route is activated. This can add some initial performance during the initial load._

#### What is AOT compilation? 
_AOT represent Ahead-of-Time compiler. The AOT compiler converts your Angular HTML and TypeScript code into efficient JavaScript code during the build phase before the browser downloads and runs that code. Compiling your application during the build process provides a faster rendering in the browser._

#### What are some differences between Promises and Observables? 
_Promise is usually only use with async data return and not easy to cancel. Observable is cancellable, and it stream data in multiple pipe lines, having array-like operations like map, filter etc._

#### What is the purpose of EventEmitter? 
_Event emitter as it sounds is just something that triggers an event to which anyone can listen._
_List the Angular lifecycle hook methods. _
_ngOnChanges() – Respond when Angular (re)sets data-bound input properties. The 	method receives a SimpleChanges object of current and previous property values._
_ngOnInit() – Initialize the directive.component after Angular first displays the data-	bound properties and set the directive/component’s input properties_
_ngDoCheck() -- Detect and act upon changes that Angular can't or won't detect on its 	own. Called during every change detection run, immediately after 	ngOnChanges() and ngOnInit()._

_ngAfterContentInit() -- Respond after Angular projects external content into the 	component's view / the view that a directive is in. Called once after the first 	ngDoCheck()._

_ngAfterContentChecked() -- Respond after Angular checks the content projected into the 	directive/component. Called after the ngAfterContentInit() and every subsequent 	ngDoCheck()._

_ngAfterViewInit() -- Respond after Angular initializes the component's views and child 	views / the view that a directive is in. Called once after the first 	ngAfterContentChecked()._

_ngAfterViewChecked() -- Respond after Angular checks the component's views and child 	views / the view that a directive is in.Called after the ngAfterViewInit and every 	subsequent ngAfterContentChecked()._

_ngOnDestroy() -- Cleanup just before Angular destroys the directive/component. 	Unsubscribe Observables and detach event handlers to avoid memory leaks. Called just before Angular destroys the directive/component._
