package emi.ac.ma.mongoproject.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.neo4j.core.schema.GeneratedValue;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.data.neo4j.core.schema.Relationship;

import java.util.List;

@Node
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Auteur {

    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String biography;
    private String dateOfBirth;
    private String dateOfDeath;
    private List<Long> livres;
}