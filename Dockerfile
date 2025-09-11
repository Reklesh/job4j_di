FROM maven:3.9-eclipse-temurin-21

RUN mkdir job4j_di

WORKDIR /app/job4j_di

COPY . .

RUN mvn clean package -DskipTests

CMD ["java", "-jar", "target/main.jar"]