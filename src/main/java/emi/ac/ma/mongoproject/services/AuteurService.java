package emi.ac.ma.mongoproject.services;

import emi.ac.ma.mongoproject.entities.Auteur;

import java.util.List;

public interface AuteurService {
    Auteur addAuteur(Auteur auteur);
    List<Auteur> getAllAuteurs();
    public void updateAuteur(Long id, Auteur updatedAuteur);
    public void deleteAuteur(Long id);
}
