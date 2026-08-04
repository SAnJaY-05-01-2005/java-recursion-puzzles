public class Test3 {
    
    public static void main(String[] args) {
        System.out.println("\n--- Block 6: Complex Increment/Decrement (Tricky!) ---");
        int a = 10;
        System.out.println(a-- + --a);
        a = a++; 
        int c = ++a + a;
        c = c--;
        int e = --a;
        System.out.println(a);
        System.out.println(c);
        System.out.println(e);
        

    }
}
