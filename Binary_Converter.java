import java.util.Scanner;

public class Binary_Converter {
    static Scanner sc = new Scanner(System.in);
    static int binary = 1;

    public static int Binary(int a) {
        if (a == 0) {
            return 0;
        }
        if (a == 1) {
            return 1;
        }
        binary = binary * 10 + a % 2;

        return Binary(a / 2);

    }

    public static void main(String args[]) {
        System.out.println("Enter a number:");
        int a = sc.nextInt();
        int result = Binary(a);
        // System.out.println("The given number of " + a + "convert into Binary number "
        // + result);
        System.out.println(binary);

    }

}