FROM gradle:6.7.1-jdk15 AS builder
WORKDIR /usr/project
COPY . .
RUN gradle build -x test

FROM adoptopenjdk/openjdk15:jdk-15.0.1_9-alpine-slim
WORKDIR /usr/run
COPY --from=builder /usr/project/build/libs/*.jar app.jar
ENTRYPOINT ["java","-jar","app.jar","--spring.profiles.active=dev"]
