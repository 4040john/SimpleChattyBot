import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = n%10;
        int b = (n%100-a)/10;
        int c = (n%1000-n%100)/100;
        int d = (n - n%1000)/1000;
        //n % 100 ==
        //2442 => 42    (2442 - a )%1000

        if(((n > 999)&&(n<10000))&&((a==d)&&(c==b)))
        {
            System.out.println(1);
        }else{
            System.out.println((int)(Math.random()*100));
        }
    }
}