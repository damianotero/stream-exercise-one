// Create a list with bank transactions

// Create transaction class with (Name, Amount, Country)

// Create list with  Expenses (Country, Amount)

// Get the name with more expenses

// Get the Nth name with more expenses

import java.util.*;
import java.util.stream.Collectors;

public class ExerciseTwo<K,V> {

    private List<Transaction> transactions;

    public ExerciseTwo() {
        this.transactions = new ArrayList<>();
        addTransactions();
    }



    public String nameWithMoreAmount(){

        return transactions.stream()
                .max(Comparator.comparing(Transaction::getAmount))
                .get().getName();
    }



    public List<Expense<String, Integer>> getExpensesByCountry(){

        Map<String,Integer> expenses = transactions.stream()
                .collect(Collectors.groupingBy(Transaction::getCountry,Collectors.summingInt(Transaction::getAmount)));

        List<Expense<String,Integer>> result = new ArrayList<>();
                expenses.entrySet()
                .forEach(e -> result.add(new Expense<>(e.getKey(),e.getValue())));

        return result;
    }


    private void addTransactions(){
        transactions.add(new Transaction("Pepe", "Spain", 34000));
        transactions.add(new Transaction("John", "EEUU", 13100));
        transactions.add(new Transaction("Ivan", "Russia", 630));
        transactions.add(new Transaction("Maria", "Spain", 3300));
        transactions.add(new Transaction("Jose", "Portugal", 1200));
        transactions.add(new Transaction("michael", "UK", 2200));
        transactions.add(new Transaction("jose manuel", "Spain", 5004));
        transactions.add(new Transaction("Robert", "EEUU", 4600));
        transactions.add(new Transaction("lucia", "Italy", 54000));
        transactions.add(new Transaction("Jack", "UK", 460));
        transactions.add(new Transaction("Manolo", "Spain", 2400));
        transactions.add(new Transaction("Josefa", "Portugal", 3900));
        transactions.add(new Transaction("Eustaquio", "Portugal", 55000));
        transactions.add(new Transaction("Barbara", "EEUU", 8800));


    }
}
