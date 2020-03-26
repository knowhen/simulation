package com.sundray.simulation.response;

/**
 * @author: when
 * @create: 2020-03-26  17:09
 **/
public class AccessToken {
    private String accessToken;
    private Long expiresIn;

    public AccessToken() {
    }

    public AccessToken(String accessToken, Long expiresIn) {
        this.accessToken = accessToken;
        this.expiresIn = expiresIn;
    }

    public String getAccessToken() {
        return accessToken;
    }

    public void setAccessToken(String accessToken) {
        this.accessToken = accessToken;
    }

    public Long getExpiresIn() {
        return expiresIn;
    }

    public void setExpiresIn(Long expiresIn) {
        this.expiresIn = expiresIn;
    }
}
