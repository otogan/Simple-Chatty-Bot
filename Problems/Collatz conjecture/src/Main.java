import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        System.out.println(n);
        while (n > 1) {
            n = n % 2 == 0 ? n / 2 : n * 3 + 1;
            System.out.println(n);
        }
    }
}
