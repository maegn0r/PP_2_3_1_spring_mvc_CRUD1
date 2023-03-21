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


//    public void fillDatabase() {
//        add(new UserDto("User1", "Lastname1", (byte) 22));
//        add(new UserDto("User2", "Lastname2", (byte) 33));
//        add(new UserDto("User3", "Lastname3", (byte) 44));
//        add(new UserDto("User4", "Lastname4", (byte) 55));
//    }


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

//    public UserServiceImp(){
//        fillDatabase();
//    }


}
