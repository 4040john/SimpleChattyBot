import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x1 = sc.nextInt();
        int y1 = sc.nextInt();
        int x2 = sc.nextInt();
        int y2 = sc.nextInt();

        if((x1 == y1)&&(x2==y2)){
            System.out.println("YES");
        }else if((x1==x2)||(y1==y2)){
            System.out.println("YES");
        }else if(Math.abs(x2-x1) ==Math.abs(y2-y1))
        {
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }
        //Divide into 3 cases:
        //- x1 == x2
        //- y1 == y2
        //- abs(x2 - x1) == abs (y2 - y1)
    }
}