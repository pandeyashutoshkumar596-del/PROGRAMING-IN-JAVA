// write a java program of overloading

public class unit2prog5{

    void sum (int A, int B)
    
    {

        System.out.println("sum of A + B = " + (A+B));

    }

    void sum(int A, int B,int C)

    {

     System.out.println("sum of A + B + c is:  " + (A+B+C));


    }

    public static void main(String args[])
    
    {
    unit2prog5  overloading = new unit2prog5();

      overloading.sum(10,20);
      overloading.sum(10,20,30);


    }


}