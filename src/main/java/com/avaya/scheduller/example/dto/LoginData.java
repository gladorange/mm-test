package com.avaya.scheduller.example.dto;


import com.fasterxml.jackson.annotation.JsonInclude;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class LoginData {

    /**
     * User login. if token is present - can be omitted
     */
    private String login;
    /**
     * used password. if token or encrypted password are present - can be omitted
     */
    private String password;
    /**
     * organizationAlias. Optional, if request url contains it, e.g. https://portal
     * .com/ups/resources/tenants/999/authentication/login
     */
    private String organizationAlias;
    /**
     * previously returned password. Used to renew token. Can be omitted if remember me is disabled
     */
    private String encryptedPassword;

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getOrganizationAlias() {
        return organizationAlias;
    }

    public void setOrganizationAlias(String organizationAlias) {
        this.organizationAlias = organizationAlias;
    }

    public String getEncryptedPassword() {
        return encryptedPassword;
    }

    public void setEncryptedPassword(String encryptedPassword) {
        this.encryptedPassword = encryptedPassword;
    }

    @Override
    public String toString() {
        return "LoginRequest [login=" + login + ", organizationAlias=" + organizationAlias + "]";
    }

}
