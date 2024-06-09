package emi.ac.ma.mongoproject.repositories;

import emi.ac.ma.mongoproject.entities.Auteur;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface AuteurRepository extends Neo4jRepository<Auteur, Long> {
}
