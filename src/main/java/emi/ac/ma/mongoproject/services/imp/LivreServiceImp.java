package emi.ac.ma.mongoproject.services.imp;

import emi.ac.ma.mongoproject.entities.Livre;
import emi.ac.ma.mongoproject.repositories.LivreRepository;
import emi.ac.ma.mongoproject.services.LivreService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class LivreServiceImp implements LivreService {

    private final LivreRepository livreRepository;

    public LivreServiceImp(LivreRepository livreRepository) {
        this.livreRepository = livreRepository;
    }
    public Livre addLivre(Livre livre) {
        livre.setAdherents(new ArrayList<>());
        return livreRepository.save(livre);
    }

    public List<Livre> getAllLivres() {
        return livreRepository.findAll();
    }

    public Livre updateLivre(Long id,Livre updatedLivre) {
        updatedLivre.setId(id);
        return livreRepository.save(updatedLivre);
    }

    public Livre getLivre(Long id) {
        return livreRepository.findById(id).orElse(null);
    }

    public void deleteLivre(Long id) {
        livreRepository.deleteById(id);
    }


}
