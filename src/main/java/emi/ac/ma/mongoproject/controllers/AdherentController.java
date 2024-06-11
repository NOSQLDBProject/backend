package emi.ac.ma.mongoproject.controllers;

import emi.ac.ma.mongoproject.entities.Adherent;
import emi.ac.ma.mongoproject.services.AdherentService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/adherents")
@CrossOrigin("*")

public class AdherentController {


    private final AdherentService adherentService;

    public AdherentController(AdherentService adherentService) {
        this.adherentService = adherentService;
    }

    @PostMapping("/add")
    public Adherent addAdherent(@RequestBody Adherent adherent) {
        System.out.println(adherent);
        return adherentService.addAdherent(adherent);
    }

    @GetMapping("/{id}")
    public Adherent getAdherent(@PathVariable Long id) {
        return adherentService.getAdherent(id);
    }

    @GetMapping("/all")
    public List<Adherent> getAllAdherents() {
        return adherentService.getAllAdherents();
    }

    @PutMapping("/{id}")
    public void updateAuteur(@PathVariable Long id, @RequestBody Adherent updatedAdherent) {
        adherentService.updateAdherent(id, updatedAdherent);
    }

    @DeleteMapping("/{id}")
    public void deleteAuteur(@PathVariable Long id) {
        adherentService.deleteAdherent(id);
    }
}
