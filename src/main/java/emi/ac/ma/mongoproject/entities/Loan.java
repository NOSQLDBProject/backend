package emi.ac.ma.mongoproject.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.DBRef;
import org.springframework.data.mongodb.core.mapping.Document;

import java.time.LocalDate;

@Document(collection = "loans")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Loan {
    @Id
    private String id;
    @DBRef
    private Livre livre;
    @DBRef
    private Member member;
    private LocalDate loanDate = LocalDate.now();
    private LocalDate returnDate;
}

