import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        if(str.endsWith("burg")){
            System.out.println("true");
        }else{
            System.out.println("false");
        }
    }
}