package emi.ac.ma.mongoproject.entities;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Document()
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Loan {
    @Id
    @GeneratedValue
    private Long id;
    private Long adherentId;
    private Long livreId;
    private String loandate;
    private String returnDate;
}
