package Day_2;

public class day_2_1 {
    public static void main(String[]args){
        // There are 8 primitives in java:
        // byte, short, int, long - the whole numbers
        // float, double - the floating numbers
        // char - single char between ''
        // boolean - for logical values (true or false)


        // whole numbers: the difference is the value that each of these primitives can hold
        // the default literal type of whole number is always int
        // -128 to 127
        byte bNum = 10;
        short shNum = 120;
        int num = 99;
        long lNum = 14328945234L;
        int age = 29;
        System.out.println(age);


        // floating numbers:
        // the default literal type of floating number is double
        double dNum = 99.99;
        float fNum = 1.9F;
        System.out.println(dNum);


        // char - for single character
        char ch = 'H';
        System.out.println(ch); // H
        char ch1 = 73;
        System.out.println(ch1); //I


        // boolean - data type for logical values (true or false)
        boolean isTimeForBreak = false;
        isTimeForBreak = true; //reassign
        System.out.println(isTimeForBreak); //true

        //Now we can start working with the + - / %
        //real math operations
        int number = 10;
        int number2 = 5;
        System.out.println(number + number2); //15
        System.out.println(number - number2); //5
        System.out.println(number / number2); //2
        System.out.println(number % number2); //0

        int number3 = 3;
        System.out.println(number / number3);//3 -> 3.333 the closest whole number

        //I can combine different types the variable



    }
}
