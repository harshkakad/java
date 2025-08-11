public class polymoroverriding {
    public static void  main (String args[]){
        animal A1=new animal();
        A1.eats();
        fish f1=new fish();
        f1.eats();
    }
}

class animal{
    void eats(){
        System.out.println("animal eats");
    }
    
}
class fish extends animal{
    void eats(){
        System.out.println("fish eats ");
    }
 
}
