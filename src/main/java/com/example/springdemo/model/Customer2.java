package com.example.springdemo.model;

import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;

import java.util.List;

public class Customer2 {

    private String firstname;
    @NotNull(message = "is required")
    @Size(min=1,message="is required")
    private String lastname;
    private String country;
    private List<String> favOS;

    public List<String> getFavOS() {
        return favOS;
    }

    public void setFavOS(List<String> favOS) {
        this.favOS = favOS;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }



    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
}
