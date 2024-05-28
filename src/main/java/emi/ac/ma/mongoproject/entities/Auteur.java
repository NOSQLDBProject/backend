package emi.ac.ma.mongoproject.entities;

import emi.ac.ma.mongoproject.entities.Livre;
import lombok.*;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.List;

@Document
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Auteur {
    @Id
    private Long id;
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
