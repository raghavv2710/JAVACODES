import java.util.Scanner;
public class SUM {
    public static void main(String []args){
        try (Scanner sn = new Scanner(System.in)) {
            int n =sn.nextInt();
            int count=0;
            for(int i=0;i<n;i++){
               count=count +i;
            }
            System.out.print(count);
        }
    }
}
