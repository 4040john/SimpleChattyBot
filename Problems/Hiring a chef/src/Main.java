//put imports you need here
import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String fName = scanner.nextLine();
        scanner.nextLine();
        scanner.nextLine();
        scanner.nextLine();
        String fusion = scanner.nextLine();

        System.out.print("The form for " + fName + " is completed. ");
        System.out.print("We will contact you if we need a chef that cooks " + fusion + " dishes.");


    }
}