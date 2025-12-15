package ch.tbz.m450.repository;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddressRepositoryTest {

    @Test
    void testRepositoryInterfaceExists() {
        // Repository wird nicht direkt getestet, da es gemockt wird
        assertTrue(AddressRepository.class.isInterface());
    }
}
