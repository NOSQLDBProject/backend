package emi.ac.ma.mongoproject.repositories;

import emi.ac.ma.mongoproject.entities.Auteur;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AuteurRepository extends MongoRepository<Auteur, String> {
}
