package emi.ac.ma.mongoproject.controllers;

import emi.ac.ma.mongoproject.entities.Auteur;
import emi.ac.ma.mongoproject.services.AuteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auteurs")
public class AuteurController {

    @Autowired
    private AuteurService auteurService;

    @PostMapping
    public Auteur addAuteur(@RequestBody Auteur auteur) {
        return auteurService.addAuteur(auteur);
    }

    @GetMapping
    public List<Auteur> getAllAuteurs() {
        return auteurService.getAllAuteurs();
    }

    @PutMapping("/{id}")
    public void updateAuteur(@PathVariable String id, @RequestBody Auteur updatedAuteur) {
        auteurService.updateAuteur(id, updatedAuteur);
    }

    @DeleteMapping("/{id}")
    public void deleteAuteur(@PathVariable String id) {
        auteurService.deleteAuteur(id);
    }
}
