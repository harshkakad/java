public class fact1 {
    public static int factorial(int n){
        int f=1;
        for( int i=1;i<=n;i++){
              f=f*i;
        }
        return f;
    }

    public static int binomial(int n,int r){
         int a=factorial(n);
         int b=factorial(r);
         int c=factorial(n-r);
         int bio=a/(b*c);
         return bio;

    }
         


    
    public static void main(String[] args) {
        
         
         System.out.println(binomial(16, 5));

    }
}
