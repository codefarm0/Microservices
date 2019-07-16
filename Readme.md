> A workshop of software architects held near Venice in May 2011 used the term "microservice" to describe what the participants saw as a common 
architectural style that many of them had been recently exploring
> A microservice is not a layer within a monolithic application (example, the web controller, or the backend-for-frontend[9]). 
Rather it is a self-contained piece of business functionality with clear interfaces, and may, through its own internal components, 
implement a layered architecture.
* Microservices is a specialization of an implementation approach for service-oriented architectures (SOA) used to build flexible, 
independently deployable software systems.
* The microservices approach is a first realisation of SOA that followed the introduction of DevOps and is becoming more popular for building 
continuously deployed systems.
From a strategy perspective, microservices architecture essentially follows the Unix philosophy of "Do one thing and do it well".
Martin Fowler describes a microservices-based architecture as having the following properties:[5]

* Naturally enforces a modular structure.
* Lends itself to a continuous delivery software development process. A change to a small part of the application only requires rebuilding and 
   redeploying only one or a small number of services.
* Adheres to principles such as fine-grained interfaces (to independently deployable services), business-driven development (e.g. domain-driven design).

It is quite common for such an architectural style to be adopted for 
* cloud-native applications,
* and applications using lightweight container deployment
* Robert C. Martin coined the term single responsibility principle which states “gather together those things that change for the same reason, 
and separate those things that change for different reasons.”
* A microservices architecture takes this same approach and extends it to the loosely coupled services which can be developed, deployed, 
and maintained independently. Each of these services is responsible for discrete task and can communicate with other services through simple
 APIs to solve a larger complex business problem.

## Features
* Service Granularity
	* A key step in defining a microservice architecture is figuring out how big an individual microservice has to be.
	* There is no consensus or litmus test for this, as the right answer depends on the business and organizational context.
	* Amazon's policy is that the team implementing a microservice should be small enough that they can be fed by two pizzas.
	* Many organizations choose smaller "squads" - typically 6 to 8 developers. But the key decision hinges around how "clean" 
	the service boundary can be.
* Linguistic approach
	* A linguistic approach to the development of microservices, focuses on selecting a programming language that can easily represent a 
		microservice as a single software artifact. 
	* When effective, the gap between architecting a project and deploying it can be minimized
	
* Technologies
* Service Mesh

