# spring-boot-elk
Spring Boot + ELK with custom fields sending to Logstash:
 * `serviceName` - name of service
 * `serviceVersion` - current version of service
 * `X-Request-ID` -  Request ID from HTTP Header (if missing - generate random UUID)

## How to run

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

* Send requests to endpoint:
```
curl http://localhost:8080/api/log
curl -H 'X-Request-ID:helloWorld' http://localhost:8080/api/log
```