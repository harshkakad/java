public class reverse {
    public static void main(String[] args) {
        
    
    int number=26102004;
    while(number>0){ 
        int lastdigit = number%10;
        System.out.print(lastdigit);
        number = number/10;
        

    }
    }
}