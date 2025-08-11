public class EvenoddBIT {
    public static void evenodd(int n){
        int BITmask=1;
        if((BITmask & n)==1){
            System.out.println(" odd number");
        }
        else{
            System.out.println("even number");
        }

    }
    public static int getihbittmask(int n,int i){
        int bitmask=1<<i;
        if((bitmask & n)==0){
            return 0;
        }
        else{
            return 1;
        }
    }
    public static int setithbitmask(int n,int i){
        int bitmask=1<<i;
        return n |bitmask;
    }
    public static int clearithmask(int n,int i){
           int bitmask=  ~(1<<i);
           return n&bitmask;
    }
    public static int updateithbit(int n,int i,int newbit){
        if (newbit==0){
             return clearithmask(n,i);
        }
        else{
           return  setithbitmask(n, i);
        }
    }
    public static void main(String[] args) {
        evenodd(9);
        evenodd(8);
         System.out.println(updateithbit(10, 01,5));
    }
}
