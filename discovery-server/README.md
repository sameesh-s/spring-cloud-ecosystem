# Discovery Server

In this folder we solely focus on how to create and up discovery server and what are the ways and why we need the discovery server.  
2. after unziping and importing the project add annotation `@EnableEurakaServer` to the main class  
when you try to run the application you will get an exception: it is occureing because the our Eureka server is waiting to register itself, for a standalone server we dosn't need that but in big arch we might be using two or more discovery server at that time it will be useful, for now we can disable the poling using,  
add below entry to the application.properties  
 eureka.client.register-with-eureka=false  
 eureka.client.fetch-registry=false
