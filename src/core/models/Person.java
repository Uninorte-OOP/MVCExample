/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.models;

/**
 *
 * @author edangulo
 */
public class Person {
    
    private int id;
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
    
}
