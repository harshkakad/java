public class oop1 {
    public static void main (String args[]){
      pen p1=new pen();
      p1.setcolour("blue");
      System.out.println(p1.colour);
      p1.settip(7);
      System.out.println(p1.tip);

      bankaccount b1=new bankaccount();
      b1.accno=3444344;
      System.out.println(b1.accno);
      b1.display(66777);
      System.out.print(b1.display());
    }
}
  class bankaccount{
     int accno;
     private int passward;
     int display(){
        return this.passward;


     }
     void display(int newpass){
       this.passward=newpass;
     }

  }
class pen{
    int tip;
    String colour;
    void setcolour(String newcolour){
        colour=newcolour;
    }
    void settip(int newtip){
        tip=newtip;
    }
}
