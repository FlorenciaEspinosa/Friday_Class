package day_2;

public class Day_2_0 {
    //String name;
    /* Comments we use this for information
     *
     */


    public static void main(String[]args) {
        System.out.println("Hello"); //this is going to create a new line after the output
        System.out.print("hello");//doesnt add a new line after the output
        System.out.println("\nJava"); //we are going to get an extra line
        System.out.println("\"Hello\""); //this is going to add ""
        System.out.println("hi"+"\t"+"hello"); //create an space


        //variables can hold data inside our program
        //this is like a box
        //we need to create, assign a value and then we can use it
        String name;
        name = "Florencia";
        System.out.println(name);

        //reassign
        name = "Andrea";
        System.out.println(name);

        //We can declare more than one variable in the same line
        //String firstName, lastName; I can declare and the assign a value

        String firstName = "hi" , lastName = "hello";
        System.out.println(firstName + " " + lastName);
        System.out.println("My name is " + name);


        //HOMEWORK
        //Create two String variable and one int variable and print everything together
        //add extra world if it is necessary
        String car = "Honda";
        int price = 1000;
        System.out.println("My car " + " " + car);


    }
}
