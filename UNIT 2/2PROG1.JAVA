//write a java program of single inheritence?

class  Animal{

    void eat(){
     System.out.println("this animal eats food");
    }
}

class dog extends Animal{
    void bark(){
        System.out.println("the dog bark- woaf! woaf!");
    }
}

public class unit2prog1{

    public static void  main (String args[]){
    
    dog mydog = new dog();
    mydog.eat();
    mydog.bark();
  
    }
}