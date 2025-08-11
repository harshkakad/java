public class interfac2 {
    public static void main(String[] args) {
        beer b1=new beer();
        b1.vegitarion();
        b1.nonveg();

    }
}

interface harbivore {
    void vegitarion();
   
}

interface carnivor {
    void nonveg();
   
}
 class beer implements harbivore,carnivor{
     public void vegitarion(){
        System.out.println("beer eats keaf of the tree");
     }
     public void nonveg(){
        System.out.println("beer also eats animal in the forest");
     }
}