package day_4;

public class Day_4_5 {
    public static void main(String[]args){
        //IF ELSE statement is a condition, we want to chek if something is true or not
        // 1. Only one statement will be executed.
        // 2. The order of if statements are important.
        // 3. else will be executed when all conditions above are false.
        if (5 > 3) {
            System.out.println("Yes");
        }

        if ('c' == 'r') {
            System.out.println("Yes, chars equal");
        }

        if (7 != 7) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }

        //using the method that we created
        System.out.println(getMax(43, 77));
    }

    //return something and it working with 2 arguments
    public static int getMax(int i, int i2) {
        if (i > i2) {
            return i;
        } else {
            return i2;
        }

    }
}
