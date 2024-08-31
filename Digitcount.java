import java.util.Scanner;

public class Digitcount {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("eneter a number");
        int n=scan.nextInt();

        int count=0;
        while (n>0) {
            n=n/10;
            count--;
            
        }
        System.out.println(count);
    }
    
}
