public class array4 {
    public static int linearsearch(String name[],String key){
            for(int i=0;i<name.length;i++){
                if(name[i]==key){
                    return i;

                }

            }
            return -1;
    }

    public static void main(String args[]){
          String  name[]={"harsh","adinath","yash","rohit"};
          String key="yash";
          int index=linearsearch(name, key);
          if(index==-1){
            System.out.println("String Not found");

          }
          else{
            System.out.println("String is found:"+index);
          }

  }
}
