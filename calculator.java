import java.util.*;
public class calculator {

    public static void main(String argr){
        Scanner sc=new Scanner(System.in);
        int income=sc.nextInt();
        int tax;
        if(income<=500000){
            tax=0;

        }
        else if(income>=600000 && income<=1000000){
            tax=(int) (income*0.4);
        }
        else{
            tax=(int) (income*0.6);
        }
        
        System.out.println( "your tax is:"+tax);
    }
}

    

