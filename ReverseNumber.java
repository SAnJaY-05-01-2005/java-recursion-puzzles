import java.util.Scanner;

public class ReverseNumber {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter the your fav number:");
        int num=sc.nextInt();
        int digit;
        int reverse=0;
        while (num>0){
            digit=num%10;
            reverse=reverse*10+digit;
            num=num/10;
        
        }
        System.out.println(reverse);
        String rest=reverse==num?"palindrome":"non palindrome";
        System.out.println(rest);
        
    }

    
}