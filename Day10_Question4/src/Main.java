public class Main {
    public static void main(String[] args) {
        Shape shape = new Area();
        System.out.println("Area of Rectangle: "+shape.rectangleArea(4,8));
        System.out.println("Area of Square: "+shape.squareArea(4));
        System.out.println("Area of Circle: "+shape.circleArea(5));
    }
}
