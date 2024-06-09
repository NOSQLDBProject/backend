package emi.ac.ma.mongoproject.controllers;


import emi.ac.ma.mongoproject.entities.LivreNeo4j;
import emi.ac.ma.mongoproject.services.LivreNeo4jService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/livres/neo4j")
@CrossOrigin("*")
public class LivreNeo4jController {
    private final LivreNeo4jService livreNeo4jService;

    public LivreNeo4jController(LivreNeo4jService livreNeo4jService) {
        this.livreNeo4jService = livreNeo4jService;
    }

    @GetMapping("/{id}")
    public LivreNeo4j getLivre(@PathVariable Long id) {
        return livreNeo4jService.getLivre(id);
    }

    @GetMapping
    public Iterable<LivreNeo4j> getAllLivres() {
        return livreNeo4jService.getAllLivres();
    }

    @PostMapping
    public LivreNeo4j addLivre(@RequestBody LivreNeo4j livre) {
        return livreNeo4jService.addLivre(livre);
    }

    @PutMapping("/{id}")
    public LivreNeo4j updateLivre(@PathVariable Long id, @RequestBody LivreNeo4j livre) {
        livre.setId(id);
        return livreNeo4jService.updateLivre(livre);
    }

    @DeleteMapping("/{id}")
    public void deleteLivre(@PathVariable Long id) {
        livreNeo4jService.deleteLivre(id);
    }

}
