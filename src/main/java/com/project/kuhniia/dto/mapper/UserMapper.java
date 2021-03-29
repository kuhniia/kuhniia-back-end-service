package com.project.kuhniia.dto.mapper;

import com.project.kuhniia.dto.UserDto;
import com.project.kuhniia.entity.User;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapper {

//    UserDtoMapper INSTANCE = Mappers.getMapper(UserDtoMapper.class);

    UserDto userToUserDto(User user);

    User dtoToUser(UserDto dto);

}
