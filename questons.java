import java.util.Scanner;
import java.security.DigestException;
import java.util.Random;

public class questons {
    String email;
    String password;
    int a=0;
    int b=1;
    int c=0;
    int count=1;
    static Scanner sc = new Scanner(System.in);


    void check_digit() {
        System.out.println("enter the Num:");
        int num = sc.nextInt();
        int count = 0;
        while (num > 0) {
            count = count + 1;
            num = num / 10;
        }
        System.out.println(count);

    }

    void absoult_val() {
        System.out.println("Enter the anything");
        int val = sc.nextInt();
        if (val > 0) {
            System.out.println("its absoult value");
        } else {
            System.out.println("you are entered wrrongly so try again?");
        }
    }

    void smallest_number_of_Three() {
        System.out.println("Enter A values:");
        int a = sc.nextInt();

        System.out.println("Enter B values:");
        int b = sc.nextInt();

        System.out.println("Enter C values:");
        int c = sc.nextInt();

        if (a < b && a < c) {
            System.out.println("A values is small among these three: " + a);
        } else if (b < c) {
            System.out.println("B values is small among these three: " + b);
        } else {
            System.out.println("C values is small among these three: " + c);

        }

    }

    void check_charactor() {
        System.out.println("Enter the any character:");
        char val = sc.next().charAt(0);

        if (val > 'A' && val < 'Z') {
            System.out.println("This Upper Case");
        } else if (val > 'a' && val < 'z') {
            System.out.println("This Lower Case");
        } else {
            System.out.println("you are entered somthing wrongly so you need to try again: !");
        }
    }

    void check_alpha_digit_special() {
        System.out.println("Enter your Favour: ");
        char val = sc.next().charAt(0);

        if (val >= 'A' && val <= 'Z' || val >= 'a' && val <= 'z') {
            System.out.println("letter ");
        } else if (val >= '0' && val <= '9') {
            System.out.println("integer");
        } else {
            System.out.println("special character");
        }

    }

    void second_large_num() {
        System.out.println("Enter A values:");
        int a = sc.nextInt();

        System.out.println("Enter B values:");
        int b = sc.nextInt();

        System.out.println("Enter C values:");
        int c = sc.nextInt();

        if ((a > b && a < c) || (a > c && a < b)) {
            System.out.println("A is a second largest number among three:" + a);

        } else if ((b > a && b < c) || (b > c && b < a)) {
            System.out.println("B is a second largest number among three:" + b);

        } else {
            System.out.println("C is a second largest number among three:" + c);
        }

    }

    void marg() {
        System.out.println("1.samntha\n2.karthina\n3.saipallavi\n4.sruthi");
        int input = sc.nextInt();
        System.out.println("Sanjay deceding future:");
        if (input == 1) {
            System.out.println("sanjay wedds samantha");

        } else if (input == 2) {
            System.out.println("sanjay wedds karthina");

        } else if (input == 3) {
            System.out.println("sanjay wedds saipallavi ");
        } else if (input == 4) {
            System.out.println("sanjay wedds sruthi");
        } else {
            System.out.println("your wish try to married any another gril");
        }

    }

    void readinput() {
        System.out.println("Enter the num");
        int num = sc.nextInt();

        if (num > 100 || num < 0) {
            System.out.println("invalid");
        } else if (num > 0 && num < 11) {
            System.out.println("Mars");
        } else if (num > 10 && num < 41) {
            System.out.println("Earth");

        } else if (num > 40 && num < 61) {
            System.out.println("Jupiter");
        } else if (num > 60 && num < 101) {
            System.out.println("venus");
        }

    }

    void laragest_number_of_Three() {
        System.out.println("Enter A values:");
        int a = sc.nextInt();

        System.out.println("Enter B values:");
        int b = sc.nextInt();

        System.out.println("Enter C values:");
        int c = sc.nextInt();

        if (a > b && a > c) {
            System.out.println("A values is laragest among these three: " + a);
        } else if (b > c) {
            System.out.println("B values is laragest among these three: " + b);
        } else {
            System.out.println("C values is laragest among these three: " + c);

        }

    }

    void check_days_in_num() {
        System.out.println("Enter the number:");
        int day = sc.nextInt();

        switch (day % 7) {
            case 1:
                System.out.println("sunday");

                break;
            case 2:
                System.out.println("monday");

                break;
            case 3:
                System.out.println("tuesday");

                break;
            case 4:
                System.out.println("wendesday");

                break;
            case 5:
                System.out.println("thuesday");

                break;
            case 6:
                System.out.println("saturday");

                break;

            default:
                break;
        }
    }

    void check_months() {
        System.out.println("enter the number:");
        int months = sc.nextInt();

        switch (months) {
            case 3, 4, 5:
                System.out.println("summer");

                break;
            case 6, 7, 8:
                System.out.println("winter");

                break;
            case 9, 10, 11:
                System.out.println("spring");

                break;
            case 12, 1, 2:
                System.out.println("raining");
                break;

            default:
                break;
        }
    }

    void Random_Otp() throws InterruptedException {
        System.out.println("We are Generating Four Digit Otp ...... ");
        Thread.sleep(3000);
        Random random = new Random();
        int otp = random.nextInt(9000) + 1000;
        System.out.println("OTP : " + " " + otp);

    }

    public void Create_Account() throws InterruptedException {
        System.out.print("Enter your Name:");
        String name = sc.nextLine();
        System.out.print("Enter your Age:");
        int age = sc.nextInt();
        System.out.print("Enter your Mobile Number:");
        long mobile = sc.nextLong();
        System.out.print("Enter your Email Id:");
        email = sc.next();
        System.out.print("Enter your Password:");
        password = sc.next();

        System.out.println("Your Account Created Successfully");

        System.out.println("Your Details are......");

        Thread.sleep(4000);

        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Mobile Number: " + mobile);
        System.out.println("Email Id: " + email);
        System.out.println("Password: " + password);

        System.out.println("Now you can login to your account");

        login();

    }

    public void login() throws InterruptedException {

        System.out.print("Enter your Email Id:");
        String login_email = sc.next();
        System.out.print("Enter your Password:");
        String login_password = sc.next();

        if (email.equals(login_email) && password.equals(login_password)) {

            System.out.println("Your Account Login Successfully");
            Thread.sleep(4000);
            System.out.println("Email Id: " + login_email);
            System.out.println("Password: " + login_password);

        } else {
            System.out.println("Invalid Email or Password");
        }

    }

    void Print_Name() {
        String name = sc.next();
        int i = 1;
        while (i < 11) {
            System.out.println(name);
            i++;
        }
    }

    void Print_Nm() {
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        int i = 1;
        while (i <= num)
            ;
        {
            System.out.println(i);
            i++;
        }

    }

    void A_Z() {
        int i = 65; // ASCII value for 'A'
        while (i <= 90) { // ASCII value for 'Z'
            System.out.print((char) i + " "); // Cast 'i' to a character and add a space
            i++;
        }
    }

    void a_b_Better() {
        char letter = 'a';
        while (letter <= 'z') {
            System.out.print(letter + " ");
            letter++;
        }
    }

    void One_N() {
        System.out.print("Enter the Number:");
        int n = sc.nextInt();
        int i = 2;
        while (i <= n) {
            System.out.println(i);
            i += 2;

        }
    }

    void Tables() {
        System.out.print("Enter the Number:");
        int n = sc.nextInt();
        int i = 1;
        while (i <= 10) {
            System.out.println(n + "X" + i + "=" + n * i);
            i += 1;

        }

    }

    void Check_Reverset() {
        System.out.println("enter the digit:");
        int num = sc.nextInt();
        int Reverse = 0;
        int digit;
        while (num > 0) {
            digit = num % 10;
            Reverse = Reverse * 10 + digit;
            num = num / 10;
        }
        System.out.println(Reverse);

    }

    void Task() {
        boolean flag = true;
        do {
            System.out.println("1.idli\n2.upma\n3.pula\n4.Exit");
            System.out.print("\t\t\tEnter Your Choice:");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> System.out.println("Price:" + 20);
                case 2 -> System.out.println("Price:" + 30);
                case 3 -> System.out.println("Price:" + 25);

                case 4 -> flag = false;
            }
        } while (flag);
        {

            System.out.println("\t\t\t-Thank YOU");
        }
    }

    void Task1() throws InterruptedException {
        boolean flag = true;

        do {
            // --- MAIN MENU ---
            System.out.println("HOTEL:");
            System.out.println("________________________________");
            System.out.println("1. Buhari\n2. A2B\n3. Exit");
            int choice = sc.nextInt();

            switch (choice) {
                case 1 -> {
                    boolean flag1 = true;
                    // Start the loop BEFORE printing the menu and asking for input
                    do {
                        System.out.println("\t\t\tBuhari Menu:");
                        System.out.println("__________________________");
                        System.out.println("1. Briyani\n2. Chicken-65\n3. Ghee Rice\n4. Exit");
                        int choice1 = sc.nextInt();

                        // Switch goes entirely inside the loop
                        switch (choice1) {
                            case 1 -> System.out.println("The Price of Biriyani is 180 RS.");
                            case 2 -> System.out.println("The Price of Chicken-65 is 150 RS.");
                            case 3 -> System.out.println("The Price of Ghee Rice is 125 RS.");
                            case 4 -> flag1 = false; // Exits Buhari menu
                            default -> System.out.println("Invalid");
                        }
                    } while (flag1); // Condition goes here with a semicolon
                }

                case 2 -> {
                    boolean flag2 = true;
                    do {
                        System.out.println("\t\t\tA2B:");
                        System.out.println("__________________________");
                        System.out.println("1. Idli\n2. Upma\n3. Pulla\n4. Exit");
                        int choice2 = sc.nextInt();

                        switch (choice2) {
                            case 1 -> System.out.println("The Price of Idli is 20 RS.");
                            case 2 -> System.out.println("The Price of Upma is 150 RS.");
                            case 3 -> System.out.println("The Price of Pulla is 250 RS.");
                            case 4 -> flag2 = false; // Exits A2B menu
                            default -> System.out.println("Invalid");
                        }
                    } while (flag2);
                }

                case 3 -> {
                    flag = false; // Exits main program
                }

                default -> {
                    System.out.println("Invalid...");
                }
            }
        } while (flag);

        // No need for extra brackets around this statement
        System.out.println("Thank You Visit Again...");
    }

    void sheets() {
        boolean flag = true;
        do {
            System.out.println("\t\t\tClass Section:");
            System.out.println("1.10th class\n2.11th class\n3.Exit");
            int choice = sc.nextInt();
            switch (choice) {
                case 1 -> {
                    boolean flag1 = true;

                    do {
                        System.out.println("1.Maths\n2.Eng\n3.Exit");
                        int choice1 = sc.nextInt();
                        switch (choice1) {
                            case 1 -> {
                                System.out.println("Kumarvel Sir");
                            }
                            case 2 -> {
                                System.out.println("Arumugam Sir");
                            }
                            case 3 -> {
                                flag1 = false;
                            }
                            default -> {
                                System.out.println("Invalid");
                            }

                        }
                    } while (flag1);
                    {
                        System.out.println("1.10th class\n2.11th class\n3.Exit");

                    }
                }
                case 2 -> {
                    boolean flag2 = true;

                    do {
                        System.out.println("1.PHY\n2.Chemi\n3.Exit");
                        int choice2 = sc.nextInt();
                        switch (choice2) {
                            case 1 -> {
                                System.out.println("Kumarvel Sir");
                            }
                            case 2 -> {
                                System.out.println("Arumugam Sir");

                            }
                            case 3 -> {
                                flag2 = false;
                            }
                            default -> {
                                System.out.println("Invalid");
                            }
                        }
                    } while (flag2);
                    {
                        System.out.println("1.10th class\n2.11th class\n3.Exit");

                    }
                }
                case 3 -> {
                    flag = false;
                }
                default -> {
                    System.out.println("Invalid");
                }

            }

        } while (flag);
        {
            System.out.println("Visit again");

        }

    }

    void sumofn() {
        System.out.println("enter the element:");
        int num = sc.nextInt();
        int sum = 0;
        for (int i = 0; i <= num; i++) {
            sum += i;
        }
        System.out.println(sum);
    }

    public static void fact() {
        System.out.println("enter the element:");
        int num = sc.nextInt();
        int fact = 1;
        for (int i = 2; i <= num; i++) {
            fact *= i;
        }
        System.out.println(fact);
    }

    void range_start_end() {
        System.out.println("enter the element start:");
        int start = sc.nextInt();
        System.out.println("enter the element end:");
        int end = sc.nextInt();

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }

    }

    void NtoOne() {
        // System.out.println("Enter number:");
        // int num=sc.nextInt();
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }
    }

    void Even_For_loop() {
        for (int i = 2; i <= 20; i = i + 2) {
            System.out.println(i);
        }
    }

    void Odd_For_loop() {
        for (int i = 1; i <= 20; i = i + 2) {
            System.out.println(i);
        }
    }

    void TablesUsigForLoop() {
        System.out.println("Enter the number:");
        int num = sc.nextInt();
        for (int i = 1; i < 11; i++) {
            System.out.println(num + "X" + i + "=" + num * i);
        }
    }

    void CountADigitUsingForLoop() {
        System.out.println("Enter the any Digits:");
        int num = sc.nextInt();
        int count = 0;
        if (num == 0) {
            count = 1;
        } else {
            for (int i = num; i > 0; i = i / 10) {
                count++;
            }
        }
        System.out.println("The Count Of Given Number:" + count);
    }

    void Print_Sq() {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d^2=%d\n", i * i);
        }
    }

    void Print_Cb() {
        for (int i = 1; i <= 10; i++) {
            System.out.printf("%d^3=%d\n", i * i * i);
        }
    }

    public static int lag_num(int a, int b, int c) {
        System.out.println("Enter The A Value:");
        a = sc.nextInt();
        System.out.println("Enter The B Value:");
        b = sc.nextInt();
        System.out.println("Enter The C Value:");
        c = sc.nextInt();
        if (a > b && a > c) {
            return a;
        } else if (b > c) {
            return b;
        } else {
            return c;
        }

    }

    public static int digital_num(int num) {
        System.out.println("Enter the num:");
        num = sc.nextInt();
        int sum = 0;
        int digit;
        while (num > 0) {
            digit = num % 10;
            sum += digit;
            num = num / 10;

        }
        return sum;

    }

    public static String armstrong_num() {
        System.out.println("Enter The Num:");
        int num = sc.nextInt();
        int count = 0;
        int temp = num;
        while (temp > 0) {
            temp = temp / 10;
            count++;
        }
        int digit;
        temp = num;
        int sum = 0;
        while (temp > 0) {
            digit = temp % 10;
            temp = temp / 10;
            int prod = 1;
            for (int i = 1; i <= count; i++) {
                prod = prod * digit;
            }
            sum += prod;
        }
        if (num == sum) {
            return "The Given Number is " + num + " Armstrong Number";

        } else {
            return "The Given Number is " + num + " Not Armstrong Number";
        }
    }

    public static String checks_Xy_Ph(int num) {
        int temp = num;
        int count = 0;
        int St_Lt = 0;
        int In_Bt = 0;
        while (temp > 0) {
            int Last_Digit = temp % 10;
            temp = temp / 10;
            count++;

            if (count == 1) {
                St_Lt += Last_Digit;
            } else if (temp == 0) {
                St_Lt += Last_Digit;

            } else {
                In_Bt += Last_Digit;

            }

        }
        if (St_Lt == In_Bt) {
            return "Xylem";
        }
        return "Phloem";
    }
    /*
     * if(num<=9 && num>=0){
     * return false;
     * }
     * int last=num%10,mean_sum=0;
     * num/=10;
     * while(num>9){
     * mean_sum=mean_sum+num%10;
     * num/=10;
     * 
     * }
     * return (num+last)==mean_sum;
     */

    public static int first_last(int num) {
        int digit;
        int sum = 0;
        int count = 0;
        while (num > 0) {
            digit = num % 10;
            num = num / 10;

            count++;
            if (count == 1) {
                sum += digit;

            } else if (num == 0) {
                sum += digit;
            }

        }
        return sum;

    }
    /*
     * int last=num%10;
     * while(num>9){
     * number/=10;
     * }
     * return number+last
     */

    public static String Palindrome(int number) {
        int temp = number;
        int reverse = 0;
        int digit;
        while (temp > 0) {
            digit = temp % 10;
            reverse = reverse * 10 + digit;
            temp /= 10;
        }
        if (reverse == number) {
            return "Palindrome";
        }
        return "Non Palindrome";
    }

    public static String PrimeOrNot(int num) {

        if (num == 1 && num == 0) {
            return "The num is Not Prime" + num;
        }
        boolean flag = true;
        int i;
        /*
         * ""Using for loop ""
         * for(i=2;i<=Math.sqrt(num);i++);{
         * if(num%i==0){
         * flag=false;
         * }
         * 
         * }
         * if(flag==true){
         * return "The number is Prime "+num;
         * }else{
         * return "The number is Not Prime "+num;
         * }
         */

        /*
         * here using while loop
         */
        int j = 2;
        while (j < Math.sqrt(num)) {
            if (num % j == 0) {
                flag = false;
            }
            j += 1;
        }
        if (flag == true) {
            return "The number is Prime " + num;
        } else {
            return "The number is Not Prime " + num;
        }

        /*
         * logic 2 using for loop
         * for(int k=2;k<num/2;k++){
         * if(num%k==0){
         * flag=false;
         * break;
         * }
         * 
         * }
         * if(flag==true){
         * return "The Given Number is Prime Number: "+num;
         * }return "The Given Number is Not Prime Number: "+num;
         */

    }

    public static void Prime_Series() {
        System.out.println("Enter the Any Number:");
        int number = sc.nextInt();

        for (int i = 1; i <= number; i++) {
            if (isPrime(i)) {
                System.out.print(i + " ");
            }
        }
    }

    public static boolean isPrime(int number) {

        if (number <= 1) {
            return false;
        }

        for (int j = 2; j <= Math.sqrt(number); j++) {
            if (number % j == 0) {
                return false;
            }
        }

        return true;
    }

    public static int LCMLogic(int a, int b) {
        int lcm = (a > b) ? a : b;
        while (true) {
            if (lcm % a == 0 && lcm % b == 0) {
                return lcm;
            }
            lcm++;
        }
    }

    public static int GCDLogic(int a, int b) {
        /*
         * 1.find min values of a,b
         * 2.then which is both condition are statified that i iteration should be
         * answer.
         * 3.goes follow this progress until min vaues
         * 4.then which comes last value that should be condier a highest common divisor
         * 5. to over comes this process to loop runs reverser order here starting
         * itself we get a
         * highest values *
         * LOGIC 1
         * int small =0;
         * int asign=0;
         * if (a<b){
         * small=b;
         * }small=a;
         * for(int i=small;i>=1;i--){
         * if(a%i==0 && b%i==0){
         * asign=i;
         * break;
         * }
         * 
         * }
         * return (asign);
         * 
         * /
         * 
         * /*LOGIC 2
         * complitly difference because of formula methode
         * formula---->gcd(a,b)=gcd(a-b,b)
         * if we while calculating time like gets gcd(2,20) at them time
         * we need to change like way gcd(20,2)
         * if any one of them gets zero like gcd(0,2) or gcd(2,0)
         * so answer is consider as non zero values .....
         * this logic is given below
         */

        while (a > 0 && b > 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }

        }
        if (a == 0) {
            return b;
        } else {
            return a;
        }
    }

    public static String PerfectNumber(int num) {
        int sum = 0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                sum += i;
            }
        }
        if (sum == num) {
            return "The Given Number is Perfect Number " + num;
        } else {
            return "The Given Number is Not Perfect Number " + num;
        }

    }

    public static void Array_Topics() {
        // single Array
        int nums[] = { 10, 20, 30 };
        // enhance for loop using array its very helps
        for (int val : nums) {
            System.out.print(val + " ");
        }

        // single array another way to done a job
        int num[] = new int[5];
        num[0] = 1;
        num[1] = 2;
        num[3] = 5;
        num[2] = 4;
        num[4] = 5;
        for (int n : num) {
            System.out.println();
            System.out.print(n + " ");
        }
        // two dimensoinal array:
        int array_to[][] = new int[5][5];
        for (int i = 0; i <= array_to.length - 1; i++) {
            for (int j = 0; j <= array_to[i].length - 1; j++) {
                array_to[i][j] = (int) (Math.random() * 100);
            }
            System.out.println();

        }
        // for (int i = 0; i <= array_to.length - 1; i++) {
        // for (int j = 0; j <= array_to[i].length - 1; j++) {
        // System.out.print(array_to[i][j]);
        // }
        // System.out.println();

        // }

        for (int[] row : array_to) {
            for (int col : row) {
                System.out.print(col + " ");

            }
            System.out.println();
        }

    }

    public static boolean Strong_Val(int num) {
        int digit;
        int temp = num;
        int sum = 0;
        while (num > 0) {
            digit = num % 10;
            int fact = 1;
            num = num / 10;
            for (int i = digit; i >= 2; i--) {
                fact *= i;
            }
            sum = sum + fact;
        }
        return sum == temp;
    }

    public static String HappyNumber(int number) {

        while (number >= 10) {
            int sum = 0;
            while (number > 0) {
                int digit = number % 10;
                sum += digit * digit;
                number /= 10;
            }
            number = sum;
        }
        if (number == 1 || number == 7) {
            return "Happy number";
        } else {
            return "Un Happy Number";
        }
    }

    public static void Programs_Project() {
        System.out.println("\t\t\tWelcome TO Our Programming Logic:");
        boolean flag = true;
        do {
            System.out.println("Select Any Programms Go and Search A project Details:");
            System.out.println("1.Factorial\n2.Armstrong Number\n3.Prime number\n4.Exist");
            int selection = sc.nextInt();
            switch (selection) {
                case 1 -> fact();
                case 2 -> armstrong_num();
                case 3 -> Prime_Series();
                case 4 -> flag = false;
                default -> System.out.println("Try again ......");
            }
        } while (flag);

    }

    public class SuperDigitCalculator {

        // Overload 1: For normal numbers
        public static int getSuperDigit(int n) {
            // 1. Write the Base Case: If 'n' is a single digit (less than 10), return it.
            if (n < 10) {
                return n;
            }

            // 2. Write the Recursive Step:

            // Find the sum of the digits of 'n', then pass that sum back into
            // getSuperDigit()
            return 0; // Replace this
        }

        // Overload 2: For massive numbers that don't fit in an int
        public static int getSuperDigit(String n) {
            // 1. Loop through the String and sum up the numerical value of each character.

            // 2. Pass that total integer sum into your OTHER getSuperDigit method!
            return 0; // Replace this
        }

    }

    public static int sum_natural(int num) {
        if (num == 0) {
            return 0;
        }
        if(num==1){
            return 1;
        }       
        return num + sum_natural(num - 1);
    }

    public static int SumOfN(int i,int n){
        if(i>=n){
            return i ;
        }
        return i+SumOfN(i+1,n);
    }


    public static int Factorial_Num(int i,int n){
        if(i>=n){
            return i;
        }
        return i*Factorial_Num(i+1, n);

    }
    public static int Fibbo_Num(int n){
        if (n==0){
            return 0;
        }
        if(n==1){
            return 1;
        }
        return Fibbo_Num(n-1)+Fibbo_Num(n-2);

    }




    public static void main(String[] args) throws Exception {

        //questons objQuestons = new questons();

        // objQuestons.Task();
        // System.out.println("Result:"+lag_num(0, 0, 0));
        // System.out.println(cube_num(123));
        // System.out.println("result:"+digital_num(0));
        // System.out.println("result:" + first_last(9789));

        // System.out.println("result:" + armstrong_num(153));
        // System.out.println("result: " + checks_Xy_Ph(1));
        // System.out.println("Result:" + Palindrome(121));
        // System.out.println(Math.round(Math.sqrt(100)));
        // System.out.println((int)Math.sqrt(100));
        // System.out.println("Result: "+PrimeOrNot(10));
        // Prime_Series(10);
        // System.out.println(PerfectNumber(28));
        //
        // System.out.println(GCDLogic(24,32));
        // System.out.println(Math.gcd(24,32));
        // System.out.println("result: "+LCMLogic(4, 6));
        // System.out.println("result:" + Strong_Val(145));
        // Array_Topics();
        // System.out.println("result: " + HappyNumber(19));
        // Programs_Project();

        // Test 1: Standard integer
        // System.out.println("Super digit of 9875: " + getSuperDigit(9875)); //
        // Expected: 2

        // Test 2: Massive String number
        // System.out.println("Super digit of massive number: " +
        // getSuperDigit("123456789123456789123456789"));
        // Expected: 9
        // int result = sum_natural(5);
        // System.out.println(result);
        // int result=SumOfN(1,5);
        // System.out.println(result);
        //  int result=Factorial_Num(1,6);
        //     System.out.println(result);
        // int result=Fibbo_Num(6);
        // System.out.println(result);


    }

}
