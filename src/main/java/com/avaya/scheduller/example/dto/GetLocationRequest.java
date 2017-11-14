package com.avaya.scheduller.example.dto;

public class GetLocationRequest {
    private String locationId;

    public GetLocationRequest(String locationId) {
        if ((locationId != null) && !locationId.isEmpty()) {
            this.locationId = locationId;
        }
    }

    public String getLocationId() {
        return locationId;
    }

    public void setLocationId(String locationId) {
        if ((locationId != null) && !locationId.isEmpty()) {
            this.locationId = locationId;
        }
    }

    @Override
    public String toString() {
        return "GetLocationRequest [locationId=" + locationId + "]";
    }
}