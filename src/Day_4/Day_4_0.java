package Day_4;

public class Day_4_0 {
    //Pre and pro increment
    public static void main(String[]args){
        int num = 5;
        System.out.println(num); //5
        num = num + 1; //the same
        num += 1;      //the same //// post increment operator will increase value by 1
        System.out.println(num);//6

        ++num; //pre increment operator will increase value by 1

        int num1 = 20;
        System.out.println(num1++); //20 // post will have effect only when variable is used next time
        System.out.println(++num1); // 22 // pre will have effect right away

        int num3 = 10;
        num3 += 2;
        num3 *= 2;
        num3 /= 2;
        num3 -= 2;

    }
}
