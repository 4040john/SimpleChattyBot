import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        boolean t = scanner.nextBoolean();
        if((n>= 15 && n<=25)&& t == true )
        {
            System.out.println("true");
        }else if ((n>=10 && n<=20)&& t == false)
        {
            System.out.println("true");
        }else {
            System.out.println("false");
        }
    }
}