import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int y = sc.nextInt();

        if(y >= 1900 && y <= 3000){
            if ((y % 4 == 0)&&(y % 100 != 0)||(y%400 == 0)){
                System.out.println("Leap");
            }else{
                System.out.println("Regular");
            }
        }else{
            System.out.println("Regular");
        }
    }
}