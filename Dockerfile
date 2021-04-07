FROM openjdk:8
ADD target/Docker-SpringBoot.jar Docker-SpringBoot.jar
EXPOSE 8085
ENTRYPOINT ["java" , "-jar", "Docker-SpringBoot.jar"]