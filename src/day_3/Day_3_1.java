package day_3;

public class Day_3_1 {
    public static void main(String[] args) {
        // byte -> short -> int -> long -> float -> double

        // implicit casting, I am taking a small value and I want to store it in a bigger place
        // this one goes from byte to int
        byte bNum = 50;
        int intNum = bNum; // implicit casting
        System.out.println(intNum); // 50

        //this one goes from short to long
        short shNum = 299;
        long lNum = shNum;
        System.out.println(lNum); // 299


        //this one goes from long to float and double
        //and because now this is a float number it has .0
        long longNum = 100000;
        float floatNum = longNum;
        double doubleNum = floatNum;
        System.out.println(doubleNum); // 100000.0

        // byte -> short -> int -> long -> float -> double

        //++++++++++++++++++++++++++++++++++++++++++++
        // explicit casting
        double money = 99.99;
        //here I know that this double number can go inside a int variable
        // when we cast floating number to whole number the decimal points will be truncated
        int finalMoney = (int)money;
        System.out.println(finalMoney); // 99

        //I know that this long value can go inside an int variable
        long longValue = 5000L;
        int intValue = (int)longValue;
        System.out.println(intValue);


        int number = 1000;
        // if we have bigger value than the range of the type we are casting to
        // then we will get unexpected value
        byte byteValue = (byte)number;
        System.out.println(byteValue); // -24 randon value
    }
}
