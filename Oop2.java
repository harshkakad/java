public class Oop2 {
    public static void main(String[] args) {
        pen p1=new pen();
        p1.setcolour("orange");
        System.out.println(p1.getcolour());
        p1.settip(468);
        System.out.println(p1.getTip());

    }
}
class pen{
    private int tip;
    private String colour;

 String getcolour(){
    return this.colour;
 }
 int getTip(){
    return this.tip;
 }

void settip(int tip){
    this.tip=tip;
}
void setcolour(String colour){
    this.colour=colour;
}
}
