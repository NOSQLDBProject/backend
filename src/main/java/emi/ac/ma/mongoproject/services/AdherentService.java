package emi.ac.ma.mongoproject.services;

import emi.ac.ma.mongoproject.entities.Adherent;

import java.util.List;

public interface AdherentService {
    Adherent addAdherent(Adherent adherent);
    List<Adherent> getAllAdherents();
    void updateAdherent(Long id, Adherent updatedAdherent);
    void deleteAdherent(Long id);
    Adherent getAdherent(Long id);
}
