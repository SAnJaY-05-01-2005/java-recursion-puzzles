import java.util.Scanner;

public class percentage{

    
    static Scanner sc=new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter the percentage:");
        int per=sc.nextInt();
        String res=(per>90&&per<=100)?"A":(per>=60 && per<=90)?"B":(per>=35 && per<90)?"c":(per<35)?"fail":"Invalid";
        System.out.println(res);
    }
}