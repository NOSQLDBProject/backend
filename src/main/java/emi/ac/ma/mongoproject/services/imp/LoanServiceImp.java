package emi.ac.ma.mongoproject.services.imp;

import emi.ac.ma.mongoproject.entities.Adherent;
import emi.ac.ma.mongoproject.entities.Livre;
import emi.ac.ma.mongoproject.entities.Loan;
import emi.ac.ma.mongoproject.repositories.AdherentRepository;
import emi.ac.ma.mongoproject.repositories.LivreRepository;
import emi.ac.ma.mongoproject.repositories.LoanRepository;
import emi.ac.ma.mongoproject.services.LoanService;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

@Service
public class LoanServiceImp implements LoanService {

    private final LoanRepository loanRepository;
    private final AdherentRepository adherentRepository;
    private final LivreRepository livreRepository;

    public LoanServiceImp(LoanRepository loanRepository, AdherentRepository adherentRepository, LivreRepository livreRepository) {
        this.loanRepository = loanRepository;
        this.adherentRepository = adherentRepository;
        this.livreRepository = livreRepository;
    }

    public Loan addLoan(Loan loan) {
        Adherent adherent = adherentRepository.findById(loan.getAdherentId()).orElse(null);
        adherent.getLivresLoaned().add(loan.getLivreId());
        adherentRepository.save(adherent);
        Livre livre = livreRepository.findById(loan.getLivreId()).orElse(null);
        livre.setNombreDeCopies(livre.getNombreDeCopies() - 1);
        if(livre.getNombreDeCopies() == 0) {
            livre.setEstDisponible(false);
        }
        livre.getAdherents().add(loan.getAdherentId());
        livreRepository.save(livre);
        LocalDateTime currentDate = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String dateString = currentDate.format(formatter);
        loan.setLoandate(dateString);
        return loanRepository.save(loan);
    }

    public List<Loan> getAll() {
        return loanRepository.findAll();
    }

    public Loan updateLoan(Long loanId) {

        Loan updatedLoan = loanRepository.findById(loanId).orElse(null);

        LocalDateTime currentDate = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm");
        String dateString = currentDate.format(formatter);
        updatedLoan.setReturnDate(dateString);
        return loanRepository.save(updatedLoan);
    }

}
