import java.util.Scanner;
public class HollowRectangle {
    public static void main(String args[]) {
        try (Scanner sn = new Scanner(System.in)) {
            int n=sn.nextInt();
            int m=sn.nextInt();
            for(int i=1;i<=n;i++){
                for(int j=1;j<=m;j++){
                    if (i==1 || i==n || j==1 || j==m){
                        System.out.print("*");
                    }else{
                        System.out.print(" ");
                    }
                }
                    System.out.println();
            }
        }
    }
}
