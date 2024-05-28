package emi.ac.ma.mongoproject.services.imp;

import emi.ac.ma.mongoproject.entities.Livre;
import emi.ac.ma.mongoproject.entities.response.LivreResponse;
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
        return livreRepository.save(livre);
    }

    public List<LivreResponse> getAllLivres() {
        List<Livre> livres=livreRepository.findAll();
        List<LivreResponse> livreResponses = new ArrayList<>();
        for (Livre livre:livres) {
            LivreResponse livreResponse=new LivreResponse();
            livreResponse.setTitre(livre.getTitre());
            livreResponse.setAuteurName(livre.getAuteur().getNom() + " " + livre.getAuteur().getPrenom());
            livreResponse.setIsbn(livre.getIsbn());
            livreResponse.setNombreDeCopies(livre.getNombreDeCopies());
            livreResponse.setEstDisponible(livre.isEstDisponible());
            livreResponses.add(livreResponse);
        }
        return livreResponses;
    }

    public LivreResponse updateLivre(String id, Livre updatedLivre) {
        updatedLivre.setId(id);
        livreRepository.save(updatedLivre);
        LivreResponse livreResponse=new LivreResponse();
        livreResponse.setTitre(updatedLivre.getTitre());
        livreResponse.setAuteurName(updatedLivre.getAuteur().getNom() + " " + updatedLivre.getAuteur().getPrenom());
        livreResponse.setIsbn(updatedLivre.getIsbn());
        livreResponse.setNombreDeCopies(updatedLivre.getNombreDeCopies());
        livreResponse.setEstDisponible(updatedLivre.isEstDisponible());
        return livreResponse;
    }

    public void deleteLivre(String id) {
        livreRepository.deleteById(id);
    }
}
