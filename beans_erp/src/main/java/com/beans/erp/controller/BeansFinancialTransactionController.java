package com.beans.erp.controller;

import com.beans.erp.model.FinancialTransaction;
import com.beans.erp.service.FinancialTransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/transactions")
public class BeansFinancialTransactionController {

    @Autowired
    private FinancialTransactionService transactionService;

    @GetMapping
    public String listTransactions(Model model) {
        model.addAttribute("transactions", transactionService.getAllTransactions());
        return "transactionList";
    }

    @GetMapping("/{id}")
    public String viewTransaction(@PathVariable Long id, Model model) {
        model.addAttribute("transaction", transactionService.getTransactionById(id));
        return "transactionView";
    }

    @PostMapping
    public String createTransaction(FinancialTransaction transaction) {
        transactionService.saveTransaction(transaction);
        return "redirect:/transactions";
    }

    @DeleteMapping("/{id}")
    public String deleteTransaction(@PathVariable Long id) {
        transactionService.deleteTransaction(id);
        return "redirect:/transactions";
    }

    // ... More CRUD operations ...
}
