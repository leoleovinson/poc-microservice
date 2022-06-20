FROM adoptopenjdk/openjdk11:alpine-jre
EXPOSE 8091
ARG JAR_FILE=target/product-microservice.jar
ADD ${JAR_FILE} product-microservice.jar
ENTRYPOINT ["java","-jar","/product-microservice.jar"]