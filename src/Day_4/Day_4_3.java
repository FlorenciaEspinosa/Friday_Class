package Day_4;

public class Day_4_3 {
    // Method overloading is when we have multiple methods with same name but different arguments:
    // - different number of arguments
    // - different type of argument/s
    public static void main(String[]args){
        System.out.println(sum(12,4));
        System.out.println(sum(3,6,2));
        System.out.println(sum(1.2,3.4));


    }
    public static int sum(int i, int i2) {
        return i + i2;
    }

    public static int sum(int i, int i2, int i3) {
        return i + i2 + i3;
    }

    public static double sum(double d, double d2) {
        return d + d2;
    }
}
