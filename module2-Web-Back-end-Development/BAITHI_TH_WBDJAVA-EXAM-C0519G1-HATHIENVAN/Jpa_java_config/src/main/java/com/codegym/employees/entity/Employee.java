package com.codegym.employees.entity;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.Length;

import javax.persistence.*;
import java.util.Date;
import javax.validation.constraints.*;

@Entity
@Table(name = "employees")
public class Employee {
    @Id
    @NotNull
    @Min(1)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @NotNull
    @Size(min=2, max = 100)
    @Column(name = "group_employees")
    private String group;

    @NotNull
    @Size(min = 2,max = 150)
    @Column(name = "full_name")
    private String fullName;

    @NotNull
    @Size(min = 4, max = 6)
    @Column(name = "gender")
    private String gender;

    @NotNull
    @Size(min = 10, max = 10)
    @Pattern(regexp ="(^$|[0]{1}[37589]{1}[0-9]{8})")
    @Column(name = "phone_number")
    private String phoneNumber;


    @NotNull
    @Size(min = 9, max = 12)
    @Column(name = "number_CMND")
    private String numberCMND;

    @NotNull
    @Email
    @Column(name = "email")
    private String email;

    @NotNull
    @Size(min = 2)
    @Column(name = "address")
    private String address;

    public Employee() {

    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }



    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getNumberCMND() {
        return numberCMND;
    }

    public void setNumberCMND(String numberCMND) {
        this.numberCMND = numberCMND;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    @Override
    public String toString() {
        return "Customer [id=" + id + ", Group=" + group + ", FullName=" + fullName + ", Gender=" + gender + ", PhoneNumber=" + phoneNumber + ", NumberCMND=" + numberCMND + ", Email=" + email + ", Address=" + address + "]";
    }
}
