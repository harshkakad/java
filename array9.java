import java.util.*;
public class array9 {
      public static void subarray( int number[]){
        int ts=0;
        int largest = Integer.MIN_VALUE ;
        int minimum = Integer.MAX_VALUE ;
        for(int i=0;i<number.length;i++){
           int start= i;
            for(int j=i;j<number.length;j++){
                int end=j;
                int sum = 0 ;
                
                for(int k=start;k<=end;k++){
                    System.out.print(number[k]+" ");
                    sum = sum + number[k] ;
                    
                     
                }
                System.out.print("    sum: "+sum);
                if(largest < sum){
                    largest = sum ;
                }
                if(minimum >sum){
                    minimum = sum ;
                }
                ts++;
                System.out.println();
            }   
                  
        } 
        System.out.println("largest value is :"+largest);
        System.out.println("minimum value is :"+minimum); 
          System.out.println("total sub array:"+ts);
      }
    public static void main(String[] args) {
        int number[]={2,3,4,5,6};
        subarray(number);
    }
}
