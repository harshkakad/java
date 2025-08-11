public class spiral {
    public static void printspiral(int matrix[][]){
        int startrow=0;
        int startcoulmn=0;
        int endrow=matrix.length-1;
        int endcoulmn=matrix[0].length-1;


        while(startrow<=endrow && startcoulmn<=endcoulmn){
            for(int j=startcoulmn;j<=endcoulmn;j++){
                System.out.print(matrix[startrow][j]+" ");

            }
            for(int i=startrow;i<=endrow;i++){
                System.out.print(matrix[i][endcoulmn]+" ");

            }
            for(int j=endcoulmn-1;j>=startcoulmn;j--){
                if(startrow==endrow){
                    break;
                }
                System.out.print(matrix[endrow][j]+" ");

            }
            for(int i=endrow-1;i>=startrow;i--){
                if(startcoulmn==endcoulmn){
                    break;
                }
                System.out.print(matrix[i][startcoulmn]+" ");

            }
            startcoulmn++;
            startrow++;
            endcoulmn--;
            endrow--;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int matrix[][]={{1,2,3,4},
                        {5,6,7,8},
                        {9,10,11,12},
                        {13,14,15,16}};
        printspiral(matrix);
    }
}
