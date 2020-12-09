import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        for(int i=0;i<=1000;i++) {
            int result = a * i * i * i + b * i * i + c * i + d;
            if (result == 0)  {
                System.out.println(i);
            }
        }
    }
}