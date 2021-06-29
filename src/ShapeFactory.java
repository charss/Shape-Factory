public class ShapeFactory extends BaseShapeFactory {
    @Override
    public Shape createShape(String type) {
        Shape shape;
        switch (type.toLowerCase()) {
            case "rectangle":
                shape = new Rectangle();
                break;
            case "triangle":
                shape = new Triangle();
                break;
                
            //Noor Added *********
            case "circle":
                shape = new Circle();
                break;
            //***********/
            
            // CAL
            case "square":
                shape = new Square();
                break;
            default: throw new IllegalArgumentException("Shape not available.");
        }

        shape.getArea();
        return shape;
    }
    
}
