import java.util.Scanner;
public class Print5to1UsingRecursion {
    public static int Numbers5to1(int n){
    if(n<1)
        return 1;
        System.out.println(n);
        return Numbers5to1(n-1);
    }
    public static void main(String args[]){
        try (Scanner sn = new Scanner(System.in)) {
            int a=sn.nextInt();
            Numbers5to1(a);
        }
    }
}
