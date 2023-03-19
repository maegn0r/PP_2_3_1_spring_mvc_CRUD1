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
        users.add(new User("Василий", "Иванович", "vivanovich@yandex.ru"));
        users.add(new User("Сергей", "Петрович", "spetrovich@ya.ru"));
        users.add(new User("James", "Bond", "jbond007@gmail.com"));
        users.add(new User("Анна", "Иоанновна", "aioannovna@rambler.ru"));
        users.add(new User("Виктория", "Сергеевна", "vsergeevna@ya.ru"));
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
