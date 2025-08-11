public class recursion {

     public static void printdecreasing(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        System.out.print(n+" ");
        printdecreasing(n-1);

     }
     public static void printincreasing(int n){
        if(n==1){
            System.out.println(n);
            return;
        }
        printincreasing(n-1);
        System.out.print(n+" ");
     }
     public static int fact(int n){
        if(n==0){
            return 1;
        }
        int fnm=fact(n-1);
        int fn=n*fact(n-1);
        return fn;
     }

     public static int sumofnatural(int n){
      if(n==1){
         return 1;

      }
      int nm1=sumofnatural(n-1);
      int num=n+nm1;
      return num;

     }
     public static int fibonacci(int n){
      if (n==0||n==1){
         return n;
      }
      int fnm1=fibonacci(n-1);
      int fnm2=fibonacci(n-2);
      int fibonaci=fnm1+fnm2;
      return fibonaci;
     }
    
     public static boolean issorted(int arr[],int i){
      if(i==arr.length-1){
         return true;

      }
      if(arr[i]>arr[i+1]){
         return false;
      }
      return issorted(arr, i+1);
     }


     public static int firstoccurance(int arr[],int key,int i){
      if(i==arr.length){
         return -1;

      }
      if(arr[i]==key){
         return i;
      }
      return firstoccurance(arr,key,i+1);
     }
     public static int lastoccurence(int arr[],int key,int i){
      if(i==arr.length){
         return -1;
      }
      int isfound=lastoccurence(arr,key,i+1);
      
      if(isfound==-1 && arr[i]==key){
         return i;
      }
      return isfound;
     }


     
     public static int nthpower(int a,int n){
      if(n==0){
         return 1;
      }
      int power=nthpower(a, n/2);
      int powersq=power*power;

      if(n%2!=0){
         powersq=a*powersq;
      }
      return powersq;
     }
  public static void main(String[] args) {
      //int n=24;
      // printdecreasing(n);
      // printincreasing(n);
      //System.out.println(fibonacci(n));
      //int arr[]={1,2,3,4,5,3,6,3};
      //System.out.println(lastoccurence(arr,3, 0));
      int a=2;
      int n=3;
      System.out.println(nthpower(a, n));
    
   }
    
}

