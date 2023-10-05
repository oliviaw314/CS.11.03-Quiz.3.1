import java.util.Scanner;

public class Main {

    // Question 1 - calculateGrade
    public static char calculateGrade(int grade) {
        if (grade>=90) {
            return 'A';
        }
        if (grade>=80) {
            return 'B';
        }
        if (grade>=70) {
            return 'C';
        }
        if (grade>=60) {
            return 'D';
        }
        if (grade>=50) {
            return 'E';
        }
            return 'F';
    }
    // Question 2 - fizzBuzz
    public static String fizzBuzz(int num) {
        if (num%3==0 && num%5==0) {
            return "fizzbuzz";
        }
        if (num%3==0) {
            return "fizz";
        }
        if (num%5==0) {
            return "buzz";
        }
        return "unlucky";
    }

    // Question 3 - frontBack
    public static String frontBack(String word) {
        if (word.length()<2) {
            return word;
        }
        String firstTwo = word.substring(0,2);
        return firstTwo+word+firstTwo;
    }
    // Question 4 - twoAsOne
public static boolean twoAsOne(int num1, int num2, int num3) {
        if ((num1+num2==num3)||(num1+num3==num2)||(num2+num3==num1)) {
            return true;
        }
        return false;
}
    // Question 5 - endUp
public static String endUp(String word) {
        if (word.length()<3) {
            return word.toUpperCase();
        }
    String capital = word.substring(word.length()-3).toUpperCase();
        return word.substring(0,word.length()-3)+capital;
}
}
