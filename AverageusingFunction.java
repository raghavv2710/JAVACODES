import java.util.Scanner;
public class AverageusingFunction {
    public static float Average(int a,int b,int c){
    float sum=a+b+c;
    float average=sum/3;
    return average;
    }
    public static void main(String args[]){
        try (Scanner sn = new Scanner(System.in)) {
            int first=sn.nextInt();
            int second=sn.nextInt();
            int third=sn.nextInt();
            System.out.println("The average of three numbers are"+Average(first,second,third));
        }
    }
}
