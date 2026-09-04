// WaJP to print the area and perimeter of a rectangle and circle.

import java.util.Scanner;
public class hwprog2{
        public static void main(String args []) 
       
        {
         Scanner input = new Scanner (System.in);
        
        System.out.print("length of rectangle: ");
        int length = input.nextInt();
        
        System.out.print(" width of rectangle: ");
        int width = input.nextInt();
        
        int  perimeter = 2 * (length*width);
        int area = length*width;

         System.out.println("perimeter of rectangle: " + perimeter );
         System.out.println("Area of rectangle: "+ area );
        
        
    }
}