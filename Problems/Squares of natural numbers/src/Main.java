import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int x = 1;
        while (x*x <= n) {
            System.out.println(x*x);
            x++;
        }
    }
}