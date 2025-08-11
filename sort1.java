public class sort1 {
       public static void bubblesort(int arr[]){
          for(int turn=0;turn<arr.length-1;turn++){
            for(int j=0;j<arr.length-1-turn;j++){
               if(arr[j]>arr[j+1]){
                  int temp=arr[j];
                  arr[j]=arr[j+1];
                  arr[j+1]=temp;
               }
            }
          }
        }
          public static void print(int arr[]){
                for(int i=0;i<arr.length;i++){
                    System.out.print(arr[i]+" ");
                }
                System.out.println();
          }

       public static void main(String[] args) {
        int arr[]={3,5,5,9,10,4,2};
        bubblesort(arr);
        print(arr);
       }
}



