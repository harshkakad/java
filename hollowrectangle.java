public class hollowrectangle {
    public static void  pattern(int row,int coulmn){
        for( int i=1;i<=row;i++){
            for(int j=1;j<=coulmn;j++){
                if (i==1 || i==row||j==1||j==coulmn){
                    System.out.print ("*");
                }
                else{
                    System.out.print(" ");
                }
            }
            
            System.out.println();
        }
       
    }
public static void main (String args[]){
    pattern(4, 5);

}

}
