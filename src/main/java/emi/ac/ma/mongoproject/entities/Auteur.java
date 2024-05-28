package emi.ac.ma.mongoproject.entities;

import emi.ac.ma.mongoproject.entities.Livre;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "auteurs")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Auteur {
    @Id
    private String id;
    private String nom;
    private String prenom;
    private String dateDeNaissance;
    private String dateDeDeces;
    private String nationalite;
    private String biographie;
    private String photo;
    @DBRef
    private List<Livre> livres;
}
