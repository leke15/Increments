FROM openjdk:21
WORKDIR /app
COPY . /app
RUN javac *.java
CMD java Main