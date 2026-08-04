import java.util.Scanner;

public class Yearfind {
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println(("enter the year:"));
        int year=sc.nextInt();
        String result=(year%400==0 || (year%100!=0 && year%4==0))?"leap year":"non leap year";
        System.out.println(result);
        

    }
    
}
