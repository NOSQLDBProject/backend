package emi.ac.ma.mongoproject.entities.response;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

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
