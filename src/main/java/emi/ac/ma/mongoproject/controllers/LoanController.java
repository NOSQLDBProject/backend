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

    @PutMapping("/update")
    public Loan updateLoan(@RequestBody Loan loan) {
        return loanService.updateLoan(loan);
    }


}
