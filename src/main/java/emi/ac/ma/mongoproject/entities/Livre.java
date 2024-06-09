package emi.ac.ma.mongoproject.entities;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.List;

@Document()
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Livre {
    @Id
    @GeneratedValue
    private Long id;
    private String titre;
    private List<Long> adherents;
    private String isbn;
    private int nombreDeCopies;
    private boolean estDisponible;
    private String description;
    private String type;
    private String imagePath;
}
