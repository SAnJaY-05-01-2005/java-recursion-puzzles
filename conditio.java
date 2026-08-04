import java.util.Scanner;
public class conditio{
     static Scanner s=new Scanner(System.in);
     public static void main(String [] args){
         System.out.println("enter the  value:");
         int a=s.nextInt();
         
         if(a==0){
             System.out.println("zero");
         }
         else{
             if(a>0){
                 System.out.println("Positive");
             }
             else{
                 System.out.println("Negative");
             }
         }
         
     }      
}