package emi.ac.ma.mongoproject.services.imp;

import emi.ac.ma.mongoproject.entities.Auteur;
import emi.ac.ma.mongoproject.entities.LivreNeo4j;
import emi.ac.ma.mongoproject.repositories.AuteurRepository;
import emi.ac.ma.mongoproject.services.LivreNeo4jService;
import org.springframework.stereotype.Service;
import emi.ac.ma.mongoproject.repositories.LivreNeo4jRepository;

@Service
public class LivreNeo4jServiceImp implements LivreNeo4jService {
    private final LivreNeo4jRepository livreNeo4jRepository;
    private final AuteurRepository auteurRepository;

    public LivreNeo4jServiceImp(LivreNeo4jRepository livreNeo4jRepository, AuteurRepository auteurRepository) {
        this.livreNeo4jRepository = livreNeo4jRepository;
        this.auteurRepository = auteurRepository;
    }


    public void deleteAll() {
        livreNeo4jRepository.deleteAll();
    }


    public LivreNeo4j addLivre(LivreNeo4j livre) {
        Auteur auteur = auteurRepository.findById(livre.getAuteurId()).orElse(null);
        auteur.getLivres().add(livre.getId());
        return livreNeo4jRepository.save(livre);
    }

    public LivreNeo4j getLivre(Long id) {
        return livreNeo4jRepository.findById(id).orElse(null);
    }

    public void deleteLivre(Long id) {
        livreNeo4jRepository.deleteById(id);
    }

    public LivreNeo4j updateLivre(LivreNeo4j livre) {
        return livreNeo4jRepository.save(livre);
    }

    public Iterable<LivreNeo4j> getAllLivres() {
        return livreNeo4jRepository.findAll();
    }

}
