import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int n = Integer.parseInt(scanner.next());
        boolean result = n < 10 && n> 0;
        System.out.println(result);

    }
}