#FROM JAVA8
#EXPOSE 8888:8888
#ADD /target/dockerExampleName.jar dockerExampleName.jar
#ENTRYPOINT ["jar","-jar","dockerExampleName.jar"]


FROM openjdk:latest
EXPOSE 8888
ARG JAR_FILE=target/dockerExample-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} dockerExample-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/dockerExample-0.0.1-SNAPSHOT.jar"]