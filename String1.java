public class String1 {
    public static boolean ispalimdrome(String name){
            for(int i=0;i<name.length()/2;i++){
                int n=name.length();
                if(name.charAt(i)!=name.charAt(n-1-i)){
                   return false;
                }
            }
            return true;
    }


  public static void main(String[] args) {
    String name="harsh";
    System.out.println(ispalimdrome(name));
  }
}
