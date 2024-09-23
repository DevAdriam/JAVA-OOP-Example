package inheritance.compositon;
import java.util.Scanner;

public class MyScanner {
    private Scanner myScanner;
    
    public MyScanner(Scanner scanner) {
        this.myScanner = scanner;
    }

    public String scanLine(String message) {
        System.out.print(message);
        return myScanner.nextLine();
    }
}
