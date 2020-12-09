import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt();
        int sum = ((n1 + 1) * n1 + 2) * n1 + 3 ;

        System.out.println(sum);
    }
}