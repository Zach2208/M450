package ch.schule.bank.junit5;

import ch.schule.Booking;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BookingTests {

    @Test
    void testBookingFields() {
        Booking b = new Booking(100, 5000);

        assertEquals(100, b.getDate());
        assertEquals(5000, b.getAmount());
    }
}
