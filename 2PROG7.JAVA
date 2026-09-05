// write a java program of overloading take a input from user .

import java.util.Scanner;
public class unit2prog7{

    void sum(int A , int B)
    {
        System.out.println("sum of A+B = " + (A+B));
        
    }

    void sum(int A , int B,int C)
    {

    System.out.println("sum of A+B+C =" + (A+B+C));

    }

    public static void main(String args[])
    {

     Scanner input = new Scanner(System.in);

     unit2prog7 sum = new unit2prog7();

     System.out.print("please enter your first number:");
     int A = input.nextInt();

     System.out.print("please enter your second number:");
     int B = input.nextInt();

     System.out.print("please enter your third number: ");
     int C = input.nextInt();


     sum.sum(A,B);
     sum.sum(A,B,C);
    }
}