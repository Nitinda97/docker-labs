FROM openjdk:11
MAINTAINER nitin <nitin@gmail.com>
VOLUME /tmp
ARG JAR_FILE=target/students-info-0.0.1-SNAPSHOT.jar
COPY ${JAR_FILE} students-info.jar
ENTRYPOINT ["java","-jar","/students-info.jar"]