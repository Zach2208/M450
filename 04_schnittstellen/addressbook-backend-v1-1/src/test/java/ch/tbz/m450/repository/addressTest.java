package ch.tbz.m450.repository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Date;

class AddressTest {

    private Address address;

    @BeforeEach
    void setup() {
        address = new Address();
        address.setFirstname("Dexter");
        address.setLastname("Nachname");
        address.setPhonenumber("+41");
        address.setRegistrationDate(new Date(0));
    }

    @Test
    void testGetters() {
        assertEquals("Max", address.getFirstname());
        assertEquals("Muster", address.getLastname());
        assertEquals("+41", address.getPhonenumber());
        assertEquals(new Date(0), address.getRegistrationDate());
    }
}
