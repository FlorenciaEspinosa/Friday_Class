package day_3;
import util.InputFromUser;

public class Day_3_0 {
    // local variables are: created inside methods and statements
    // - they cannot be visible outside of the block where it was created
    // - they don't have default values
    // - they cannot have access modifiers

    // instance variables: class level variables. They will be properties
    // of the object that will be created from that class.
    //they are created under class
    // they have default values
    //they can have access modifiers

    // static variables are global variables. They are accessible within all objects
    // from that class. They belong to the class and not to specific object. We use
    // static variables by class name.

    public static void main(String[] args) {

        String userColor = InputFromUser.getInput("What's your name?");
        System.out.println("Your name is " + userColor);

        System.out.println("Enter two values:InputFromUser ");
        String value = InputFromUser.getInput();
        String value2 = InputFromUser.getInput();
        System.out.println("value: " + value);
        System.out.println("value2: " + value2);

//++++++++++++++++++++++++++++++++++++++++++++++++++++++++++=

        String answer = InputFromUser.getInput("Where are you from?");

        System.out.println("You are from " + answer);

        String answerTwo = InputFromUser.getInput("How are you?");
        System.out.println("You are : " + answerTwo + " year old");
    }
}
