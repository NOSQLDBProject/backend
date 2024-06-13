package emi.ac.ma.mongoproject.services;

import emi.ac.ma.mongoproject.entities.Loan;

import java.util.List;

public interface LoanService {
    Loan addLoan(Loan loan);
    List<Loan> getAll();
    Loan updateLoan(Long loanId);

    void deleteLoan(Long loanId);
}
