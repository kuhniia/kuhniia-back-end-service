package com.project.kuhniia.service.impl;

import com.project.kuhniia.dto.UserDto;
import com.project.kuhniia.dto.mapper.UserDtoMapper;
import com.project.kuhniia.entity.Role;
import com.project.kuhniia.entity.User;
import com.project.kuhniia.repository.UserRepository;
import com.project.kuhniia.service.UserService;
import org.mapstruct.factory.Mappers;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository userRepository;
    private final PasswordEncoder passwordEncoder;

    public UserServiceImpl(UserRepository userRepository, PasswordEncoder passwordEncoder) {
        this.userRepository = userRepository;
        this.passwordEncoder = passwordEncoder;
    }

    @Override
    public User findByEmail(String email) {
        return userRepository.findUserByEmail(email);
    }

    @Override
    public void register(UserDto userDto) {
        User user = Mappers.getMapper(UserDtoMapper.class).dtoToUser(userDto);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        user.setRole(Role.USER);
        userRepository.save(user);
    }
}
