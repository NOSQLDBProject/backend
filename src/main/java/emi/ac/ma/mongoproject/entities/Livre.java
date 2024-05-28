package emi.ac.ma.mongoproject.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "livres")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Livre {
    @Id
    private String id;
    private String titre;
    @DBRef
    private Auteur auteur;
    private String isbn;
    private int nombreDeCopies;
    private boolean estDisponible;
}
