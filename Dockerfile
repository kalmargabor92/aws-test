#docker build . -t aws-test
FROM gradle:7.6.1-alpine AS build
COPY --chown=gradle:gradle ./ /home/gradle/src
WORKDIR /home/gradle/src
RUN gradle build --no-daemon

FROM openjdk:17-jdk-slim

EXPOSE 8080

RUN mkdir /app

COPY --from=build /home/gradle/src/build/libs/aws-test-0.0.1-SNAPSHOT.jar /app/aws-test.jar

ENTRYPOINT ["java", "-jar", "/app/aws-test.jar"]
