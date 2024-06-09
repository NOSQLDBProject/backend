package emi.ac.ma.mongoproject.controllers;

import emi.ac.ma.mongoproject.entities.Auteur;
import emi.ac.ma.mongoproject.entities.LivreNeo4j;
import emi.ac.ma.mongoproject.services.AuteurService;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/auteurs")
@CrossOrigin("*")
public class AuteurController {

    private final AuteurService auteurService;

    public AuteurController(AuteurService auteurService) {
        this.auteurService = auteurService;
    }

    @PostMapping("/add")
    public Auteur createAuteur(@RequestBody Auteur auteur) {
        return auteurService.addAuteur(auteur);
    }

    @GetMapping("/all")
    public Iterable<Auteur> getAllAuteurs() {
        return auteurService.getAllAuteurs();
    }

    @PostMapping("/addBook/{auteurId}/{livreId}")
    public Auteur addLivreToAuteur(@PathVariable Long auteurId, @PathVariable Long livreId) {
        return auteurService.addLivreToAuteur(auteurId, livreId);
    }

    @DeleteMapping("/{id}")
    public void deleteAuteur(@PathVariable Long id) {
        auteurService.deleteAuteur(id);
    }

    @GetMapping("/id/{id}")
    public Auteur getAuteur(@PathVariable Long id) {
        return auteurService.getAuteur(id);
    }
}
