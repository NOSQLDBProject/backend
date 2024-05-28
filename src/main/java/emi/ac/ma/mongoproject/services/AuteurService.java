package emi.ac.ma.mongoproject.services;

import emi.ac.ma.mongoproject.entities.Auteur;

import java.util.List;

public interface AuteurService {
    Auteur addAuteur(Auteur auteur);
    List<Auteur> getAllAuteurs();
    public void updateAuteur(String id, Auteur updatedAuteur);
    public void deleteAuteur(String id);
}
