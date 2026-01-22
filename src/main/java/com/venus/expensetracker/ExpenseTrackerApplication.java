package com.venus.expensetracker;

//import com.venus.expensetracker.enums.TransactionType;
//import com.venus.expensetracker.model.Transaction;
//import com.venus.expensetracker.model.User;
//import com.venus.expensetracker.repository.TransactionRepository;
//import com.venus.expensetracker.repository.UserRepository;

//import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.annotation.Bean;

//import java.math.BigDecimal;
//import java.time.LocalDate;
//import java.util.List;

@SpringBootApplication
public class ExpenseTrackerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ExpenseTrackerApplication.class, args);
    }
    
// CommandLineRunner for testing repository user and transaction

//    @Bean
//    CommandLineRunner testRepositories(
//            UserRepository userRepository,
//            TransactionRepository transactionRepository
//    ) {
//        return args -> {
//
//            // 1️⃣ Create User
//            User user = new User();
//            user.setName("Test User");
//            user.setEmail("test@example.com");
//            user.setPasswordHash("dummy_password");
//
//            userRepository.save(user);
//
//            System.out.println("User saved with ID: " + user.getUserId());
//
//            // 2️⃣ Create Income Transaction
//            Transaction income = new Transaction();
//            income.setUser(user);
//            income.setType(TransactionType.INCOME);
//            income.setAmount(new BigDecimal("50000"));
//            income.setCategory("Salary");
//            income.setTransactionDate(LocalDate.now());
//            income.setDescription("January Salary");
//
//            // 3️⃣ Create Expense Transaction
//            Transaction expense = new Transaction();
//            expense.setUser(user);
//            expense.setType(TransactionType.EXPENSE);
//            expense.setAmount(new BigDecimal("1500"));
//            expense.setCategory("Food");
//            expense.setTransactionDate(LocalDate.now());
//            expense.setDescription("Lunch");
//
//            transactionRepository.saveAll(List.of(income, expense));
//
//            System.out.println("Transactions saved");
//
//            // 4️⃣ Fetch transactions by user
//            List<Transaction> transactions =
//                    transactionRepository.findByUserUserId(user.getUserId());
//
//            System.out.println("Fetched Transactions:");
//            for (Transaction t : transactions) {
//                System.out.println(
//                        t.getType() + " | " +
//                        t.getCategory() + " | " +
//                        t.getAmount()
//                );
//            }
//        };
//    }
}
