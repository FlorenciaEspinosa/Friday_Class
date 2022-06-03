package Day_4;

public class Day_4_6 {
    public static void main(String[]args){
        // Why do we need logical operators?
        // To connect the conditions together
        // && -> AND
        // || -> OR
        // !  -> NOT


        myNumber(11);
    }

    public static void myNumber(int number) {
        if (number == 7 || number == 9 || number == 1) {
            System.out.println("It is my number");
        } else if (number >= 10 && number <= 20) {
            System.out.println("This is also my number");
        } else {
            System.out.println("It is not my number!");
        }

    }

}
