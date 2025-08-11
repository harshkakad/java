class Animal{
    String colour;
    Animal(){
        System.out.println("constructor called");
    }
}
class Dog extends Animal{
    Dog(){
        super();
        //super.colour="brown";
        System.out.println("dog barks");
    }
}


public class Suprclass{
    public static void main(String args[]){
       Dog d1=new Dog();
      // System.out.println(d1.colour);
       
       
       
       //System.out.println(d1.colour);
       
    }
}

