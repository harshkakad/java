public class overloading {
    public static int calculator(int a,int b){
        return a*b;
    }
    public static int calculator(int a,int b,int c){
        return a*b+c;
    }
    
    public static void main(String args[]){
           System.out.println(calculator(9,8));
           System.out.println(calculator(3,4,4));
    }
}
