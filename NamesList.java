import java.util.Scanner;
public class NamesList {
    public static void main(String args[]) {
        Scanner sn = new Scanner(System.in);
        int n=sn.nextInt();
        String[] names=new String[n];
        for(int i=0;i<n;i++){
            names[i]=sn.nextLine();
        }
        for(int i=0;i<n;i++){
            System.out.println(names[i]);
        }
    }
}
