import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int busHeight = sc.nextInt();
        int bridges = sc.nextInt();
        int crashB = 0;

        for (int i = 1; i <= bridges; i++) {
            int brHeight = sc.nextInt();
            if (busHeight >= brHeight) {
                crashB++;
                System.out.println("Will crash on bridge "+i);
                break;
            }else{
                continue;
            }
        }
        if (crashB == 0){
            System.out.println("Will not crash");
        }
    }
}