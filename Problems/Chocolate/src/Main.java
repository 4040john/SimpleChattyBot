import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int k = sc.nextInt();

        if ((k % m == 0 || k % n == 0) && n * m >= k) {
            System.out.println("YES");
        } else {
            System.out.println("NO");
        }

        /*if((K %2 == 0)&&(K <= N || K<=M ))
        {
            System.out.println("YES");
        }else if((K %2 == 0)&& K<=(N*M)){
            System.out.println("YES");
        }else if(K == (N*M)){
            System.out.println("YES");
        }else if(((K % N == 0)||(K % M ==0))&&(K<=(N*M))){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }*/

    }
}