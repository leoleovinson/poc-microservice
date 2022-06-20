FROM adoptopenjdk/openjdk11:alpine-jre
EXPOSE 8093
ARG JAR_FILE=target/cart-microservice.jar
ADD ${JAR_FILE} cart-microservice.jar
ENTRYPOINT ["java","-jar","/cart-microservice.jar"]