package inheritance.inheritance;

public class triangle extends Shape{

    public triangle(double base, double height) {
        super(base, height);
    }
    
    @Override
    public void ShowArea() {
        System.out.println(base * height / 2);
    }
}
