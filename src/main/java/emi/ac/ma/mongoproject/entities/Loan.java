package emi.ac.ma.mongoproject.entities;

import lombok.*;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.Id;
import java.time.LocalDate;

@Document()
@Data
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Loan {
    @Id
    private Long id;
    @DBRef
    private Livre livre;
    @DBRef
    private Member member;
    private LocalDate loanDate = LocalDate.now();
    private LocalDate returnDate;
}

