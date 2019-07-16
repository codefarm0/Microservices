# Detail of the project
## Design of the project
The design has been expalined in following ppt - 
* https://github.com/greenlearner01/Microservices/blob/master/ppt/Rest_application_with_spring_boot.pptx

## Youtube video to explain the code base

* <TBD> will post soon

## How to run the project
* Clone it to local
* Now there are two ways to run the project
  * First- running jar file
    * navigate to <userManagementApp> directory from command prompt
    * execute below command
    
            gradlew clean build 
            
       this will create the jar file inside build/libs
    * go to /build/libs and execute > java -jar <name of the jar>.jar
  * Sencond way - Directly running the main method
    * Open the project in IntelliJ Idea or eclipse
    * And run the main method inside UserManagementAppApplication.java
* The app will run on port 8082

## End point urls - 

* AddUser - Post method > http://localhost:8082/user
        
        Request body - 
        {
          "id": "1234",
          "name": "green learner123",
          "address": "delhi"
        }
        
* update user - Put method > http://localhost:8082/user
        
        Request body - 
        {
          "id": "1234",
          "name": "green learner123-updated",
          "address": "delhi-updated"
        }
        
* Get single user - GET method > http://localhost:8082/user/123
* Get all the users - GET method > http://localhost:8082/users
* Delete user - DELETE method >  http://localhost:8082/user/123
