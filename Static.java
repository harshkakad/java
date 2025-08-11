public class Static {
    public static void main(String[] args) {
        Student s1=new Student();
        s1.studentname=" harsh";

        Student s2=new Student();
        System.out.println(s2.studentname);

        Student s3=new Student();
        s3.studentname="harshkakad";
        System.out.println(s3.studentname);

    }
}
class Student{
    int roll;
    String name;
    

    static  String studentname;
    void setname(String name){
        this.name=name;
    }
    String getname(){
        return this.name;
    }
}
