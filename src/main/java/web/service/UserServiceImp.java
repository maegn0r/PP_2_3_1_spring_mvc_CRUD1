package web.service;

import org.springframework.stereotype.Service;
import web.model.User;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Service
public class UserServiceImp implements UserService {


    private final List<User> users;

    public void fillListOfUsers() {
        users.add(new User("Василий", "Иванович", (byte) 55));
        users.add(new User("Сергей", "Петрович", (byte) 35));
        users.add(new User("James", "Bond", (byte) 67));
        users.add(new User("Анна", "Иоанновна", (byte) 34));
        users.add(new User("Виктория", "Сергеевна", (byte) 52));
    }


    @Override
    public List<User> getListOfUsers(Long usersCount) {
        if (usersCount == null) {
            usersCount = (long) Integer.MAX_VALUE;
        }
        return users.stream().limit(usersCount).collect(Collectors.toList());
    }

    public UserServiceImp() {
        users = new ArrayList<>();
        fillListOfUsers();
    }


}
