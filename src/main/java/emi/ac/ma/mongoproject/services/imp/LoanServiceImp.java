package emi.ac.ma.mongoproject.services.imp;

import emi.ac.ma.mongoproject.entities.Livre;
import emi.ac.ma.mongoproject.entities.Loan;
import emi.ac.ma.mongoproject.repositories.LivreRepository;
import emi.ac.ma.mongoproject.repositories.LoanRepository;
import emi.ac.ma.mongoproject.services.LoanService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class LoanServiceImp implements LoanService {
    private final LoanRepository loanRepository;
    private final LivreRepository livreRepository;

    public LoanServiceImp(LoanRepository loanRepository, LivreRepository livreRepository) {
        this.loanRepository = loanRepository;
        this.livreRepository = livreRepository;
    }

    public Loan addLoan(Loan loan) {
        Livre livre = livreRepository.findById(loan.getLivre().getId()).orElseThrow();
        if (livre.getNombreDeCopies() > 0) {
            livre.setNombreDeCopies(livre.getNombreDeCopies() - 1);
            livreRepository.save(livre);
            return loanRepository.save(loan);
        } else {
            throw new RuntimeException("No copies available");
        }
    }

    public List<Loan> getAllLoans() {
        return loanRepository.findAll();
    }

    public void returnLoan(String id) {
        Loan loan = loanRepository.findById(id).orElseThrow();
        loan.setReturnDate(LocalDate.now());
        loanRepository.save(loan);

        Livre livre = livreRepository.findById(loan.getLivre().getId()).orElseThrow();
        livre.setNombreDeCopies(livre.getNombreDeCopies() + 1);
        livreRepository.save(livre);
    }
}
