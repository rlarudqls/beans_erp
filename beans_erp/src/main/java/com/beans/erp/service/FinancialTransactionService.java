// src/main/java/com/beans/erp/service/FinancialTransactionService.java

package com.beans.erp.service;

import com.beans.erp.model.FinancialTransaction;
import com.beans.erp.repository.FinancialTransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FinancialTransactionService {

    @Autowired
    private FinancialTransactionRepository financialTransactionRepository;

    public List<FinancialTransaction> getAllTransactions() {
        return financialTransactionRepository.findAll();
    }

    public FinancialTransaction getTransactionById(Long id) {
        return financialTransactionRepository.findById(id).orElse(null);
    }

    public FinancialTransaction saveTransaction(FinancialTransaction transaction) {
        return financialTransactionRepository.save(transaction);
    }

    public void deleteTransaction(Long id) {
        financialTransactionRepository.deleteById(id);
    }
}
