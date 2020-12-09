import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int b = sc.nextInt();
        int h = sc.nextInt();
        countAreaOfParallelogram(b,h);
    }

    public static void countAreaOfParallelogram(int b, int h)
    {
        System.out.println(b * h);
    }
}