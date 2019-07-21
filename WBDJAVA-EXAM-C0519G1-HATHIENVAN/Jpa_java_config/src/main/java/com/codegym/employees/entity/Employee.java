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
    @NotNull(message = " Does not leave the ID blank")
    @Min(1)
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id")
    private int id;

    @NotNull(message = "Does not leave the group employees blank")
    @Length(min=2, max = 100, message = "group name  consists of 2 characters or more")
    @Column(name = "group_employees")
    private String group;

    @NotNull(message = "Does not leave the full name blank")
    @Length(min = 2,max = 150,message = "Full names start from 2 characters or more ")
    @Column(name = "full_name")
    private String fullName;


    @NotNull(message = "Does not leave the birthday blank")
    @Past
    @Column(name = "birthday")
    private Date birthday;

    @NotNull(message = "Does not leave the gender blank")
    @Length(min = 4, max = 6)
    @Column(name = "gender")
    private String gender;

    @NotNull(message = "Does not leave the phone number blank")
    @Length(min = 10, max = 10,message = "Phone number includes 10 numbers")
    @Pattern(regexp ="(^$|[0]{1}[37589]{1}[0-9]{8})",message = "phone number must start with number 0,and the 2nd number must start from numbers 3,5,7,8 or 9, ")
    @Column(name = "phone_number")
    private String phoneNumber;


    @NotNull(message = "Does not leave the number CMND blank")
    @Length(min = 9, max = 12, message = "CMND number consists of 9 numbers or 12 numbers")
    @Column(name = "number_CMND")
    private String numberCMND;

    @NotNull(message = "Does not leave the email blank")
    @Email
    @Column(name = "email")
    private String email;

    @NotNull(message = "Does not leave the address blank")
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

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
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
        return "Customer [id=" + id + ", Group=" + group + ", FullName=" + fullName +", Birthday=" + birthday + ", Gender=" + gender + ", PhoneNumber=" + phoneNumber + ", NumberCMND=" + numberCMND + ", Email=" + email + ", Address=" + address + "]";
    }
}
