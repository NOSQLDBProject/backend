package emi.ac.ma.mongoproject.services.imp;

import emi.ac.ma.mongoproject.entities.Auteur;
import emi.ac.ma.mongoproject.repositories.AuteurRepository;
import emi.ac.ma.mongoproject.services.AuteurService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AuteurServiceImp implements AuteurService {

    private final AuteurRepository auteurRepository;

    public AuteurServiceImp(AuteurRepository auteurRepository) {
        this.auteurRepository = auteurRepository;
    }

    public Auteur addAuteur(Auteur auteur) {
        return auteurRepository.save(auteur);
    }

    public List<Auteur> getAllAuteurs() {
        return auteurRepository.findAll();
    }

    public void updateAuteur(String id, Auteur updatedAuteur) {
        updatedAuteur.setId(id);
        auteurRepository.save(updatedAuteur);
    }

    public void deleteAuteur(String id) {
        auteurRepository.deleteById(id);
    }
}
