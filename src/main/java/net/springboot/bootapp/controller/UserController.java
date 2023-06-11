package net.springboot.bootapp.controller;

import net.springboot.bootapp.model.User;
import net.springboot.bootapp.service.UserService;
import net.springboot.bootapp.service.UserServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;



@Controller
@RequestMapping("/user-table")
public class UserController {
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping
    public String findAll(Model model, User user) {
        model.addAttribute("usersList", userService.findAll());
        model.addAttribute("user", user);
        return "user-table";
    }

    @PostMapping
    public String createUser(User user) {
        userService.saveOrUpdateUser(user);
        return "redirect:/user-table";
    }

    @GetMapping("/{id}")
    public String getUpdateUser(@PathVariable("id") Long id, Model model) {
        User user = userService.findById(id);
        model.addAttribute("user", user);
        return "redirect:/user-table";
    }

    @DeleteMapping("/{id}")
    public String deleteUser(@PathVariable("id") Long id) {
        userService.deleteById(id);
        return "redirect:/user-table";
    }

    @PostMapping("/{id}")
    public String saveUpdateUser(User user) {
        userService.saveOrUpdateUser(user);
        return "redirect:/user-table";
    }
}
