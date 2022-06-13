import java.util.Scanner;

public class Main {

    public static String sign(int number) {
        String var = null;
        if (number < 0) {
            var = "-1";
        } else if (number > 0) {
            var = "+1";
        } else {
            var = "0";
        }
        return var;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        final Scanner scanner = new Scanner(System.in);
        final int n = scanner.nextInt();
        System.out.println(sign(n));
    }
}