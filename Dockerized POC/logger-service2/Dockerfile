FROM openjdk:17
EXPOSE 8092
ARG JAR_FILE=target/logger-microservice.jar
ADD ${JAR_FILE} logger-microservice.jar
ENTRYPOINT ["java","-jar","/logger-microservice.jar"]