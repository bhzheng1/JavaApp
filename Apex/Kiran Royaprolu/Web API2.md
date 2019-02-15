## Web API
#### Describe the Get Verb and implementing it in Web API. 
_The GET method requests a representation of the specified resource. Requests using GET should only retrieve data. [HttpGet]_

#### Describe the POST verb and implementing it in a Web API. 
_Post is used to submit entity to the specified resource often causing a change in state or side effects on the server. [HttpPost]_

#### Describe implementing a Delete command in Web API? What are some things you should check before committing a delete in your controller method? What are some possible responses from a DELETE command? 
_Delete method deletes the specified resource. You should check the resource exists or not. HTTP 200, 202, 400, 403, 404, 405_

#### In General, why is it a bad idea to pass back an exception message from a 500 internal error containing the thrown exception?
_This may cause logic to expose to public and people may take advantages to hurt the network_
#### How would you implement an Async action on a Web API controller?
_Public async Task<>…_
