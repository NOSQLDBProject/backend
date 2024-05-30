package emi.ac.ma.mongoproject.services;

import emi.ac.ma.mongoproject.entities.Adherent;

import java.util.List;

public interface AdherentService {
    Adherent addAdherent(Adherent adherent);
    List<Adherent> getAllAdherents();
    public void updateAdherent(Long id, Adherent updatedAdherent);
    public void deleteAdherent(Long id);
}
