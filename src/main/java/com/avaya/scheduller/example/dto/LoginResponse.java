package com.avaya.scheduller.example.dto;


import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LoginResponse {

    /**
     * Token which should be used in HTTP "Authorization: UPToken %TOKEN%" header
     */
    private String token;
    /**
     * Encrypted password of user. Caller could use this password to renew expired token without providing actual
     * password.
     */
    private String encryptedPassword;
    /**
     * Token expiration time
     */
    private String expirationTime;
    /**
     * LoginId for used.
     */
    private String loginId;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getEncryptedPassword() {
        return encryptedPassword;
    }

    public void setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
    }

    public String getExpirationTime() {
        return expirationTime;
    }

    public void setExpirationTime(String expirationTime) {
        this.expirationTime = expirationTime;
    }
    
    @Override
    public String toString() {
        return "LoginResponse [token=" + token + ", expirationTime="
                + expirationTime + "]";
    }

    public void setLoginId(String loginId) {
        this.loginId = loginId;
    }
    public String getLoginId() {
        return loginId;
    }
}
