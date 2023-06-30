import java.util.Scanner;
public class SpiralMatrix {
    public static void main(String []args){
        try (Scanner sn = new Scanner(System.in)) {
            System.out.println("Enter the number of inputs : ");
            int n=sn.nextInt();
            String[] combined=new String[n];
            int output=0;
            for(int i=0;i<n;i++){
                combined[i]=sn.nextLine();
                output=output+combined[i].length();
            }
            System.out.println("The total sum of the length of all the strings are : "+output);
        }
    }
}
 