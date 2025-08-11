import java.util.Scanner;

public class fact {
    public static int factorial(int n){
        int f=1;
        for( int i=1;i<=n;i++){
              f=f*i;
        }
        return f;
    }
    public static void main(String args[]){
         //int fact=factorial(4);
       // System.out.println(fact);
       Scanner sc=new Scanner(System.in);
       System.out.print("Enter the number");
       int n=sc.nextInt();

    }
    
}
