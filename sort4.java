import java.util.Arrays;
import java.util.Collection;

public class sort4 {


    public static void array(Integer arr[]){
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
    public static void main(String[] args) {
        Integer arr[]={32,4,5,6,2};
        Arrays.sort(arr,0,4);
        array(arr);

    }
}
