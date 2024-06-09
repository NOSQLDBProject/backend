package emi.ac.ma.mongoproject.services;

import emi.ac.ma.mongoproject.entities.Livre;
import emi.ac.ma.mongoproject.entities.response.LivreResponse;

import java.util.List;

public interface LivreService {
    Livre addLivre(Livre livre);
    List<Livre> getAllLivres();
    Livre updateLivre(Long id,Livre updatedLivre);
    void deleteLivre(Long id);

}
