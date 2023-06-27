import java.util.Scanner;
public class GreaterOf2Number {
    public static int greaterof2num(int a,int b){
        if(a>b){
            System.out.println(a+" is greater than "+b);
        }else if(b>a){
            System.out.println(b+" is greater than "+a);
        }else{
            System.out.println("Error");
        }
        return 1;
    }
    public static void main(String args[]){
        try (Scanner sn = new Scanner(System.in)) {
            int x=sn.nextInt();
            int y=sn.nextInt();
            greaterof2num(x,y);
        }
    }
}