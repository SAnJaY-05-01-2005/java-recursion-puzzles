import java.util.Scanner;

/**
 * laragenumof3
 */
public class largestnumof3 {

    static Scanner sc = new Scanner(System.in);

    void largest_number() {
        System.out.println("enter tha a value");
        int a = sc.nextInt();
        System.out.println("enter tha b value");
        int b = sc.nextInt();
        System.out.println("enter tha c value");
        int c = sc.nextInt();
        int res = a > b && a > c ? a : b > c ? b : c;
        System.out.println(res);

    }

    public static void main(String[] args) {
        largestnumof3 obj = new largestnumof3();
        System.out.println("the largest number is:");
        obj.largest_number();

    }

}