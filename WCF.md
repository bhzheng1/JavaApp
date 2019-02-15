### 1. Difference between WCF and Web API, advantages of WCF over old asmx web service
_WCF is based on SOAP and return data in XML, which uses more resources than REST. Web API is used for building HTTP services with easy and simple way. Web Service supports only HTTP protocol and can only be hosted on IIS. WCF supports TCP, HTTP, HTTPS, named Pipes, MSMQ._
### 2. What is 'ABC' in WCF?
_A is the address of the service that you want to communicate with; B is the binding; C is for the contract_
### 3. How did you secure your WCF service?
_Services can be identified with either user principal names (UPNs) or service principal names(SPNs). Services runnign under machine accounts such as network service have an SPN identity corresponding to the machine they're running. "setspn" tool can be used to assign an SPN to the user account._
_Use X509 Certificates Instead of NTLM. Reasons why prefer X509 are: the availability of mutual authentication; the use of stronger cryptographic algorithms, and the greater difficulty of utilizing forwarded X509 credentials._
### 4. How can you consume a WCF or SOAP Service, what is svcutil.exe?
_Add a Service Reference in project and use the service namespace. Svcutil is called ServiceModel Metadata Utility Tool which can generate code from running service and static metadata documents. Exports metadata documents from compiled code. validates compiled service code. Downloads metadata documents from running services._
### 5. How can you host a WCF service?
_On IIS, WAS_
### 6. Explain different contracts in WCF.
_Service Contract: A service contract defines the operations which are exposed by the service to the outside world. A service contract is the interface of the WCF service and it tells the outside world what the service can do._  

_Operation Contract: It defines the parameters and return type of an operation._  

_Data Contract: Data Contract defines the data type of the information that will be exchange between the client and the service._  

_Message Contract: Message contract defines the elements of a message like MessageHeader, MessageBody, as well as the message-related settings, such as the level of message security._  

_Fault Contract: Fault contract defines errors raised by the service, and how the service handles and propagates errors to its client._