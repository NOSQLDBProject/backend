package emi.ac.ma.mongoproject.repositories;

import emi.ac.ma.mongoproject.entities.Adherent;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface AdherentRepository extends MongoRepository<Adherent, Long> {
}
