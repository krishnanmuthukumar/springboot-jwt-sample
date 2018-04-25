package com.example.demo;

import com.example.demo.domain.Vehicle;
import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class VehicleTest {

    @Test
    public void testVehicle(){
        Vehicle v = new Vehicle(1L, "test");
        assertTrue("id is 1L", 1L == v.getId());
        assertTrue("name is test", "test".equals(v.getName()));

        Vehicle v2 =  Vehicle.builder().id(2L).name("test2").build();
        assertTrue("id is 2L", 2L == v2.getId());
        assertTrue("name is test2", "test2".equals(v2.getName()));
    }
}
