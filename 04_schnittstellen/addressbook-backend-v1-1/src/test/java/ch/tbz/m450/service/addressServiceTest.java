package ch.tbz.m450.service;

import ch.tbz.m450.repository.Address;
import ch.tbz.m450.repository.AddressRepository;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.junit.jupiter.api.extension.ExtendWith;

import java.util.List;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class AddressServiceTest {

    @Mock
    private AddressRepository repository;

    @InjectMocks
    private AddressService service;

    private Address address;

    @BeforeEach
    void setup() {
        address = new Address();
        address.setId(1);
        address.setFirstname("Max");
        address.setLastname("Muster");
    }

    @Test
    void testFindAll() {
        when(repository.findAll()).thenReturn(List.of(address));

        List<Address> result = service.getAll();

        assertEquals(1, result.size());
        verify(repository).findAll();
    }

    @Test
    void testSave() {
        when(repository.save(address)).thenReturn(address);

        Address result = service.save(address);

        assertEquals("Max", result.getFirstname());
        verify(repository).save(address);
    }
}