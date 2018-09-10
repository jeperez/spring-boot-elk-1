# spring-boot-elk
Spring Boot + ELK with custom fields sending to Logstash:
 * `serviceName`
 * `serviceVersion`

##How to run

* Run ELK:
```
cd docker
docker-compose up --build
```

* Run microservice:
```
cd ..
./gradlew bootRun
```

* Send request to endpoint:
```
curl localhost:8080/api/log
```