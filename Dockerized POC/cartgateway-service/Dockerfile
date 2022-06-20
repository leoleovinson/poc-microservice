FROM adoptopenjdk/openjdk11:alpine-jre
EXPOSE 8094
ARG JAR_FILE=target/cartgateway-microservice.jar
ADD ${JAR_FILE} cartgateway-microservice.jar
ENTRYPOINT ["java","-jar","/cartgateway-microservice.jar"]