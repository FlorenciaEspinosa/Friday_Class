package day_4;

import java.util.Random;

public class Day_4_8 {
    // 1. create instance(object) of Random class
    // 'new' is used to create objects.
    //this is going to give you Random numbers
    public static void main(String[]args){
        Random random = new Random();
        int randomNumber = random.nextInt(101); //I can get any value between 0 and 100
        System.out.println(randomNumber);


        int rNumberForStudent = random.nextInt(5);
        if (rNumberForStudent == 0) {
            System.out.println("Agatha");

        } else if (rNumberForStudent == 1) {
            System.out.println("Cristina");

        } else if (rNumberForStudent == 2) {
            System.out.println("Erik");

        } else if (rNumberForStudent == 3) {
            System.out.println("Gustavo");

        } else {
            System.out.println("Maksym");
        }


        //The switch expression is evaluated once and that value is compared with each case
        // when we have more complex condition, it is good to use if else statements
        // when we have simple mapping, it is good to use switch statement
        int numberStudent = 4;
        switch(numberStudent) {
        case 0:
        System.out.println("Agatha!");
        break;
        case 1:
        System.out.println("Cristina!");
        break;
        case 2:
        System.out.println("Erik!");
        break;
        default:
        System.out.println("Maksym!");
    }
    }

}
