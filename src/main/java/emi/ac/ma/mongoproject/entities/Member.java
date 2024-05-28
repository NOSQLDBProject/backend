package emi.ac.ma.mongoproject.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "members")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Member {
    @Id
    private String id;
    private String name;
    private String email;
    private LocalDate memberSince = LocalDate.now();
}
