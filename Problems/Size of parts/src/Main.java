import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int larger = 0;
        int smaller = 0;
        int perfect = 0;
        int temp;

        for (int i = 0;i < n; i++)
        {
            temp = sc.nextInt();
            if(temp < 0){
                smaller++;

            }else if (temp > 0) {
                larger++;

            } else {
                perfect++;
            }

        }

        System.out.print(perfect +" " + larger +" " + smaller);
    }
}