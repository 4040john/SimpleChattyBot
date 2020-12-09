import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        if(A+B>C && A+C>B && B+C >A){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
    }
}