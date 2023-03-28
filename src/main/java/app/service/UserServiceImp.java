package app.service;

import app.dao.UserDao;
import app.dto.UserDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import app.model.User;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImp implements UserService {

    @Autowired
    private UserDao userDao;


    @Override
    public void add(UserDto userDto) {
        User user = new User(userDto);
        userDao.add(user);
    }

    @Override
    public List<UserDto> getListOfUsers() {
        return userDao.listUsers().stream().map(UserDto::new).collect(Collectors.toList());
    }

    @Override
    public UserDto findById(Long id) {
        return new UserDto(userDao.findById(id));
    }

    @Override
    public void deleteById(Long id) {
        userDao.remove(userDao.findById(id));
    }

    @Override
    public void merge(UserDto userDto) {
        User user = userDao.findById(userDto.getId());
        user.setName(userDto.getName());
        user.setSurname(userDto.getSurname());
        user.setAge(userDto.getAge());
        userDao.merge(user);
    }


}
