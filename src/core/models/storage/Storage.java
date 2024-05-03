/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.models.storage;

import core.models.Person;
import java.util.ArrayList;

/**
 *
 * @author edangulo
 */
public class Storage {
    
    // Instancia Singleton
    private static Storage instance;
    
    // Atributos del Storage
    private ArrayList<Person> persons;
    
    private Storage() {
        this.persons = new ArrayList<>();
    }
    
    public static Storage getInstance() {
        if (instance == null) {
            instance = new Storage();
        }
        return instance;
    }
    
    public boolean addPerson(Person person) {
        for (Person p : this.persons) {
            if (p.getId() == person.getId()) {
                return false;
            }
        }
        this.persons.add(person);
        return true;
    }
    
    public Person getPerson(int id) {
        for (Person person : this.persons) {
            if (person.getId() == id) {
                return person;
            }
        }
        return null;
    }
    
}
