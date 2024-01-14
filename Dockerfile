FROM eclipse-temurin:17

LABEL mentainer="omrfth23@gmail.com "

WORKDIR /app

COPY target/blog-application-0.0.1-SNAPSHOT.jar /app/blog-application.jar

ENTRYPOINT ["java", "-jar", "blog-application.jar"]