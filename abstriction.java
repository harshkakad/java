public class abstriction {
    public static void main(String[] args) {
      mustang m1=new mustang();
              
    }
}
abstract class animal{
    String colour;
    animal(){
        System.out.println("animal constructor called");
    }
    void eats(){
        System.out.println("animal eats") ;   
    }
    abstract void walk();
}

class cat extends animal{
    cat(){
        System.out.println("cat constructor called");
    }
     void changecolour (){
        colour="red colour";
    }
    void walk(){
        System.out.println(" cat walk on 4 leg");
    }
}
 class mustang extends cat{
    mustang(){
        System.out.println("mustang constructor callded");
    }

}
