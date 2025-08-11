public class String4 {
    public static String subString(String str,int si,int ei){
        String subString=" ";
        for(int i=si;i<ei;i++){
            subString+=str.charAt(i);

        }
        return subString;
    }
    public static void main(String[] args) {
        String str="harshkakad";
        String sub=subString(str, 5, 9);
        System.out.println(sub);
        
    }
}
