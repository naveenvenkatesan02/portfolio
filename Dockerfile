FROM openjdk:24-jdk
ADD target/portfolio.jar portfolio.jar
ENTRYPOINT ["java", "-jar", "/portfolio.jar"]