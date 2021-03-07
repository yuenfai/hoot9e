/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain;

import java.io.Serializable;

/**
 *
 * @author Forge-15
 */
public class Customer implements Serializable{
    private String firstName;
    private String lastName;
    private int age;
    private String email;
    private String password;
    private char gender;
    private String address;
    private char phoneNo;
    
    public Customer() {
    
    }

    public Customer(String firstName, String lastName, int age, String email, String password, char gender, String address, char phoneNo) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.email = email;
        this.password = password;
        this.gender = gender;
        this.address = address;
        this.phoneNo = phoneNo;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public char getGender() {
        return gender;
    }

    public String getAddress() {
        return address;
    }

    public char getPhoneNo() {
        return phoneNo;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNo(char phoneNo) {
        this.phoneNo = phoneNo;
    }

    @Override
    public String toString() {
        return "Customer{" + "firstName=" + firstName + ", lastName=" + lastName + ", age=" + age + ", email=" + email + ", password=" + password + ", gender=" + gender + ", address=" + address + ", phoneNo=" + phoneNo + '}';
    }
    
    
    
    
    
}
