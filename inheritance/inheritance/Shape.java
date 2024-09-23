package inheritance.inheritance;
public class Shape {
    protected double base;
    protected double height;
    
    public Shape(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public void ShowArea() {
        System.out.println(base * height);
    }

}
