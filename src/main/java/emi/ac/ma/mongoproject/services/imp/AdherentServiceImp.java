package emi.ac.ma.mongoproject.services.imp;

import emi.ac.ma.mongoproject.entities.Adherent;
import emi.ac.ma.mongoproject.repositories.AdherentRepository;
import emi.ac.ma.mongoproject.services.AdherentService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class AdherentServiceImp implements AdherentService {

    private final AdherentRepository adherentRepository;

    public AdherentServiceImp(AdherentRepository adherentRepository) {
        this.adherentRepository = adherentRepository;
    }

    public Adherent addAdherent(Adherent adherent) {
        adherent.setLivresLoaned(new ArrayList<>());
        return adherentRepository.save(adherent);
    }

    public Adherent getAdherent(Long id) {
        return adherentRepository.findById(id).orElse(null);
    }

    public List<Adherent> getAllAdherents() {
        return adherentRepository.findAll();
    }

    public void updateAdherent(Long id, Adherent updatedAdherent) {
        updatedAdherent.setId(id);
        adherentRepository.save(updatedAdherent);
    }

    public void deleteAdherent(Long id) {
        adherentRepository.deleteById(id);
    }
}
