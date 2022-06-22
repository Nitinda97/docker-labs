Spring Boot Student CRUD Application using H2 Base database

dockerfile :

this dockerfile will build the image using the package build which means it will simply execute the jar file 
so the task of creating the jar file is to be done by the developer using any build tool for eg maven

dockerfile_normal:

this dockerfile will build the image using the normal build process which means it will first create a jar file
using the maven build tool and then execute that jar file using the java -jar command.

dockerfile_multi_stage:

this dockerfile will build the image in stages,
it will first build the jar file using the maven build tool then
it will copy the jar file and discard everything else
then it will execute this jar file using the java -jar command 
This docker image would be of a lesser size than the image created using dockerfile_normal as it does not contain the src code
