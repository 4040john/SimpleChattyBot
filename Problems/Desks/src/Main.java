import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int s1 = scanner.nextInt();
        int s2 = scanner.nextInt();
        int s3 = scanner.nextInt();
        int a = Integer.parseInt(String.valueOf((int)Math.ceil((double)s1/2)));
        int b = Integer.parseInt(String.valueOf((int)Math.ceil((double)s2/2)));
        int c = Integer.parseInt(String.valueOf((int)Math.ceil((double)s3/2)));

        System.out.println(a+b+c);
    }
}