package app;

import java.util.Scanner;

import inheritance.compositon.MyScanner;
import inheritance.compositon.Printer;
import inheritance.inheritance.rectangle;
import inheritance.inheritance.triangle;

public class App {
    public static void main(String[] args) {
        // Shape (IS-A relationship)
        rectangle myRectangle = new rectangle(20, 43);
        triangle myTriangle = new triangle(30, 25);
        myRectangle.ShowArea();
        myTriangle.ShowArea();


        // Printer (HAS-A relationship)
        MyScanner officeScanner = new MyScanner(new Scanner(System.in));
        Printer officePrinter = new Printer(officeScanner);

        officePrinter.Print("Enter your name : ");
    }
}
