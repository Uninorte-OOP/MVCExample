/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.models;

import java.util.HashMap;

/**
 *
 * @author edangulo
 */
public class Person implements Serializable {
    
    private final int id;
    private String firstname;
    private String lastname;
    private int age;
    private boolean gender;

    public Person(int id, String firstname, String lastname, int age, boolean gender) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return firstname + " " + lastname;
    }
    
    public int getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public int getAge() {
        return age;
    }

    public boolean isGender() {
        return gender;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setGender(boolean gender) {
        this.gender = gender;
    }

    @Override
    public HashMap<String, Object> serialize() {
        HashMap<String, Object> serializedData = new HashMap<>();
        
        serializedData.put("id", this.id);
        serializedData.put("firstname", this.firstname);
        serializedData.put("lastname", this.lastname);
        serializedData.put("age", this.age);
        serializedData.put("gender", this.gender);
        
        return serializedData;
    }
    
}
