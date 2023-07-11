import java.util.Scanner;
public class FibonacciUsingRecursion {
    public static void Series(int x,int y,int z){
        if(x==0 || x==1){
            return;
        }
            int q=y+z;
            System.out.print(q+" ");
            Series(x-1,z,q);
    }
    public static void main(String args[]){
        try (Scanner sn = new Scanner(System.in)) {
            int a=sn.nextInt();
            int b=sn.nextInt();
            int c=sn.nextInt();
            System.out.print(b+" ");
            System.out.print(c+" ");
            Series(a-2,b,c);
        }
    }
}
