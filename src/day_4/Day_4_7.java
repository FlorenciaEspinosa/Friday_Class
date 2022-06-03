package day_4;

public class Day_4_7 {
    public static void main(String[]args){
        // java.lang.Math is helper class for some math manipulations.

        // Math.abs(int number) returns absolute(positive) value of its parameter.
        int num = Math.abs(10);
        int numTwo = Math.abs(-10);
        System.out.println(num); //10
        System.out.println(numTwo); //10

        // Math.ceil(double d) rounds a decimal point value to the bigger integer value
        double dNum = Math.ceil(3.01);
        System.out.println(dNum); // 4.0

        // Math.floor(double d) rounds a decimal point value to the nearest smaller integer value
        double dNum2Floor = Math.floor(8.99); // round down
        System.out.println(dNum2Floor); // 8.0

        // Math.round(double d) rounds to the nearest integer
        // when the value is in the middle, Math.round() will round up.
        double dNum3Round = Math.round(23.445);
        System.out.println(dNum3Round); // 23.0

        System.out.println(getDiff(-20, 40));
    }

    //we can use this so we always get a positive value
    public static int getDiff(int num, int num2) {
        return Math.abs(num - num2);
    }
}
