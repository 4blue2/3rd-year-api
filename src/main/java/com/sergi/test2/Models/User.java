package com.sergi.test2.Models;

import javax.persistence.*;
//this way you don't have to create the table by hand in MySQL workbench
@Entity
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @Column
    private int phoneNumber;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String address;

    @Column
    private int postCode;

    public long getId(){
        return id;
    }
    public void setId(long id){
        this.id = id;
    }
    public int getPhoneNumber(){
        return phoneNumber;
    }
    public void setPhoneNumber(int phoneNumber){
        this.phoneNumber = phoneNumber;
    }
    public String getFirstName(){
        return firstName;
    }
    public void setFirstName(String firstName){
        this.firstName = firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public void getLastName(String lastName){
        this.lastName = lastName;
    }
    public String getAddress(){
        return address;
    }
    public void setAddress(String address){
        this.address = address;
    }
    public int getPostCode(){
        return postCode;
    }
    public void setPostCode(int postCode){
        this.postCode = postCode;
    }

}
