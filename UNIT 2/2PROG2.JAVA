//write a java program to multilevel inheritence

class Animal{
    void eat(){
        System.out.println("this animal is eating");
    }
}

class dog extends Animal{
    void bark(){
        System.out.println("the dog bark woaf! woaf!");
    }
}

class puppy extends dog{
    void weep(){
        System.out.println("puppy is weeping");
    }
}

public class unit2prog2{

    public static void main(String args[]){
        puppy mypuppy = new puppy();
        mypuppy.eat();
        mypuppy.bark();
        mypuppy.weep();
    }
}