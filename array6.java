public class array6 {
    public static int binarysearch(int number[],int key){
        int start=0,end=number.length;
        int mid=(start+end)/2;
        while(start<=end){
            if(number[mid]==key){
                return mid;
            }
            if(number[mid]<=key){
                return mid+1;
            }
            else{
                return mid-1;
            }
        }
        return -1;
    }    

    public static void main(String[] args) {
        int number[]={2,3,4,5,14,16,17};
        int key=14;
        System.out.println("number is found at:"+binarysearch(number, key));
    }
}
