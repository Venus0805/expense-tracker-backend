package com.venus.expensetracker.repository;

import com.venus.expensetracker.model.Transaction;
import com.venus.expensetracker.enums.TransactionType;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface TransactionRepository extends JpaRepository<Transaction, Long> {

    List<Transaction> findByUserUserId(Long userId);

    List<Transaction> findByUserUserIdAndType(Long userId, TransactionType type);

    List<Transaction> findByUserUserIdAndTransactionDateBetween(
            Long userId,
            LocalDate startDate,
            LocalDate endDate
    );
}
