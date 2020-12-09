import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int num = sc.nextInt();
        if(-15< num && num <= 12)
        {
            System.out.println("True");
        }else if(14 < num && num < 17){
            System.out.println("True");
        }else if(num >= 19){
            System.out.println("True");
        }else{
            System.out.println("False");
        }
    }
}