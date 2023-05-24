FROM openjdk:17

WORKDIR /app

COPY build/libs/*.jar monorepo.jar
CMD ["java", "-jar", "monorepo.jar"]