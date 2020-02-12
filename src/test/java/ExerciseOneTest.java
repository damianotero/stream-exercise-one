import org.junit.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;


public class ExerciseOneTest {

    ExerciseOne exerciseOne = new ExerciseOne();

    @Test
    public void getAverageAgeOfAGivenNationality_shouldReturnTheAverage() {

        double averageAgeOfSpain = exerciseOne.getAverageAgeOf("Spain");
        double averageAgeOfUK = exerciseOne.getAverageAgeOf("UK");

        assertThat(averageAgeOfSpain).isEqualTo(35.75);
        assertThat(averageAgeOfUK).isEqualTo(34);
    }
}