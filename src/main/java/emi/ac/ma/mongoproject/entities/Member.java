package emi.ac.ma.mongoproject.entities;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.time.LocalDate;

@Document()
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Member {
    @Id
    @GeneratedValue
    private Long id;
    private String name;
    private String email;
    private LocalDate memberSince = LocalDate.now();
}
