import java.util.Scanner;
public class SumofOddNum {
    public static int sumofoddnum(int n){
        int sum=0;
    for(int i=1;i<=n;i++){
        if(i%2!=0){
            sum=sum+i;
        }
    }
    return sum;
    }
    public static void main(String args[]){
        try (Scanner sn = new Scanner(System.in)) {
            int a=sn.nextInt();
            System.out.println("The sum of all Odd numbers till n is "+sumofoddnum(a));
        }
    }
}
