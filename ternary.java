import java.util.Scanner;
/**
 * ternary
 */
class ternary {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the num1:");
        int num1=sc.nextInt();
        System.out.println("Enter the num2:");
        int num2=sc.nextInt();
        int rest=num1>num2 ?num1:num2;
        System.out.print(rest);

        
    }
}