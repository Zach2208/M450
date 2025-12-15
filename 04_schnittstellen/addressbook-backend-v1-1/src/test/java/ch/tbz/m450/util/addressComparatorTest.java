package ch.tbz.m450.util;

import ch.tbz.m450.repository.Address;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.Date;

import static org.junit.jupiter.api.Assertions.*;

class AddressComparatorTest {

    private AddressComparator comparator;
    private Address a1;
    private Address a2;

    @BeforeEach
    void setup() {
        comparator = new AddressComparator();

        a1 = new Address();
        a1.setId(2);
        a1.setLastname("Muster");
        a1.setFirstname("Max");
        a1.setPhonenumber("+41");
        a1.setRegistrationDate(new Date(1));

        a2 = new Address();
        a2.setId(1);
        a2.setLastname("Ammann");
        a2.setFirstname("Anna");
        a2.setPhonenumber("+41");
        a2.setRegistrationDate(new Date(2));
    }

    @Test
    void compare_Lastname() {
        int result = comparator.compare(a1, a2);

        assertTrue(result > 0);
    }

    @Test
    void compare_LastnameEqual() {
        a2.setLastname("Muster");

        int result = comparator.compare(a1, a2);

        assertTrue(result > 0);
    }

    @Test
    void compare_Phonenumber() {
        a2.setLastname("Muster");
        a2.setFirstname("Max");
        a2.setPhonenumber("+40");

        int result = comparator.compare(a1, a2);

        assertTrue(result > 0);
    }

    @Test
    void compare_RegistrationDate() {
        a2.setLastname("Muster");
        a2.setFirstname("Max");
        a2.setPhonenumber("+41");

        int result = comparator.compare(a1, a2);

        assertTrue(result < 0);
    }
}
