package Rectangle;

public class Main {

    public static void main(String[] args) {


        Rectangle r1 = new Rectangle();
        r1.setWidth(5);
        r1.setHeight(10);
        System.out.println(r1.calculateArea());
        System.out.println(r1.calculatePerimete());
    }
}