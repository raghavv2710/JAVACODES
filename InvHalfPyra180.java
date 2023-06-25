import java.util.Scanner;
public class InvHalfPyra180 {
    public static void main(String args[]) {
        try (Scanner sn = new Scanner(System.in)) {
            int n=sn.nextInt();
            for(int i=1;i<=n;i++){
                for(int j=1;j<=n-i;j++){
                    System.out.print(" "); 
            }
            for(int j=1;j<=i;j++){
                System.out.print("*"); 
            }
            System.out.println(); 
        }
    }
}
}