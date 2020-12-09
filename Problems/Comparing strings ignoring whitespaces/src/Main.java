import java.util.Scanner;
class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);
       String str1 = scanner.nextLine();
       String str2 = scanner.nextLine();
       String str1a = str1.replace(" ","").trim();
       String str2a = str2.replace(" ","").trim();
       if(str1a.equals(str2a))
       {
           System.out.println("true");
       }else {
           System.out.println("false");
       }
    }
}