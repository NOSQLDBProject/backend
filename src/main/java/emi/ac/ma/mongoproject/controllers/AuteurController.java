package emi.ac.ma.mongoproject.controllers;

import emi.ac.ma.mongoproject.entities.Auteur;
import emi.ac.ma.mongoproject.services.AuteurService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/auteurs")
@CrossOrigin("*")
public class AuteurController {


    private final AuteurService auteurService;

    public AuteurController(AuteurService auteurService) {
        this.auteurService = auteurService;
    }

    @PostMapping("/add")
    public Auteur addAuteur(@RequestBody Auteur auteur) {
        System.out.println(auteur);
        return auteurService.addAuteur(auteur);
    }

    @GetMapping("/all")
    public List<Auteur> getAllAuteurs() {
        return auteurService.getAllAuteurs();
    }

    @PutMapping("/{id}")
    public void updateAuteur(@PathVariable Long id, @RequestBody Auteur updatedAuteur) {
        auteurService.updateAuteur(id, updatedAuteur);
    }

    @DeleteMapping("/{id}")
    public void deleteAuteur(@PathVariable Long id) {
        auteurService.deleteAuteur(id);
    }
}
