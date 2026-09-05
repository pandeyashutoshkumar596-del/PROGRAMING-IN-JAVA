// write a java program of overridding..


class A {

    void sum(int A, int B) 

    {

     System.out.println("sum of A + B = " + (A+B));

    }

}

    class B extends A{

        void sum(int A , int B)
        
        {
       
        System.out.println("sum of A + B is" + (A+B));
   
        }
    }

    


public class unit2prog6{

public static void main (String args[])

{

B sum = new B();

sum.sum(20,50);
sum.sum(20,30);

}
 
}