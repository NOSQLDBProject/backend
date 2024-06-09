package emi.ac.ma.mongoproject.services.imp;

import emi.ac.ma.mongoproject.entities.Auteur;
import emi.ac.ma.mongoproject.entities.LivreNeo4j;
import emi.ac.ma.mongoproject.repositories.AuteurRepository;
import emi.ac.ma.mongoproject.services.AuteurService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AuteurServiceImp implements AuteurService {

    private final AuteurRepository auteurRepository;

    public AuteurServiceImp(AuteurRepository auteurRepository) {
        this.auteurRepository = auteurRepository;
    }



    public void deleteAuteur(Long id) {
        auteurRepository.deleteById(id);
    }

    @Override
    public Auteur addLivreToAuteur(Long auteurId, Long livreId) {
        Auteur auteur = auteurRepository.findById(auteurId).orElse(null);
        if (auteur != null) {
            auteur.getLivres().add(livreId);
            auteurRepository.save(auteur);
        }
        return auteur;
    }

    public Auteur updateAuteur(Auteur auteur) {
        return auteurRepository.save(auteur);
    }

    public List<Auteur> getAllAuteurs() {
        return auteurRepository.findAll();
    }

    public Auteur getAuteur(Long id) {
        return auteurRepository.findById(id).orElse(null);
    }

    public Auteur addAuteur(Auteur auteur) {
        auteur.setLivres(new ArrayList<>());
        return auteurRepository.save(auteur);
    }
}
