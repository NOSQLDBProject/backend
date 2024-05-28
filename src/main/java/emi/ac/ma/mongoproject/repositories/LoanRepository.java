package emi.ac.ma.mongoproject.repositories;

import emi.ac.ma.mongoproject.entities.Loan;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface LoanRepository extends MongoRepository<Loan, String> {
}
