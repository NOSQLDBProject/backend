package emi.ac.ma.mongoproject.services.imp;

import emi.ac.ma.mongoproject.entities.Loan;
import emi.ac.ma.mongoproject.repositories.LoanRepository;
import emi.ac.ma.mongoproject.services.LoanService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanServiceImp implements LoanService {

    private final LoanRepository loanRepository;

    public LoanServiceImp(LoanRepository loanRepository) {
        this.loanRepository = loanRepository;
    }

    public Loan addLoan(Loan loan) {
        return loanRepository.save(loan);
    }

    public List<Loan> getAll() {
        return loanRepository.findAll();
    }

    public Loan updateLoan(Loan loan) {
        return loanRepository.save(loan);
    }

}
