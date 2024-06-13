package emi.ac.ma.mongoproject.controllers;

import emi.ac.ma.mongoproject.entities.Loan;
import emi.ac.ma.mongoproject.services.LoanService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/loans")
@CrossOrigin("*")
public class LoanController {

    private final LoanService loanService;

    public LoanController(LoanService loanService) {
        this.loanService = loanService;
    }

    @PostMapping("/add")
    public Loan createLoan(@RequestBody Loan loan) {
        return loanService.addLoan(loan);
    }

    @GetMapping("/all")
    public List<Loan> getAllLoans() {
        return loanService.getAll();
    }

    @PutMapping("/update/{id}")
    public Loan updateLoan(@PathVariable Long id) {
        return loanService.updateLoan(id);
    }

    @DeleteMapping("/delete/{id}")
    public void deleteLoan(@PathVariable Long id) {
        loanService.deleteLoan(id);
    }


}
