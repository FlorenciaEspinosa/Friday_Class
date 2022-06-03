package day_4;

public class Day_4_4 {
    public static void main(String[]args){
        // Comparison operators:
        // == "equal to" compares two primitives on equality
        // != "not equal" checks if two primitives are not equal
        // >, >=
        // <, <=

        //We are going to get a boolean true or false
        int num = 2;
        int num2 = 3;
        System.out.println(num == num2);//false, they are not equal
        System.out.println(num != num2);//true, they are not equal
        System.out.println(num > num2); //false, 2 is not bigger than 3
        System.out.println(num >= num2);//false, 2 is not bigger or equal than 3
        System.out.println(num < num2);//true, 3 is bigger than 2
        System.out.println(num <= num2);//true, 3 is equal or bigger than 2

    }
}
