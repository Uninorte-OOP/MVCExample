/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import core.controllers.PersonController;
import core.controllers.utils.Response;
import core.models.Person;

/**
 *
 * @author edangulo
 */
public class Main {
    
    public static void main(String[] args) {
        Response response1 = PersonController.addPerson("100546", "Eduardo", "Angulo", "26", "M");
        System.out.println("Message: " + response1.getMessage());
        System.out.println("Status: " + response1.getStatus() + "\n");
        
        Response response2 = PersonController.addPerson("100547", "Juan", "Perez", "23", "M");
        System.out.println("Message: " + response2.getMessage());
        System.out.println("Status: " + response2.getStatus() + "\n");
        
        Response response3 = PersonController.getPerson("100545");
        System.out.println("Message: " + response3.getMessage());
        System.out.println("Status: " + response3.getStatus() + "\n");
        
        Response response4 = PersonController.getPerson("100546");
        System.out.println("Message: " + response4.getMessage());
        System.out.println("Status: " + response4.getStatus());
        System.out.println("Person: " + response4.getObject() + "\n");
    }
    
}
