public class App {
    public static void main(String[] args) throws Exception {
        BaseShapeFactory shapeFactory = new ShapeFactory();
        Shape rectangle = shapeFactory.createShape("rectangle");
        Shape triangle = shapeFactory.createShape("triangle");
        
        //NOOR ADDED
        Shape circle = shapeFactory.createShape("circle");
        
        // CAL
        
        Shape square = shapeFactory.createShape("square");
    }
}
