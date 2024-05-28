package emi.ac.ma.mongoproject.repositories;

import emi.ac.ma.mongoproject.entities.Livre;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LivreRepository extends MongoRepository<Livre, Long> {
}
