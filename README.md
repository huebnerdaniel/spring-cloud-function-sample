# Getting to know spring-cloud-function with AWS

## (manual) Deploy to AWS

* `mvn clean package`
* Log into AWS (sandbox account)
* Go to Lambda, create new function, choose Java 11 and "Create function"
* Upload and configure the fat jar
* Handler: `org.springframework.cloud.function.adapter.aws.FunctionInvoker::handleRequest`
* Test the code with the test tab, you always have to define an input (even for Supplier) in JSON (e.g. {"value": <put the input here, depending on the deployed function>})
* Add scheduled rule to trigger the function in Amazon EventBus

## Resources
* https://docs.spring.io/spring-cloud-function/docs/3.2.1/reference/html/
* https://docs.spring.io/spring-cloud-function/docs/3.2.1/reference/html/aws.html
* https://github.com/spring-cloud/spring-cloud-function/tree/main/spring-cloud-function-samples/function-sample-aws
* https://docs.aws.amazon.com/AmazonCloudWatch/latest/events/RunLambdaSchedule.html