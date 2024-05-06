/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.controllers;

import core.controllers.utils.Response;
import core.controllers.utils.Status;
import core.models.Person;
import core.models.storage.Storage;

/**
 *
 * @author edangulo
 */
public class PersonController {
    
    public static Response createPerson(String id, String firstname, String lastname, String age, String gender) {
        try {
            int idInt, ageInt;
            boolean genderB;
            
            try {
                idInt = Integer.parseInt(id);
            } catch (NumberFormatException ex) {
                return new Response("Id must be numeric", Status.BAD_REQUEST);
            }
            
            if (firstname.equals("")) {
                return new Response("Firstname must be not empty", Status.BAD_REQUEST);
            }
            
            if (lastname.equals("")) {
                return new Response("Lastname must be not empty", Status.BAD_REQUEST);
            }
            
            try {
                ageInt = Integer.parseInt(age);
            } catch (NumberFormatException ex) {
                return new Response("Age must be numeric", Status.BAD_REQUEST);
            }
            
            if (gender.equals("M")) {
                genderB = false;
            } else if (gender.equals("F")) {
                genderB = true;
            } else {
                return new Response("Gender error", Status.BAD_REQUEST);
            }
            
            Storage storage = Storage.getInstance();            
            if (!storage.addPerson(new Person(idInt, firstname, lastname, ageInt, genderB))) {
                return new Response("A person with that id already exists", Status.BAD_REQUEST);
            }
            return new Response("", Status.CREATED);
        } catch (Exception ex) {
            return new Response("Unexpected error", Status.INTERNAL_SERVER_ERROR);
        }
    }
    
    public static Response readPerson(String id) {
        try {
            int idInt;
            
            try {
                idInt = Integer.parseInt(id);
            } catch (NumberFormatException ex) {
                return new Response("Id must be numeric", Status.BAD_REQUEST);
            }
            
            Storage storage = Storage.getInstance();
            
            Person person = storage.getPerson(idInt);
            if (person == null) {
                return new Response("Person not found", Status.NOT_FOUND);
            }
            return new Response("Person found", Status.OK, person);
        } catch (Exception ex) {
            return new Response("Unexpected error", Status.INTERNAL_SERVER_ERROR);
        }
    }
    
    public static Response updatePerson() {
        return new Response("", Status.NOT_IMPLEMENTED);
    }
    
    public static Response deletePerson() {
        return new Response("", Status.NOT_IMPLEMENTED);
    }
    
}
