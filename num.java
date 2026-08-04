import java.util.Scanner;
/**
 * ternary
 */
public class num {
    public void num1(){
        System.out.println("sc");
    }
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Enter the num1:");
        int num1=sc.nextInt();
        String rest=num1>=0 ?"POSTITIVE":"NEGATIVE";
        System.out.println(rest);
        num obj=new num();
        obj.num1();
            System.out.println();
        
    }
}