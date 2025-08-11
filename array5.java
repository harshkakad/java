import java.util.*;
public class array5 {
    public static int largestnum(int number[]){
        int largest=Integer.MIN_VALUE;
        for(int i=0;i<number.length;i++){
             if(largest<number[i]){
                largest=number[i];
             }
             
        }
        return largest;
        
    }

    public static void main(String[] args) {
        int number[]={1,2,6,4};
        System.out.print("larggest no is:"+largestnum(number));
    }
    
}
