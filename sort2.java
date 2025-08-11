public class sort2 {
    public static void selectionsort(int arr[]){
        for(int i=0;i<arr.length-1;i++){
            int smallestnum=i;
            for(int j=i+1;j<arr.length;j++){
                if(arr[smallestnum]>arr[j]){
                    smallestnum=j;
                }
            }
            int temp=arr[smallestnum];
            arr[smallestnum]=arr[i];
            arr[i]=temp;
            
        }
    }
    public static void print(int arr[]) {
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        
    }

    public static void main(String[] args) {
        int arr[]={8,3,5,19,1,2};
        selectionsort(arr);
        print(arr);
    }
}



