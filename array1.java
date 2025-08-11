import java.util.*;
public class array1 {
    public static void main(String[] args) {
        int marks[]=new int[50];
        Scanner sc=new Scanner(System.in);
        marks[0]=sc.nextInt();
        marks[1]=sc.nextInt();
        marks[2]=sc.nextInt();

        System.out.println("marks of physics:"+marks[0]);
        System.out.println("marks of chem:"+marks[1]);
        System.out.println("marks of bio:"+marks[2]);

        System.out.println("length of array:" + marks.length);
    }
}
