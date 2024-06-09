package emi.ac.ma.mongoproject.services;

import emi.ac.ma.mongoproject.entities.response.User;

public interface UserService {
    User addUser(User user);
    void updateUser(Long id, User updatedUser);
    User getUser(String email,String password);

}
