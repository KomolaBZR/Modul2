package com.company;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class ListTask1getAddressesTest {
    @Test
    public void testListTask1_getAddress_CommonSituationWithoutNull(){
        List<Person> persons = Arrays.asList(
                new Person("Ivan", new Address("Friedrich str.", "7A")),
                new Person("Maria", new Address("Mueller str.", "5")),
                new Person("Stephan", new Address("Luxemburg str.", "8")),
                new Person("John", new Address("Karl-Marx-Straße", "10")),
                new Person("Amalia", new Address("Seestraße", "5")));

        List<Address> expected= Arrays.asList(new Address("Friedrich str.", "7A"),
                new Address("Mueller str.", "5"),
                new Address("Luxemburg str.", "8"),
                new Address("Karl-Marx-Straße", "10"),
                new Address("Seestraße", "5"));

        assertEquals(expected,ListTask1getAddresses.getAddresses(persons));
    }

    @Test
    public void testListTask1_getAddress_Null(){
        List<Person> persons = null;
        assertNull(persons);
    }





}