package ch.schule.bank.junit5;

import ch.schule.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BankTests {

    @Test
    void testCreateSavingsAccount() {
        Bank b = new Bank();
        String id = b.createSavingsAccount();

        assertEquals(0, b.getBalance(id));
    }

    @Test
    void testDepositAndWithdrawThroughBank() {
        Bank b = new Bank();
        String id = b.createSavingsAccount();

        assertTrue(b.deposit(id, 10, 500));
        assertEquals(500, b.getBalance(id));

        assertTrue(b.withdraw(id, 11, 300));
        assertEquals(200, b.getBalance(id));
    }

    @Test
    void testDepositFailsIfNoAccount() {
        Bank b = new Bank();
        assertFalse(b.deposit("X-999", 10, 500));
    }
}
