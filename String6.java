public class String6 {
    public static String countstring(String arr){
        String newstr="";
         Integer count=1;
         for(int i=0;i<arr.length();i++){
            while(i<arr.length()-1&& arr.charAt(i)==arr.charAt(i+1)){
                count++;
                i++;
            }
            newstr+=arr.charAt(i);
            if(count>1){
                newstr +=count.toString();

            }
            
         }
         return newstr;

    }

    public static void main(String[] args) {
        String arr="aaabbbccc";
        System.out.println(countstring(arr));
    }
}
