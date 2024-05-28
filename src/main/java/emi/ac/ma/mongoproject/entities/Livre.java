package emi.ac.ma.mongoproject.entities;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;

@Document()
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Livre {
    @Id
    private Long id;
    private String titre;
    @DBRef
    private Auteur auteur;
    private String isbn;
    private int nombreDeCopies;
    private boolean estDisponible;
}
