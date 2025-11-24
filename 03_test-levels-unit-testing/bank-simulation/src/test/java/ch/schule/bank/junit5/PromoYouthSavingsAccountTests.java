package ch.schule.bank.junit5;

import ch.schule.*;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class PromoYouthSavingsAccountTests {

    @Test
    void testBonusDeposit() {
        PromoYouthSavingsAccount acc = new PromoYouthSavingsAccount("Y-1");

        acc.deposit(10, 10000);
        // bonus = 1% → 100
        assertEquals(10100, acc.getBalance());
    }
}
