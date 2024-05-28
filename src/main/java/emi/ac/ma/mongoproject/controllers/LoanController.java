package emi.ac.ma.mongoproject.controllers;

import emi.ac.ma.mongoproject.entities.Loan;
import emi.ac.ma.mongoproject.services.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
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
    public Loan addLoan(@RequestBody Loan loan) {
        return loanService.addLoan(loan);
    }

    @GetMapping("/all")
    public List<Loan> getAllLoans() {
        return loanService.getAllLoans();
    }

    @PutMapping("/return/{id}")
    public void returnLoan(@PathVariable Long id) {
        loanService.returnLoan(id);
    }
}
