package com.sundray.simulation.request;

/**
 * @author: when
 * @create: 2020-03-26  17:07
 **/
public class ApiToken {
    private String api_token;

    public ApiToken() {
    }

    public ApiToken(String api_token) {
        this.api_token = api_token;
    }

    public String getApi_token() {
        return api_token;
    }

    public void setApi_token(String api_token) {
        this.api_token = api_token;
    }
}
