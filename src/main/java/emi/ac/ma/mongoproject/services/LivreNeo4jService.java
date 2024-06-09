package emi.ac.ma.mongoproject.services;

import emi.ac.ma.mongoproject.entities.LivreNeo4j;

public interface LivreNeo4jService {

    LivreNeo4j addLivre(LivreNeo4j livre);
    LivreNeo4j getLivre(Long id);
    void deleteLivre(Long id);
    LivreNeo4j updateLivre(LivreNeo4j livre);
    Iterable<LivreNeo4j> getAllLivres();
    void deleteAll();
}
