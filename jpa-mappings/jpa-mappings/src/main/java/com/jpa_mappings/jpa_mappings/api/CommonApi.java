package com.jpa_mappings.jpa_mappings.api;

import java.util.Random;
import java.util.random.RandomGenerator;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import lombok.RequiredArgsConstructor;

import com.jpa_mappings.jpa_mappings.entity.AccountBudgetEntity;
import com.jpa_mappings.jpa_mappings.entity.ExpenseAccountEntity;
import com.jpa_mappings.jpa_mappings.entity.ExpenseDetailsEntity;
import com.jpa_mappings.jpa_mappings.repository.AccountBudgetRepository;
import com.jpa_mappings.jpa_mappings.repository.ExpenseAccountRepository;
import com.jpa_mappings.jpa_mappings.repository.ExpenseDetailsRepository;

@RestController
@RequiredArgsConstructor
public class CommonApi {

    private final ExpenseAccountRepository expenseAccountRepository;

    private final ExpenseDetailsRepository expenseDetailsRepository;

    private final AccountBudgetRepository accountBudgetRepository;

    @GetMapping("/createExpenseAccount")
    public String createExpenseAccount() {
        final ExpenseAccountEntity expenseAccountEntity = new ExpenseAccountEntity();
        expenseAccountEntity.setAccountId("Travel1"+ new Random().nextInt(1000));
        expenseAccountRepository.save(expenseAccountEntity);
        return "Expense Account created successfully";
    }

    @GetMapping("/createExpenseDetails")
    public String createExpenseDetails() {
        final ExpenseAccountEntity expenseAccountEntity = expenseAccountRepository.findById(1)
                                                                                  .get();
        final ExpenseDetailsEntity expenseDetailsEntity = new ExpenseDetailsEntity();
        expenseDetailsEntity.setExpenseType("Travel");
        expenseDetailsEntity.setExpenseAccountEntity(expenseAccountEntity);
        expenseDetailsRepository.save(expenseDetailsEntity);
        return "Expense Details created successfully";
    }

    @GetMapping("/createAccountBudget")
    public String createAccountBudget() {
        final ExpenseAccountEntity expenseAccountEntity = expenseAccountRepository.findById(1)
                                                                                  .get();
        final AccountBudgetEntity accountBudgetEntity = new AccountBudgetEntity();
        accountBudgetEntity.setBudget(1000);
        accountBudgetEntity.setExpenseAccountEntity(expenseAccountEntity);
        accountBudgetRepository.save(accountBudgetEntity);
        return "Account Budget created successfully";
    }

    @DeleteMapping("/deleteExpenseAccount")
    public String deleteExpenseAccount() {
        expenseAccountRepository.deleteById(1);
        return "Expense Account deleted successfully";
    }

    @DeleteMapping("/deleteExpenseDetails")
    public String deleteExpenseDetails() {
        expenseDetailsRepository.deleteById(1);
        return "Expense Details deleted successfully";
    }

    @GetMapping("/deleteAccountBudget")
    public String deleteAccountBudget() {
        accountBudgetRepository.deleteById(1L);
        return "Account Budget deleted successfully";
    }
}
