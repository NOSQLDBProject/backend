package emi.ac.ma.mongoproject.controllers;

import emi.ac.ma.mongoproject.entities.Livre;
import emi.ac.ma.mongoproject.entities.response.LivreResponse;
import emi.ac.ma.mongoproject.services.LivreService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/livres")
@CrossOrigin("*")
public class LivreController {


    private final LivreService livreService;

    public LivreController(LivreService livreService) {
        this.livreService = livreService;
    }

    @PostMapping("/add")
    public Livre addLivre(@RequestBody Livre livre) {
        return livreService.addLivre(livre);
    }

    @GetMapping("/all")
    public List<LivreResponse> getAllLivres() {
        return livreService.getAllLivres();
    }

    @PutMapping("/{id}")
    public void updateLivre(@PathVariable Long id, @RequestBody Livre updatedLivre) {
        livreService.updateLivre(id, updatedLivre);
    }

    @DeleteMapping("/{id}")
    public void deleteLivre(@PathVariable Long id) {
        livreService.deleteLivre(id);
    }
}
