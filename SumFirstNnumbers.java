import java.util.Scanner;
public class SumFirstNnumbers {
    public static void Sum(int n,int i,int sum){
        if(i==n){
            sum+=i;
            System.out.println(sum);
            return;
        }
        sum+=i;
        Sum(n,i+1,sum);
    }    

    
    public static void main(String args[]){
        try (Scanner sn = new Scanner(System.in)) {
            int a=sn.nextInt();
            int b=sn.nextInt();
            int c=sn.nextInt();
            Sum(a,b,c);
        }
    }
}

