/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package core.controllers;

import core.controllers.utils.Response;
import core.controllers.utils.Status;
import org.junit.Test;
import static org.junit.Assert.assertEquals;

/**
 *
 * @author edangulo
 */
public class PersonControllerTest {
    
    @Test
    public void testCreatePerson() throws Throwable {
        // Given
        String idPerson1 = "100546"; 
        String firstnamePerson1 = "Eduardo"; 
        String lastnamePerson1 = "Angulo";
        String agePerson1 = "26";
        String genderPerson1 = "M";
        
        String idPerson2 = "100547"; 
        String firstnamePerson2 = "Juan"; 
        String lastnamePerson2 = "Perez";
        String agePerson2 = "23";
        String genderPerson2 = "M";
        
        // When
        Response response1 = PersonController.createPerson(idPerson1, firstnamePerson1, lastnamePerson1, agePerson1, genderPerson1);
        Response response2 = PersonController.createPerson(idPerson1, firstnamePerson1, lastnamePerson1, agePerson1, genderPerson1);
        Response response3 = PersonController.createPerson(idPerson2, firstnamePerson2, lastnamePerson2, agePerson2, genderPerson2);
        
        // Then
        assertEquals(Status.CREATED, response1.getStatus());
        assertEquals(Status.BAD_REQUEST, response2.getStatus());
        assertEquals(Status.CREATED, response3.getStatus());
    }
    
}
