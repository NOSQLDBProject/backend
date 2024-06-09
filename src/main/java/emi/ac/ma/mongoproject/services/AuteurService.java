package emi.ac.ma.mongoproject.services;

import emi.ac.ma.mongoproject.entities.Auteur;
import emi.ac.ma.mongoproject.entities.LivreNeo4j;

import java.util.List;

public interface AuteurService {
    Auteur addAuteur(Auteur auteur);
    Auteur getAuteur(Long id);
    List<Auteur> getAllAuteurs();
    void deleteAuteur(Long id);

    Auteur addLivreToAuteur(Long auteurId, Long livreId);
}
