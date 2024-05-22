import java.util.Scanner;

public class GPseries {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("program to print GP series");
        System.out.println("enter a,r and n");
        int a=sc.nextInt();
        int r=sc.nextInt();
        int n=sc.nextInt();
        int term=a;
        for(int i=0;i<n;i++){
            System.out.println(term+" ,");
            term=term*r;
        }
    }
    
}
