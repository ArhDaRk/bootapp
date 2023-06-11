package net.springboot.bootapp.service;

import net.springboot.bootapp.model.User;
import net.springboot.bootapp.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserServiceImp implements UserService{

private final UserRepository userRepository;

    @Autowired
    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findById(Long id) {
        return userRepository.getReferenceById(id);
    }
    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }
    @Override
    public User saveOrUpdateUser(User user) {
        return userRepository.save(user);
    }
    @Override
    public void deleteById(Long id) {
        userRepository.deleteById(id);
    }
}
