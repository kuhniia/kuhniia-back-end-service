package com.project.kuhniia.dto.mapper;

import com.project.kuhniia.dto.UserDto;
import com.project.kuhniia.entity.User;
import org.mapstruct.Mapper;

@Mapper
public interface UserDtoMapper {

    UserDto userToUserDto(User user);

    User dtoToUser(UserDto dto);

}
