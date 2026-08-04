public class Test2 {
    public static void main(String[] args) {

        System.out.println("--- Block 1: Integer Relational Operators ---");
        int x = 15;
        int y = 15;
        boolean res1_xy = x == y;
        System.out.println(res1_xy);
        System.out.println(x != y);
        System.out.println(x < y);
        System.out.println(x > y);
        System.out.println(x <= y);
        System.out.println(x >= y);

        System.out.println("\n--- Block 2: Character Relational Operators ---");
        char ch1 = 'A';
        char ch2 = 'B';
        boolean res1_char = ch1 < ch2;
        System.out.println(res1_char);
        System.out.println(ch1 > ch2);
        System.out.println(ch1 == ch2);
        System.out.println(ch1 != ch2);
        System.out.println(ch1 <= ch2);
        System.out.println(ch1 >= ch2);

        System.out.println("\n--- Block 3: Char & Int ASCII Comparison ---");
        int a1 = 'A'; // 'A' translates to its ASCII value, 65
        int b1 = 65;
        boolean res1_ab = a1 == b1;
        System.out.println(res1_ab);
        System.out.println(a1 != b1);
        System.out.println(a1 < b1);
        System.out.println(a1 > b1);
        System.out.println(a1 <= b1);
        System.out.println(a1 >= b1);

        System.out.println("\n--- Block 4: Simple Integer Increment/Decrement ---");
        int a2 = 10;
        System.out.println(a2);
        a2++;
        System.out.println(a2);
        a2--;
        System.out.println(a2);
        ++a2;
        System.out.println(a2);

        System.out.println("\n--- Block 5: Double Increment/Decrement ---");
        double d = 10.5;
        System.out.println(d++); // Post-increment: Prints 10.5, then becomes 11.5
        System.out.println(++d); // Pre-increment: Becomes 12.5, then prints 12.5
        System.out.println(d--); // Post-decrement: Prints 12.5, then becomes 11.5
        System.out.println(--d); // Pre-decrement: Becomes 10.5, then prints 10.5
        System.out.println(d);   // Prints current value: 10.5

        System.out.println("\n--- Block 6: Complex Increment/Decrement (Tricky!) ---");
        int a = 5;
        a = a++; 
        int c = ++a + a;
        c = c--;
        int e = --a;
        System.out.println(a);
        System.out.println(c);
        System.out.println(e);
    }
} 
