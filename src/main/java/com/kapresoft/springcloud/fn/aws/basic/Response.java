package com.kapresoft.springcloud.fn.aws.basic;

import lombok.Builder;
import lombok.Value;

@Value
public class Response {

    String request;
    String response;

    @Builder
    public Response(String request, String response) {
        this.request = request;
        this.response = response;
    }

}
