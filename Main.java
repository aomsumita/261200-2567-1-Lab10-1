//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Shape shape1 = ShapeFactory.getShape(ShapeFactory.TYPE_CIRCLE);
        Shape shape2 = ShapeFactory.getShape(ShapeFactory.TYPE_CIRCLE);
        Shape shape3 = ShapeFactory.getShape(ShapeFactory.TYPE_CIRCLE);
        shape1.draw();
        shape2.draw();
        shape3.draw();
    }
}