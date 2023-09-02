import com.example.finalproject.model.Budget;
import com.example.finalproject.model.Category;
import com.example.finalproject.model.transaction.Transaction;
import com.example.finalproject.repository.BudgetRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Service
public class BudgetService {
    private final BudgetRepository budgetRepository;
    private final CategoryService categoryService;
    private final TransactionService transactionService;

    @Autowired
    public BudgetService(BudgetRepository budgetRepository, CategoryService categoryService, TransactionService transactionService) {
        this.budgetRepository = budgetRepository;
        this.categoryService = categoryService;
        this.transactionService = transactionService;
    }
    public void create(Budget budget) {
        budgetRepository.save(budget);
    }

    public Budget getBudgetById(Long id) {
        return budgetRepository.findById(id).get();
    }

    public Budget getBudgetByName(String name) {
        return budgetRepository.findByName(name);
    }

    public List<Budget> getAllBudgets() {
        return budgetRepository.findAll();
    }

    public List<String> getBudgetCategoriesByName(String name) {
        List<String> categoryNames = new ArrayList<>();
        for ( Category c : categoryService.getCategoriesOfBudget(getBudgetByName(name).getId())) {
            categoryNames.add(c.getName());
        }
        return categoryNames;
    }

    public Double getTransactionsForBudgetAsTotalNumber(String budgetName) {
        Set<Long> categoryIds = new HashSet<>();
        Double totalExpenseAmount = Double.valueOf(0);
        for ( Category c : categoryService.getCategoriesOfBudget(getBudgetByName(budgetName).getId())) {
            categoryIds.add(c.getId());
        }
        for (Transaction t : transactionService.getTransactions()) {
            if (categoryIds.contains(t.getCategory().getId())) {
                totalExpenseAmount += t.getAmount();
            }
        }

        return totalExpenseAmount;
    }

    public void updateBudget(Budget budget) {
        budget.setId(getBudgetByName(budget.getName()).getId());
        budgetRepository.save(budget);
    }

    public void deleteBudgetById(Long id) {
        List<Category> allCategories = categoryService.getAllCategories();

        for (Category c : allCategories) {
            if (c.getBudget().getId().equals(id)) {
                categoryService.deleteCategoryById(c.getId());
            }
        }
        budgetRepository.deleteById(id);
    }

    public void deleteBudgetByName(String name) {
        System.out.println(getBudgetByName(name));
        List<Category> allCategories = categoryService.getAllCategories();

        for (Category c : allCategories) {
            if (c.getBudget().getId().equals(getBudgetByName(name).getId())) {
                categoryService.deleteCategoryById(c.getId());
            }
        }
        budgetRepository.deleteById(getBudgetByName(name).getId());
    }
}

