public class callbyvalue {
    public static void swap(int a,int b){
        int temp;
         temp=a;
         a=b;
         b=temp;
    
        // System.out.println("enter the value  of a:"+a);
         //System.out.println("enter the value  of b:"+b);
    }
    public static void main(String args[]){
        int a=12;
        int b=14;
         swap(a,b);



         System.out.println("enter the value  of a:"+a);
         System.out.println("enter the value  of b:"+b);
    }     



    
}
