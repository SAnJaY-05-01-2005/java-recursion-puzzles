import java.util.Scanner;
public class checks{
    static Scanner s = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("enter the  first value:");
        int a = s.nextInt();
        System.out.println("enter the  second value:");
        int b = s.nextInt();


        if (a >b)
            System.out.println("a is greater than b");
        else
            System.out.println("b is greater than a");


    }

}
