FROM openjdk:11-slim
COPY ./build/libs/simple-kubernetes-latest.jar /usr/app/
WORKDIR /usr/app
ENTRYPOINT ["java", "-jar", "simple-kubernetes-latest.jar"]
EXPOSE 8000