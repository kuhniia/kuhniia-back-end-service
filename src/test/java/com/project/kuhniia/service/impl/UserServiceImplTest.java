package com.project.kuhniia.service.impl;

import com.project.kuhniia.entity.Role;
import com.project.kuhniia.entity.User;
import com.project.kuhniia.repository.UserRepository;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import java.util.UUID;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;
import static org.mockito.MockitoAnnotations.openMocks;

class UserServiceImplTest {

    @Mock
    private UserRepository userRepository;

    @InjectMocks
    private UserServiceImpl userService;

    @BeforeEach
    void setUp() {
        openMocks(this);
    }

    @AfterEach
    void tearDown() {
        verifyNoMoreInteractions(userRepository);
    }

    @Test
    void testFindByEmail() {
        when(userRepository.findUserByEmail("john.doe@gmail.com")).thenReturn(User.builder()
                .id(UUID.randomUUID())
                .firstName("John")
                .lastName("Doe")
                .email("john.doe@gmail.com")
                .username("jdoe")
                .role(Role.USER)
                .build());

        User byEmail = userService.findByEmail("john.doe@gmail.com");
        assertEquals("john.doe@gmail.com", byEmail.getEmail());

        verify(userRepository).findUserByEmail("john.doe@gmail.com");
    }
}
