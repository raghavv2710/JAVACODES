import java.util.Scanner;
public class Circumference {
    public static Double Circum(Double n){
        Double circumference=2*3.14*n;
        return circumference;
    }
    public static void main(String args[]){
        try (Scanner sn = new Scanner(System.in)) {
            Double x=sn.nextDouble();
            System.out.println("The radius of the circle is "+Circum(x));
        }
    }
}