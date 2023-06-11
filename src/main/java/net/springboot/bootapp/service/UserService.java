package net.springboot.bootapp.service;

import net.springboot.bootapp.model.User;

import java.util.List;

public interface UserService {
    User findById(Long id);

    List<User> findAll();

    User saveOrUpdateUser(User user);

    void deleteById(Long id);
}
