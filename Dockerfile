FROM amazoncorretto:11-alpine-jdk
MAINTAINER Gez
COPY target/Gez-0.0.1-SNAPSHOT.jar GezFinalapp.jar
ENTRYPOINT ["java","-jar","/GezFinalapp.jar"]
EXPOSE 8080