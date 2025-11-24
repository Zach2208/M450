package ch.schule.bank.junit5;

import ch.schule.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SavingsAccountTests {

    @Test
    void testWithdrawNotEnoughBalanceFails() {
        SavingsAccount acc = new SavingsAccount("S-1");

        acc.deposit(10, 100);
        assertFalse(acc.withdraw(11, 200));
        assertEquals(100, acc.getBalance());
    }

    @Test
    void testWithdrawAllowed() {
        SavingsAccount acc = new SavingsAccount("S-2");

        acc.deposit(10, 300);
        assertTrue(acc.withdraw(11, 100));
        assertEquals(200, acc.getBalance());
    }
}
