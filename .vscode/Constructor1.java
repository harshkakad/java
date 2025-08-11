import java.util.*;
public class Constructor1 {
    public static void main(String[] args) {
        Studentlist s1=new Studentlist();
        //studentlist S2=new studentlist(45);
        //studentlist S3=new studentlist("harsh kakad");
        

        s1.marks[0]=100;
        s1.marks[1]=200;
        s1.marks[2]=300;
        Studentlist s2=new Studentlist(s1);
        s1.marks[0]=200;

        for(int i=0;i<3;i++){
            System.out.println(s2.marks[i]);
        }
     }
}
class Studentlist{
    int roll;
    String name;
    int marks[];
    

    Studentlist(Studentlist s1){
        marks=new int[3];
        this.name=s1.name;
        this.roll=s1.roll;
        this.marks=s1.marks;
        
    }
     
    Studentlist(){
        System.out.println("enter  the roll no");
    }
    Studentlist(int roll){
        this.roll=roll;
        System.out.println(roll);
    }
    
    Studentlist(String name){
        
        this.name=name;
        System.out.println("harsh kakad");
    }
}
