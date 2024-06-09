package emi.ac.ma.mongoproject.entities;

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
public class Adherent {
    @Id
    @GeneratedValue
    private Long id;
    private String nom;
    private String prenom;
    private String cin;
    private String email;
    private String telephone;
    private List<Long> livresLoaned;
}
