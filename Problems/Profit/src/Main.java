import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double M = sc.nextDouble();
        double P = sc.nextDouble();
        double K = sc.nextDouble();
        double year = M + M*(P/100);
        int x = 1;
        // (M + M*(P/100)) * year
        while (M <= K){
            if((x * year) >=K){
                ++x;
                System.out.println(x);

            }


        }
    }
}