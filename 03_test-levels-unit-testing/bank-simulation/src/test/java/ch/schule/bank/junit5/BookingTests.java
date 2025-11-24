package ch.schule.bank.junit5;

import ch.schule.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BookingTests {

    @Test
    void testBookingGetters() {
        Booking b = new Booking(123, 9999);

        assertEquals(123, b.getDate());
        assertEquals(9999, b.getAmount());
    }
}
