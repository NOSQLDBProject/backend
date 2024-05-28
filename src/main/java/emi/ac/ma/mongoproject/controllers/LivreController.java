package emi.ac.ma.mongoproject.controllers;

import emi.ac.ma.mongoproject.entities.Livre;
import emi.ac.ma.mongoproject.entities.response.LivreResponse;
import emi.ac.ma.mongoproject.services.LivreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livres")
public class LivreController {

    @Autowired
    private LivreService livreService;

    @PostMapping
    public Livre addLivre(@RequestBody Livre livre) {
        return livreService.addLivre(livre);
    }

    @GetMapping
    public List<LivreResponse> getAllLivres() {
        return livreService.getAllLivres();
    }

    @PutMapping("/{id}")
    public void updateLivre(@PathVariable String id, @RequestBody Livre updatedLivre) {
        livreService.updateLivre(id, updatedLivre);
    }

    @DeleteMapping("/{id}")
    public void deleteLivre(@PathVariable String id) {
        livreService.deleteLivre(id);
    }
}
