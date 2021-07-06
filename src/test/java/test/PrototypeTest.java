/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import Prototype.Plate;
import Prototype.Prototype;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

/**
 *
 * @author dstudent
 */
public class PrototypeTest {
    
    @Test
    public void cloneTest() throws CloneNotSupportedException{
        Plate plate1 = new Plate(12, "Red");
        Plate plate2 = (Plate) plate1.clone();
        assertFalse(plate1.equals(plate2), "Plate1 is plate2!");
        
        plate1.setColor("Green");
        assertEquals(plate1.getColor(), "Green", "plate1 should be green!");
        assertEquals(plate2.getColor(), "Red", "plate2 should be red!");
        
        assertEquals(plate1.getSize(), plate2.getSize(), "Both size should be equal");
        plate2.setSize(30);
        assertEquals(plate2.getSize(), Integer.valueOf(30), "Plate2 should have size 30");
        
    }
}
