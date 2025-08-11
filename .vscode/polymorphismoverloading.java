public class polymorphismoverloading {
    public static void main(String[] args) {
        name n1=new name();
        System.out.println(n1.add("harsh", "kakad"));
        System.out.println(n1.add("rohit", "anil", "katore"));
        
    }
}
class name{
    String add(String s1,String s2){
        return s1+s2;
    }
    String add(String a , String b , String c){
        return a+b+c;

    }
}
