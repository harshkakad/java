public class array10 {
    public static void adanas( int number[]){
         int mx=Integer.MIN_VALUE;
         int cv=0;
         for(int i=0;i<number.length;i++){
            cv=cv+number[i];
         }
         if(cv<0){
            cv=0;
         }
         mx=Math.max(cv,mx);

         System.out.println("maximum no is:"+mx);
    }






    public static void main(String[] args) {
        int number[]={4,-4,-5,4,5,9,-3};
        adanas(number);
    }
}


