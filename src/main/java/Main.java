import java.util.List;

public class Main {

    public static void main(String[] args) {


        ExerciseTwo exerciseTwo = new ExerciseTwo();

        System.out.println(exerciseTwo.nameWithMoreAmount());

        List<Expense<String, Integer>> result = exerciseTwo.getExpensesByCountry();

        result.forEach(x->System.out.println(x.getCountry()+" -> " +x.getAmount()));

    }

}
