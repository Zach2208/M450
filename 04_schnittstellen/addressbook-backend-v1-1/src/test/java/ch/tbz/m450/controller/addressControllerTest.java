package ch.tbz.m450.controller;

import ch.tbz.m450.repository.Address;
import ch.tbz.m450.service.AddressService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import org.junit.jupiter.api.extension.ExtendWith;

import java.util.List;
import java.util.Optional;

import static org.mockito.Mockito.*;
import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class AddressControllerTest {

    @Mock
    private AddressService service;

    @InjectMocks
    private AddressController controller;

    private Address address;

    @BeforeEach
    void setup() {
        address = new Address();
        address.setId(1);
        address.setFirstname("Max");
    }

    @Test
    void testCreateAddress() {
        when(service.save(address)).thenReturn(address);

        var response = controller.createAddress(address);

        assertEquals(201, response.getStatusCode().value());
        assertEquals(address, response.getBody());
        verify(service).save(address);
    }

    @Test
    void testGetAddresses() {
        when(service.getAll()).thenReturn(List.of(address));

        var response = controller.getAddresses();

        assertEquals(200, response.getStatusCode().value());
        assertEquals(1, response.getBody().size());
        assertEquals(address, response.getBody().get(0));
        verify(service).getAll();
    }

    @Test
    void testGetAddress_Found() {
        when(service.getAddress(1)).thenReturn(Optional.of(address));

        var response = controller.getAddress(1);

        assertEquals(200, response.getStatusCode().value());
        assertEquals(address, response.getBody());
        verify(service).getAddress(1);
    }

    @Test
    void testGetAddress_NotFound() {
        when(service.getAddress(1)).thenReturn(Optional.empty());

        var response = controller.getAddress(1);

        assertEquals(404, response.getStatusCode().value());
        assertNull(response.getBody());
        verify(service).getAddress(1);
    }
}
