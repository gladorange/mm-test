package com.avaya.scheduller.example.dto;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement
public final class PasswordChangeData implements Serializable {
    private static final long serialVersionUID = 1L;

    /**
     * Existing password. optional, if there is confirmation token
     */
    private String password;
    /**
     * New password.
     */
    private String newPassword;
    /**
     * Confirmation token. Optional, if there is password
     */
    private String confirmationToken;

    @XmlElement(name = "password")
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @XmlElement(name = "newPassword")
    public String getNewPassword() {
        return newPassword;
    }

    public void setNewPassword(String newPassword) {
        this.newPassword = newPassword;
    }

    @XmlElement(name = "confirmationToken")
    public String getConfirmationToken() {
        return confirmationToken;
    }

    public void setConfirmationToken(String confirmationToken) {
        this.confirmationToken = confirmationToken;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((confirmationToken == null) ? 0 : confirmationToken.hashCode());
        result = prime * result + ((newPassword == null) ? 0 : newPassword.hashCode());
        result = prime * result + ((password == null) ? 0 : password.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (!(obj instanceof PasswordChangeData)) {
            return false;
        }
        PasswordChangeData other = (PasswordChangeData) obj;
        if (confirmationToken == null) {
            if (other.confirmationToken != null) {
                return false;
            }
        } else if (!confirmationToken.equals(other.confirmationToken)) {
            return false;
        }
        if (newPassword == null) {
            if (other.newPassword != null) {
                return false;
            }
        } else if (!newPassword.equals(other.newPassword)) {
            return false;
        }
        if (password == null) {
            if (other.password != null) {
                return false;
            }
        } else if (!password.equals(other.password)) {
            return false;
        }
        return true;
    }

    // Since class contains only security information avoid toString()
    // generation because it doesn't generated yet
}
