package emi.ac.ma.mongoproject.services.imp;

import emi.ac.ma.mongoproject.services.UserService;
import emi.ac.ma.mongoproject.repositories.UserRepository;

import emi.ac.ma.mongoproject.entities.response.User;
import org.springframework.stereotype.Service;

@Service
public class UserServiceImp implements UserService {
    private final UserRepository userRepository;

    public UserServiceImp(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User addUser(User user) {
        return userRepository.save(user);
    }

    public void updateUser(Long id, User updatedUser) {
        updatedUser.setId(id);
        userRepository.save(updatedUser);
    }

    public User getUser(String email,String password) {
        return userRepository.findByEmailAndPassword(email,password).orElse(null);
    }

    public void deleteUser(Long id) {
        userRepository.deleteById(id);
    }


}
