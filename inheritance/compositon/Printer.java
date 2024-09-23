package inheritance.compositon;

public class Printer {
    private MyScanner scanner;

    public Printer(MyScanner scanner) {
        this.scanner = scanner;
    }

    public void Print(String message ) {
        String scanResult = scanner.scanLine(message);
        System.out.printf("You said : %s%n",scanResult);
    }
   
}
