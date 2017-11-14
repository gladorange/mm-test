package com.avaya.scheduller.example.dto;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

public final class ContentServerTokenRequest {
    TokenType tokenType;

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (!(o instanceof ContentServerTokenRequest)) {
            return false;
        }

        ContentServerTokenRequest that = (ContentServerTokenRequest) o;

        return new EqualsBuilder().append(tokenType, that.tokenType).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(tokenType).toHashCode();
    }

    public TokenType getTokenType() {
        return tokenType;
    }

    public void setTokenType(TokenType tokenType) {
        this.tokenType = tokenType;
    }

    @Override
    public String toString() {
        return "ContentServerTokenRequest{" +
                "tokenType=" + tokenType +
                '}';
    }
}
