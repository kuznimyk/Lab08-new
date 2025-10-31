package com.example.lab08;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
public class CustomListTest {
    @Test
    public void testHasCity(){
        CustomList list = new CustomList();
        City calgary  = new City("Calgary", "AB");
        list.addCity(calgary);
        assertTrue(list.hasCity(calgary));
    }
    @Test
    public void testDeleteCity(){
        CustomList list = new CustomList();
        City edmonton  = new City("Edmonton", "AB");
        list.addCity(edmonton);
        assertTrue(list.hasCity(edmonton));
        list.deleteCity(edmonton);
        assertTrue(!list.hasCity(edmonton));
        // Assuming there's a deleteCity method
        // list.deleteCity(edmonton);
        // assertFalse(list.hasCity(edmonton));
    }

    public void testCityCount(){
        CustomList list = new CustomList();
        City vancouver  = new City("Vancouver", "BC");
        City toronto  = new City("Toronto", "ON");
        list.addCity(vancouver);
        list.addCity(toronto);
        assertEquals(2, list.getCityCount());
    }

}
