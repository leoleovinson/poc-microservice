FROM adoptopenjdk/openjdk11:alpine-jre
ARG JAR_FILE=target/grpc-microservice.jar
ADD ${JAR_FILE} grpc-microservice.jar
ENTRYPOINT ["java","-jar","/grpc-microservice.jar"]