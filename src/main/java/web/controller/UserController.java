package web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import web.service.UserService;

@Controller
@RequestMapping("/")
public class UserController {

    private final UserService userService;

    @GetMapping
    public String usersList(@RequestParam(required = false) Long usersCount, ModelMap model) {
        model.addAttribute("users", userService.getListOfUsers(usersCount));
        return "users";
    }

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }
}
