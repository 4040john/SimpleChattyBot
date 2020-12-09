import java.util.ArrayList;
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int max = 0;
        for(int i=0;i <n;i++){
            int num = sc.nextInt();
            if(num%4 ==0 && num>max)
            {
                max = num;
            }
        }
        System.out.println(max);
//        int max = 0;
//        while (sc.hasNext()){
//            int n = sc.nextInt();
//            if((n%4 ==0) &&(n<3000)){
//                if(n>=max){
//                    max = n;
//                }
//            }
//        }
//        System.out.println(max);
    }
}