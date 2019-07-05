FROM openjdk:8-jre

MAINTAINER DCH <837665436@qq.com>

#ENV APP_VERSION 1.0.0-SNAPSHOT
ENV DOCKERIZE_VERSION v0.6.1
RUN wget https://github.com/jwilder/dockerize/releases/download/$DOCKERIZE_VERSION/dockerize-linux-amd64-$DOCKERIZE_VERSION.tar.gz \
    && tar -C /usr/local/bin -xzvf dockerize-linux-amd64-$DOCKERIZE_VERSION.tar.gz \
    && rm dockerize-linux-amd64-$DOCKERIZE_VERSION.tar.gz

RUN mkdir /app

COPY hello-spring-cloud-zipkin-1.0.0-SNAPSHOT.jar /app/app.jar
ENTRYPOINT ["dockerize", "-timeout", "5m", "-wait", "http://172.26.0.51:8888/zipkin/prod/master", "java", "-Djava.security.egd=file:/dev/./urandom", "-jar", "/app/app.jar", "--spring.profiles.active=prod"]

EXPOSE 9411