package emi.ac.ma.mongoproject.controllers;

import emi.ac.ma.mongoproject.entities.Loan;
import emi.ac.ma.mongoproject.services.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/loans")
public class LoanController {

    @Autowired
    private LoanService loanService;

    @PostMapping
    public Loan addLoan(@RequestBody Loan loan) {
        return loanService.addLoan(loan);
    }

    @GetMapping
    public List<Loan> getAllLoans() {
        return loanService.getAllLoans();
    }

    @PutMapping("/return/{id}")
    public void returnLoan(@PathVariable String id) {
        loanService.returnLoan(id);
    }
}
