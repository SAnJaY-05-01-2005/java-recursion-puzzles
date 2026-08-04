import java.util.Scanner;

public class secondLag {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("enter the A value:");
        int a = sc.nextInt();

        System.out.println("enter the B value:");
        int b = sc.nextInt();

        System.out.println("enter the C value:");
        int c = sc.nextInt();

        int res = (a > b && a < c) || (a < b && a > c) ? a
                : (b > a && b < c) || (b < a && b > c) ? b
                : c;       
                
                
        System.out.println("this second largest number among these:"+res);
    }
}
