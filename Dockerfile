FROM adoptopenjdk/openjdk11:ubi
VOLUME /tmp
EXPOSE 8080
RUN mkdir -p /app/
RUN mkdir -p /app/logs/
ARG JAR_FILE=target/base-app-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} /app/app.jar
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom --spring.config.location=classpath:file:application.properties","-Dspring.profiles.active=container", "-jar", "/app/app.jar"]