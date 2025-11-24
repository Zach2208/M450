package ch.schule.bank.junit5;

import ch.schule.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AccountTests {

    // minimal concrete class so we can test Account
    static class TestAccount extends Account {
        public TestAccount(String id) {
            super(id);
        }
    }

    @Test
    void testDeposit() {
        TestAccount acc = new TestAccount("T-1");

        boolean ok = acc.deposit(10, 500);
        assertTrue(ok);
        assertEquals(500, acc.getBalance());
    }

    @Test
    void testDepositNegativeFails() {
        TestAccount acc = new TestAccount("T-2");

        boolean ok = acc.deposit(10, -10);
        assertFalse(ok);
        assertEquals(0, acc.getBalance());
    }

    @Test
    void testWithdraw() {
        TestAccount acc = new TestAccount("T-3");

        acc.deposit(10, 500);
        boolean ok = acc.withdraw(11, 200);

        assertTrue(ok);
        assertEquals(300, acc.getBalance());
    }

    @Test
    void testWithdrawNegativeFails() {
        TestAccount acc = new TestAccount("T-4");

        boolean ok = acc.withdraw(10, -100);
        assertFalse(ok);
        assertEquals(0, acc.getBalance());
    }

    @Test
    void testCanTransactDateOrder() {
        TestAccount acc = new TestAccount("T-5");

        acc.deposit(10, 100);

        assertFalse(acc.canTransact(9));   // earlier date → fail
        assertTrue(acc.canTransact(10));  // same date → ok
        assertTrue(acc.canTransact(11));  // later date → ok
    }
}
