public class String5 {
    public static String printuppercase(String str1){
        StringBuilder sb=new StringBuilder();
        char ch=Character.toUpperCase(str1.charAt(0));
        sb.append(ch);

        for(int i=0;i<str1.length();i++){
            if(str1.charAt(i)==' ' && i<str1.length()){
            sb.append(str1.charAt(i));
            i++;
            sb.append(Character.toUpperCase(str1.charAt(i)));
            }
            else{
                sb.append(str1.charAt(i));
            }
        }
        return sb.toString();
    }
    public static void main(String[] args) {


        String str1=" i am harsh kakad";
        System.out.println(printuppercase(str1));
        //String str[]={"harsh","rohit","adinath"};
        //String largest=str[0];
       // for(int i =0;i<str.length;i++){
        //   if(largest.compareTo(str[i])>0){
         //   largest=str[i];
         //  }
      //  }
       // System.err.println(largest);
        
    }
}
