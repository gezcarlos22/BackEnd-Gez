FROM amazoncorretto:8-alpine-jdk

MAINTAINER Gez

COPY target/Gez-0.0.1-SNAPSHOT.jar Gez-app.jar

ENTRYPOINT ["java","-jar","/Gez-app.jar"]
