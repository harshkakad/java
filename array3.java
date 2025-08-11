import java.util.*;
public class array3 {
       public static int linearsearch(int number[],int key){
        for(int i=0;i<=number.length;i++){
            if( number[i]== key){
                return i;
            }
        }    
        return -1;
       }

    public static void main(String[] args) {
        int number[]= {9,12,34,15,31,33,53};
        int key=34;
        int index = linearsearch(number, key);
        if(index==-1){
            System.out.println("number not fount");
        }
        else{
            System.out.println("number is found:"+index);

        }
        
        

       
        
        
    }
}
