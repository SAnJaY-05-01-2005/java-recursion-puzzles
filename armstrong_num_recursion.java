public class armstrong_num_recursion {
    static int sum = 0, count = 1,  digit, product_val = 1, i = 1;;

    public static void digit_count(int temp) {
        if (temp > 9) {
            count++;
            digit_count(temp / 10);
        }
    }

    public static void getting_digit(int temp) {
        if (temp > 0) {
            digit = temp % 10;
            product_val = 1;
            i=1;
            sum += digit_multiple_value(digit);
            getting_digit(temp / 10);
        }


    }

    public static int digit_multiple_value(int digit) {
        if (i <= count) {
            product_val *= digit;
            i++;
            digit_multiple_value(digit);
        }
        return product_val;
    }

    public static void main(String[] args) {
        int num = 153;
        int temp = num;
        digit_count(temp);
        temp = num;
        getting_digit(temp);
        if (sum == num) {
            System.out.println(num + " is an armstrong number!");
        } else {
            System.out.println(num + " is a Non armstrong number!");
        }
    }

}
