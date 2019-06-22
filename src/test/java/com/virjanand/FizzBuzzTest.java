package test.java.com.virjanand;

import main.java.com.virjanand.FizzBuzz;
import org.junit.Test;

import static java.util.Arrays.asList;
import static org.junit.Assert.assertEquals;

public class FizzBuzzTest {

    @Test
    public void number_givesListOfIntegersUpToNumber() {
        FizzBuzz fizzBuzz = new FizzBuzz();
        assertEquals(asList("1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15"), fizzBuzz.getNumbers(15));
    }
}
