package com.codegym.model;

import javax.validation.constraints.*;

public class User {

    @NotEmpty
    @Size(min = 5, max = 45)
    private String firstName;

    @Size(min = 5, max = 45)
    private String lastName;

    @Pattern(regexp="(^$|[0]{1}[3789]{1}[0-9]{8})")
    private String phoneNumber;

    @Min(18)
    private int age;
    @Email
    private String email;

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}