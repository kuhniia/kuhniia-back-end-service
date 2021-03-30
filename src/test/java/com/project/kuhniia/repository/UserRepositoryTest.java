package com.project.kuhniia.repository;

import com.project.kuhniia.entity.Role;
import com.project.kuhniia.entity.User;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@SpringBootTest
@ExtendWith(SpringExtension.class)
class UserRepositoryTest {

    @Autowired
    private UserRepository userRepository;


    @Test
    void testSave() {
        User user = User.builder()
                .firstName("John")
                .lastName("Doe")
                .email("john.doe@gmail.com")
                .username("jdoe")
                .password("123")
                .role(Role.USER)
                .build();

        userRepository.save(user);

        User userByEmail = userRepository.findUserByEmail(user.getEmail());
        assertNotNull(userByEmail);
    }
}
