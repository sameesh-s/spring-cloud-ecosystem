# Client Application
* Calls another application service to implement its functionality  
* The issuer of requests  
* Depends on other services  
* User of the discovery client
	Find service locations  
	
1 The difference between client application and service application is that client dosn't need to register itself with the discovery server so the application.property file includes the below lines.  
`eureka.client.service-url.defaultZone=http://localhost:8761/eureka`
`eureka.client.register-with-eureka=false`  
2 Insert the `@EnableDiscoveryClient` in the main application  

## Discovering Services as a Client: Two Options  
* Eureka server specefic  
	@Inject
	EurekaClient client  
	InstanceInfo instance = eurekaClient.getNextServerFromEureka("service-id", false); 
	String baseUrl = instance.getHomePageUrl();  
	#it will give the baseUrl to call using the rest template  
 
	It will pick the next server in round robin fashion, "service-id" will be the same as the -> spring.application.name  
	2nd argument whether it need to be secure or not (https)  


* Discovery server agnostic  
	@Inject
	DiscoveryClient client  
	List<ServiceInstance> instances = client.getInstances("service-id");  
	String baseUrl = instances.get(0).getUri().toString();  

  

