package com.example.springdemo.model;

import com.example.springdemo.validation.EmployeeCode;
import jakarta.validation.constraints.*;

import java.util.List;

public class Customer2 {

    private String firstname;
    @NotNull(message = "is required")
    @Size(min=1,message="is required")
    private String lastname;
    @NotNull(message = "is required")
    @Min(value=0,message="number of points must be above 0")
    @Max(value=100,message="number of points must be below 100")
    private Integer numberOfPoints;
    @Pattern(regexp = "[0-9]{6}",message = "Zip code must be six digits")
    private String zipCode;
    @EmployeeCode
    private String empCode;

    public String getEmpCode() {
        return empCode;
    }

    public void setEmpCode(String empCode) {
        this.empCode = empCode;
    }



    public String getZipCode(){
        return this.zipCode;
    }
    public void setZipCode(String zipCode){
        this.zipCode=zipCode;
    }

    public Integer getNumberOfPoints(){
        return this.numberOfPoints;
    }
    public void setNumberOfPoints(Integer numberOfPoints){
        this.numberOfPoints=numberOfPoints;
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
