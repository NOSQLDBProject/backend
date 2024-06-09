package emi.ac.ma.mongoproject.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import javax.persistence.GeneratedValue;
import java.util.List;

@Node
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class LivreNeo4j {
    @Id
    @GeneratedValue
    private Long id;
    private String titre;
    private List<Long> adherents;
    private Long isbn;
    private int nombreDeCopies;
    private boolean estDisponible;
    private String type;
    private String imagePath;
    private Auteur auteur;

}
