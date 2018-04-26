package com.thoughtworks;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.IsEqual.equalTo;

public class FizzBuzzGameTest {
    @Test
    public void should_return_Fizz_when_have_3() {
        FizzBuzzGame fng = new FizzBuzzGame();
        String res = fng.getSayNumber(35);
        assertThat(res,equalTo("Fizz"));
    }

    @Test
    public void should_return_FizzBuzzWhizz_when_is_multiples_of_357_and_not_contains_3() {
        FizzBuzzGame fng = new FizzBuzzGame();
        String res = fng.getSayNumber(105);
        assertThat(res,equalTo("FizzBuzzWhizz"));
    }

    @Test
    public void should_return_FizzBuzz_when_is_multiples_of_35_and_not_contains_3() {
        FizzBuzzGame fng = new FizzBuzzGame();
        String res = fng.getSayNumber(15);
        assertThat(res,equalTo("FizzBuzz"));
    }

    @Test
    public void should_return_FizzWhizz_when_is_multiples_of_37_and_not_contains_3() {
        FizzBuzzGame fng = new FizzBuzzGame();
        String res = fng.getSayNumber(21);
        assertThat(res,equalTo("FizzWhizz"));
    }

    @Test
    public void should_return_BuzzWhizz_when_is_multiples_of_57_and_not_contains_3() {
        FizzBuzzGame fng = new FizzBuzzGame();
        String res = fng.getSayNumber(70);
        assertThat(res,equalTo("BuzzWhizz"));
    }

    @Test
    public void should_return_Fizz_when_is_multiples_of_3() {
        FizzBuzzGame fng = new FizzBuzzGame();
        String res = fng.getSayNumber(6);
        assertThat(res,equalTo("Fizz"));
    }

    @Test
    public void should_return_Buzz_when_is_multiples_of_5() {
        FizzBuzzGame fng = new FizzBuzzGame();
        String res = fng.getSayNumber(10);
        assertThat(res,equalTo("Buzz"));
    }

    @Test
    public void should_return_Whizz_when_is_multiples_of_7() {
        FizzBuzzGame fng = new FizzBuzzGame();
        String res = fng.getSayNumber(7);
        assertThat(res,equalTo("Whizz"));
    }

    @Test
    public void should_return_true_when_is_multiples_of_3() {
        FizzBuzzGame fng = new FizzBuzzGame();
        boolean res = fng.isTheMultiplesofThree(3);
        assertTrue("res is true",res);
    }

    @Test
    public void should_return_true_when_is_multiples_of_5() {
        FizzBuzzGame fng = new FizzBuzzGame();
        boolean res = fng.isTheMultiplesofFive(5);
        assertTrue("res is true",res);
    }

    @Test
    public void should_return_true_when_is_multiples_of_7() {
        FizzBuzzGame fng = new FizzBuzzGame();
        boolean res = fng.isTheMultiplesofSeven(7);
        assertTrue("res is true",res);
    }

    @Test
    public void should_return_true_when_is_multiples_of_35() {
        FizzBuzzGame fng = new FizzBuzzGame();
        boolean res = fng.isTheMultiplesofThreeAndFive(15);
        assertTrue("res is true",res);
    }

    @Test
    public void should_return_true_when_is_multiples_of_37() {
        FizzBuzzGame fng = new FizzBuzzGame();
        boolean res = fng.isTheMultiplesofThreeAndSeven(21);
        assertTrue("res is true",res);
    }

    @Test
    public void should_return_true_when_is_multiples_of_57() {
        FizzBuzzGame fng = new FizzBuzzGame();
        boolean res = fng.isTheMultiplesofFiveAndSeven(70);
        assertTrue("res is true",res);
    }

    @Test
    public void should_return_true_when_is_multiples_of_357() {
        FizzBuzzGame fng = new FizzBuzzGame();
        boolean res = fng.isTheMultiplesofThreeAndFiveAndSeven(105);
        assertTrue("res is true",res);
    }

    @Test
    public void should_return_true_when_is_contains_3() {
        FizzBuzzGame fng = new FizzBuzzGame();
        boolean res = fng.isTheNumberContainsThree(13);
        assertTrue("res is true",res);
    }
}
