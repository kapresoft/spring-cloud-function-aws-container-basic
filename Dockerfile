FROM public.ecr.aws/lambda/java:11

ENV MAIN_CLASS="com.kapresoft.springcloud.fn.aws.basic.LambdaApplication"
# Enable profile as needed
# ENV SPRING_PROFILES_ACTIVE="lowercase"

# Copy function code and runtime dependencies from Maven layout
COPY target/classes ${LAMBDA_TASK_ROOT}
COPY target/dependency/* ${LAMBDA_TASK_ROOT}/lib/

# Set the CMD to your handler (could also be done as a parameter override outside of the Dockerfile)
CMD [ "com.kapresoft.springcloud.fn.aws.basic.LambdaInvoker" ]