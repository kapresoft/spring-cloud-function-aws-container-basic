# spring-cloud-function-aws-container-basic
- Spring Cloud Function AWS Container (Basic)

> Uses spring profiles to control which function to execute

## AWS Lambda Configuration

### Handler
- com.kapresoft.springcloud.fn.aws.basic.LambdaInvoker

### Environment Variables

#### SPRING_PROFILES_ACTIVE

- "default" is uppercase
- lowercase
- both


## Build and Run

```shell
# Use script
$ ./doker-run.sh

# OR Manually

$ ./mvnw clean package
$ docker build -t spring-cloud-function-aws-container-basic .
$ docker run -p 9000:8080 spring-cloud-function-aws-container-basic
```

#### Curl Call
```shell
curl -XPOST "http://localhost:9000/2015-03-31/functions/function/invocations" -d '{"payload":"hello WORLD!"}' -v
```
#### Output:
>* Connection #0 to host localhost left intact
   {"request":"{\"payload\":\"hello WORLD!\"}","response":"{\"PAYLOAD\":\"HELLO WORLD!\"}"}* Closing connection 0


## See Also

- https://docs.aws.amazon.com/lambda/latest/dg/java-image.html
- https://hub.docker.com/r/amazon/aws-lambda-java
- https://gallery.ecr.aws/lambda/java
