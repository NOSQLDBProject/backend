package emi.ac.ma.mongoproject.entities.response;

import emi.ac.ma.mongoproject.entities.Auteur;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.DBRef;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class LivreResponse {
    private String titre;

    private String auteurName;
    private String isbn;
    private int nombreDeCopies;
    private boolean estDisponible;
}
