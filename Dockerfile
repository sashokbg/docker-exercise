FROM openjdk:11

ADD target/docker-exercise-0.0.1-SNAPSHOT.jar app.jar
ADD wait-for-it.sh wait-for-it.sh

CMD ["./wait-for-it.sh", "some-mariadb:3306", "--", "java", "-jar", "app.jar"]
