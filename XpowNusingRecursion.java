import java.util.Scanner;
public class XpowNusingRecursion {
    public static int Power(int x,int n){
        if(n==0)
        return 1;
        int nPownm1=Power(x,n-1);
        int ans=x*nPownm1;
        return ans;
    }
    public static void main(String []args){
        try (Scanner sn = new Scanner(System.in)) {
            int a=sn.nextInt();
            int b=sn.nextInt();
            System.out.println(Power(a,b));
        }
    }
    
}
