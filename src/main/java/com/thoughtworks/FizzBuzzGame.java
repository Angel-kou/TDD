package com.thoughtworks;

import java.util.ArrayList;
import java.util.List;


public class FizzBuzzGame {
    private List<String> results = new ArrayList<>();

    public void start(int count) {
        int x = 1;
        String say ;
        while (x <= count){
            say = getSayNumber(x);
            results.add(say);
            x++;
        }
    }

    public String getSayNumber(int x) {
        String res ;
        if(isTheNumberContainsThree(x)){
            res = "Fizz";
        }else if(isTheMultiplesofThreeAndFiveAndSeven(x)){
            res = "FizzBuzzWhizz";
        }else if(isTheMultiplesofThreeAndFive(x)){
            res = "FizzBuzz";
        }else if(isTheMultiplesofThreeAndSeven(x)){
            res = "FizzWhizz";
        }else if(isTheMultiplesofFiveAndSeven(x)){
            res = "BuzzWhizz";
        }else if(isTheMultiplesofThree(x)){
            res = "Fizz";
        }else if(isTheMultiplesofFive(x)){
            res = "Buzz";
        }else if(isTheMultiplesofSeven(x)){
            res = "Whizz";
        }else{
            res = String.valueOf(x);
        }
        return res;
    }


    public boolean isTheNumberContainsThree(int x) {
        if(String.valueOf(x).contains(String.valueOf(3))){
            return true;
        }
        return false;
    }


    public boolean isTheMultiplesofThreeAndFiveAndSeven(int x) {
        if(x%3==0 && x%5==0 && x%7==0){
            return true;
        }
        return false;
    }


    public boolean isTheMultiplesofFiveAndSeven(int x) {
        if(x%5==0 && x%7==0){
            return true;
        }
        return false;
    }

    public boolean isTheMultiplesofThreeAndSeven(int x) {
        if(x%3==0 && x%7==0){
            return true;
        }
        return false;
    }

    public boolean isTheMultiplesofThreeAndFive(int x) {
        if(x%3==0 && x%5==0){
            return true;
        }
        return false;
    }

    public boolean isTheMultiplesofSeven(int x) {
        if (x % 7 == 0) {
            return true;
        }
        return false;
    }

    public boolean isTheMultiplesofFive(int x) {
        if (x % 5 == 0) {
            return true;
        }
        return false;
    }

    public boolean isTheMultiplesofThree(int x) {
        if (x % 3 == 0) {
            return true;
        }
        return false;
    }


    public List<String> getResults() {
        return results;
    }
}


