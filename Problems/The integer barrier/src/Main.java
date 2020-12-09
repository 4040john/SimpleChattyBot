import  java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        while (sc.hasNext()){
            int num = sc.nextInt();
            if ((num>0)&&(sum<1000)){
                sum += num;
            }else{
                break;
            }
        }
        if(sum<1000){
            System.out.println(sum);
        }else{
            System.out.println(sum-1000);
        }
    }
}