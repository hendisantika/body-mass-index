FROM maven:3.9.6-eclipse-temurin-21-alpine AS build

RUN mkdir /project

COPY . /project

WORKDIR /project

RUN mvn clean package

#FROM adoptopenjdk/openjdk21:eclipse-temurin-21-alpine
FROM bellsoft/liberica-openjdk-debian:21
LABEL maintainer="hendisantika@yahoo.co.id"

RUN mkdir /app

RUN addgroup -g 1001 -S tecogroup

RUN adduser -S teco -u 1001

COPY --from=build /project/target/bmi-1.0.jar /app/bmi.jar

WORKDIR /app

RUN chown -R hendi:hendigroup /app

CMD java $JAVA_OPTS -jar bmi.jar
