package day_4;

public class Day_4_1 {
    //method is a block of code, we write ones and we can use it as many time as we want
    //we use the methos's name inside the main method
    //VOID METHOD
    public static void main(String[]args){
        printHelloClass();
        sayHello("Flora"); //I dont have to print because my method is already doing that
    }

    // void means method doesn't return a value
    //CHANGE THE VALUE AND SHOW HOW IT WILL PRINT EVERYTHING THAT I HAVE IN THE METHOD
    public static void printHelloClass() {
        System.out.println("hello, class!");
        System.out.println("hello, class!");
        System.out.println("hello, class!");
    }

    // We provide input data to our methods via method arguments
    //if we want to use this method we have to provide the input value
    //we can have as many arguments as we want but usually no more than 4/5
    // method arguments is the way we pass data to our method
    // input -> process -> output
    public static void sayHello(String name) {
        System.out.println("Hello, " + name + "!");
    }

    public static void printInfo(String name, int age, String address) {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Address: " + address);
    }
}
