package emi.ac.ma.mongoproject.repositories;

import emi.ac.ma.mongoproject.entities.Auteur;
import emi.ac.ma.mongoproject.entities.LivreNeo4j;
import org.springframework.data.neo4j.repository.Neo4jRepository;

public interface LivreNeo4jRepository extends Neo4jRepository<LivreNeo4j, Long> {
    LivreNeo4j getLivresByAuteur(Auteur auteur);
}
