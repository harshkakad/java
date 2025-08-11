import java.util.*;



public class array2 {


       public static void array( int marks[]){
        for(int i =0;i<marks.length;i++){
            marks[i]=marks[i]+1;

        }
       }
     public static void main(String[] args) {

        int marks[]={67,76,87};
         array (marks);
        for(int i =0;i<marks.length;i++){
            System.out.println(+marks[i]);

        }
     }
    
}
