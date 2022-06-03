package Day_4;

public class Day_4_2 {
    //Return type

    // void method doesn't return a value
    // return type methods must return value
    // method arguments are used to pass input data to out methods
    public static void main(String[]args){
        //we can create a variable or just print
        String value = getHello();
        System.out.println(value);

        System.out.println(getHello());

        System.out.println(getAge());

        //I have to provide the arguments that my method needs
        System.out.println(sum(2,3));
    }

    //we know this is going to return a String
    public static String getHello() {
        String result = "hello class";
        result = "hello world";
        return result;
    }
    //We can create as many method as we want
    //this method is going to return int
    public static int getAge() {
        int age = 55;
        return age;
        // return statement returns the value and exists from the method
    }

    // We provide input data to our methods via method arguments
    // method arguments is the way we pass data to our method
    // input -> process -> output
    public static int sum(int numOne, int numTwo) {
        int result = numOne + numTwo;
        return result;
    }
}
