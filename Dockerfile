FROM openjdk:8-jdk-alpine

#ARG JAVA_OPTIONS=
#ARG SPRING_OPTIONS=

VOLUME /tmp
COPY ./build/libs/sc-0.0.1-SNAPSHOT.jar app.jar

ENTRYPOINT ["sh", "-c", "/usr/bin/java $JAVA_OPTIONS $SPRING_OPTIONS -jar app.jar"]
