import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String word = scanner.next();
        int i = scanner.nextInt();
        int n = scanner.nextInt();
        String word1 = word.substring(i, n + 1);
        System.out.println(word1);
    }
}