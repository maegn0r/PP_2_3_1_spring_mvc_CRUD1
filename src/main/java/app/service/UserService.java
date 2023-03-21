package app.service;

import app.dto.UserDto;

import java.util.List;

public interface UserService {
    void add(UserDto userDto);
    List<UserDto> getListOfUsers();
}
