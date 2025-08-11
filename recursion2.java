public class recursion2 {
    public static int tileproblem(int n){
        if(n==1||n==0){
            return 1;
        }
        //for horizontal
        int fnm1=tileproblem(n-2);

        //for vertical
        int fnm2=tileproblem(n-1);

        //total wAY

        int totalway=fnm1+fnm2;

        return totalway;
    }

   public static int friendpair(int n){
    if(n==1||n==2){
        return n;
    }
    return friendpair(n-1)+(n-1)*friendpair(n-2);
   }

   public static void binaryno(int n,int lastnumber ,String str){
    if(n==0){
        System.out.println(str);
        return;
    }

    binaryno(n-1, 0,str+("0"));
    if(lastnumber==0){
        binaryno(n-1,1, str+("1"));
    }
   }
    public static void main(String[] args) {
        binaryno(3, 0, "");
    }
}
