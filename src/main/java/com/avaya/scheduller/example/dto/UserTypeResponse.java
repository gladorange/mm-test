package com.avaya.scheduller.example.dto;

import java.io.Serializable;

public class UserTypeResponse implements Serializable {
    private static final long serialVersionUID = 4046933445367521641L;
    private boolean isLocal;

    public boolean isLocal() {
        return isLocal;
    }

    public void setLocal(boolean isLocal) {
        this.isLocal = isLocal;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (isLocal ? 1231 : 1237);
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
        if (getClass() != obj.getClass()) {
            return false;
        }
        UserTypeResponse other = (UserTypeResponse) obj;
        if (isLocal != other.isLocal) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "UserTypeResponse [isLocal=" + isLocal + "]";
    }

}
