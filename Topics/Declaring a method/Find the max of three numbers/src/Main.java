import java.util.Scanner;

public class Main {

    public static int getNumberOfMaxParam(int a, int b, int c) {
        int n = 0;
        if (a >= b && a >= c) {
            n = 1;
        } else if (b > a && b >= c) {
            n = 2;
        } else {
            n = 3;
        }
        return n;
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        final int a = scanner.nextInt();
        final int b = scanner.nextInt();
        final int c = scanner.nextInt();

        System.out.println(getNumberOfMaxParam(a, b, c));
    }
}