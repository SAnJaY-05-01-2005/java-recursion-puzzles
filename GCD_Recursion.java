import java.util.Scanner;
public class GCD_Recursion {
    static Scanner sc=new Scanner(System.in);
    public static int gcd(int a, int b) {
        if (b == 0) {
            return a;
        }
        return gcd(b, a % b);
    }
    public static void main(String[] args) {
        System.out.println("Enter the value of First:");
        int a=sc.nextInt();
        System.out.println("Enter the value of Second:");
        int b=sc.nextInt();
        int result=gcd(a,b);
        System.out.println("GCD OF "+a+" "+b+" result: "+result);
    }
}
