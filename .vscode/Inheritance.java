public class Inheritance {
    public static void main(String args[]){
      fish F1=new fish();
      F1.breadth();
      animal A1=new  animal();
      A1.eats();
    }
}
class animal{
    
    void eats(){
        System.out.print("animal eats");
    }
    void breadth(){
        System.out.println("animal breadth");
    }
}
class fish extends animal{
    void size(){
        System.out.println("larger in length");

    }

}
