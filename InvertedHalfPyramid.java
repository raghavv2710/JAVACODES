import java.util.Scanner;
public class InvertedHalfPyramid {
    public static void main(String args[]) {
        try (Scanner sn = new Scanner(System.in)) {
            int n=sn.nextInt();
            for(int i=n;i>0;i--){
                for(int j=i;j>0;j--){
                    System.out.print("*");
                }
                System.out.println();
            }
            }
        }
    }