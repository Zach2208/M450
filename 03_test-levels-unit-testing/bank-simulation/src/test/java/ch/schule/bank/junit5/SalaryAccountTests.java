package ch.schule.bank.junit5;

import ch.schule.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SalaryAccountTests {

    @Test
    void testWithdrawWithinCreditLimit() {
        SalaryAccount acc = new SalaryAccount("P-1", -5000);

        acc.deposit(10, 2000);
        assertTrue(acc.withdraw(20, 3000));  // balance becomes -1000
    }

    @Test
    void testWithdrawExceedsCreditLimitFails() {
        SalaryAccount acc = new SalaryAccount("P-2", -5000);

        acc.deposit(10, 1000);
        assertFalse(acc.withdraw(15, 7000)); // final would be -6000 (not allowed)
    }
}
