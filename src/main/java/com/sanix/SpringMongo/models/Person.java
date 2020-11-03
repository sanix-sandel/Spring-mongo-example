package com.sanix.SpringMongo.models;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.math.BigInteger;
import java.time.LocalDate;

@Document(collection="person")
public class Person {

    @Id
    private BigInteger id;
    private String username;
    private String password;
    private String firstName;
    private String lastName;
    private LocalDate hiringDate;
    private LocalDate createdAt;
    private LocalDate modifiedAt;

    public Person() {
        createdAt=LocalDate.now();
        modifiedAt=LocalDate.now();
    }

    public BigInteger getId() {
        return id;
    }

    public void setId(BigInteger id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public LocalDate getHiringDate() {
        return hiringDate;
    }

    public void setHiringDate(LocalDate hiringDate) {
        this.hiringDate = hiringDate;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public LocalDate getModifiedAt() {
        return modifiedAt;
    }

    public void setModifiedAt(LocalDate modifiedAt) {
        this.modifiedAt = modifiedAt;
    }

    @Override
    public String toString(){
        return "Person{"+
                "id="+id+
                ", username= "+username+'\n'+
                ", firstName='"+firstName+'\n'+
                ", lastName=' "+lastName+'\n'+
                '}';
    }
}
