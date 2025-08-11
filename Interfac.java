public class Interfac {
    public static void main(String[] args) {
        queen q1=new queen();
        q1.move();    
        // abstraction //abstract data type;
    }
}
interface chess{
    void move();
}

class king implements chess{
     public void move(){
        System.out.println("king moves in every direction by 1step");
    }
}
class elephant implements chess{
    public void move(){
       System.out.println("elephant moves in stright direction ");
   }
}
class queen implements chess{
    public void move(){
       System.out.println("queen moves in every direction ");
   }
}

