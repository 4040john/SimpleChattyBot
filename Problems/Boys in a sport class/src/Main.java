import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        int b1 = scanner.nextInt();
        int b2 = scanner.nextInt();
        int b3 = scanner.nextInt();
        boolean result =( b1 >= b2 && b2 >= b3)||
                (b1 <= b2 && b2 <= b3);

        System.out.println(result);
    }
}