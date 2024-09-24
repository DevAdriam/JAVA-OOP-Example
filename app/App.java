package app;

import java.util.Scanner;

import abstraction.animal.canine.Wolf;
import abstraction.animal.feline.Cat;
import abstraction.animal.feline.Feline;
import abstraction.animal.feline.Lion;
import abstraction.animal.feline.Tiger;
import abstraction.car.Car;
import abstraction.car.Toyota;
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

        // Abstraction
        Toyota MyToyota = new Toyota("Toyota", "AA-79384");
        MyToyota.Drive();

        //anonymous class
        Car toyota = new Car("Toyota", "AA-0000") {
            @Override
            public void Drive() {
                System.out.printf("%s %s is driving%n", carModel, carNumber);
            }
        };
        toyota.Drive();

        Feline f1 = new Cat();
        Feline f2 = new Tiger();
        Feline f3 = new Lion();

        eat(f1);
        eat(f2);
        eat(f3);

    }
    
    public static void eat(Feline feline) {
        feline.Eat();
    }
}
