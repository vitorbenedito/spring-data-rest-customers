# Tests with Spring Data and Spring MVC

## Running project
mvn jetty:run

## Resources
http://localhost:8080/

```json
{
  "links" : [ {
    "rel" : "customers",
    "href" : "http://localhost:8080/customers"
  }, {
    "rel" : "contacts",
    "href" : "http://localhost:8080/contacts"
  } ],
  "content" : [ ]
}
```

## Tests
mvn test

```
-------------------------------------------------------
 T E S T S
-------------------------------------------------------
Running com.blogspot.devmute.customers.CustomerApiTest
21:23:18.955 [main] DEBUG o.s.web.client.RestTemplate - Created POST request for "http://localhost:8080/customers"
21:23:18.960 [main] DEBUG o.s.web.client.RestTemplate - Writing [{"name":"Vitor Nunes", "contacts":[{"number":"997861092","areaCode":"12"}]}] using [org.springframework.http.converter.StringHttpMessageConverter@101df177]
21:23:18.997 [main] DEBUG o.s.web.client.RestTemplate - POST request for "http://localhost:8080/customers" resulted in 201 (Created)
21:23:19.006 [main] DEBUG o.s.web.client.RestTemplate - Created GET request for "http://localhost:8080/customers"
21:23:19.159 [main] DEBUG o.s.web.client.RestTemplate - Setting request Accept header to [application/json, application/*+json]
21:23:19.172 [main] DEBUG o.s.web.client.RestTemplate - GET request for "http://localhost:8080/customers" resulted in 200 (OK)
21:23:19.172 [main] DEBUG o.s.web.client.RestTemplate - Reading [org.springframework.hateoas.Resource<java.util.List<org.springframework.hateoas.Resource<com.blogspot.devmute.customers.model.Customer>>>] as "application/json" using [org.springframework.http.converter.json.MappingJacksonHttpMessageConverter@2c34f934]
21:23:19.203 [main] DEBUG o.s.web.client.RestTemplate - Created GET request for "http://localhost:8080/contacts"
21:23:19.216 [main] DEBUG o.s.web.client.RestTemplate - Setting request Accept header to [application/json, application/*+json]
21:23:19.225 [main] DEBUG o.s.web.client.RestTemplate - GET request for "http://localhost:8080/contacts" resulted in 200 (OK)
21:23:19.226 [main] DEBUG o.s.web.client.RestTemplate - Reading [org.springframework.hateoas.Resource<java.util.List<org.springframework.hateoas.Resource<com.blogspot.devmute.customers.model.Contact>>>] as "application/json" using [org.springframework.http.converter.json.MappingJacksonHttpMessageConverter@2c34f934]
Tests run: 1, Failures: 0, Errors: 0, Skipped: 0, Time elapsed: 0.942 sec

Results :

Tests run: 1, Failures: 0, Errors: 0, Skipped: 0

[INFO] ------------------------------------------------------------------------
[INFO] BUILD SUCCESS
[INFO] ------------------------------------------------------------------------
[INFO] Total time: 5.471 s
[INFO] Finished at: 2016-04-18T21:23:19-03:00
[INFO] Final Memory: 11M/159M
[INFO] ------------------------------------------------------------------------
```