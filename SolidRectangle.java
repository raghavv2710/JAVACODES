import java.util.Scanner;
public class SolidRectangle {
    public static void main(String args[]){
        try (Scanner sn = new Scanner(System.in)) {
            int n=sn.nextInt();
            int m=sn.nextInt();
            for(int i=0;i<n;i++){
                for(int j=0;j<m;j++){
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    }
}
