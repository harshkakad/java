public class String3 {
    public static void main(String[] args) {
        String s1="harsh";
        String s2="harsh";
        String s3=new String("harsh");
        if(s1==s2){
            System.out.println("same string");
        }
        else{
            System.out.println("different string");
        }
        if(s3==s2){
            System.out.println("same string");
        }
        else{
            System.out.println("different string");
        }
        if(s1.equals("harsh")==s3.equals("harsh") ){
            System.out.println("same string");
        }
        else{
            System.out.println("different string");
        }
    
    }
}
