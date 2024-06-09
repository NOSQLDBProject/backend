package emi.ac.ma.mongoproject.repositories;

import emi.ac.ma.mongoproject.entities.response.User;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.Optional;

public interface UserRepository extends MongoRepository<User, Long> {
    Optional<User> findByEmailAndPassword(String email, String password);
}
