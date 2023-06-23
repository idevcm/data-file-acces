package MainPackage.Latas;

/**
 *  This class defines an object of type can and implements the measurable interface
 */
public class Can implements Measurable {

    private String name;
    private double height;
    private double radius;

    public Can(String name, double height, double radius) {
        this.name = name;
        this.height = height;
        this.radius = radius;
    }

    public double getHeight() {
        return height;
    }

    public double getRadius() {
        return radius;
    }

    public String getName() {
        return name;
    }

    @Override
    public double getMeasure() {
        return totalSurfaceArea();
    }

    private double totalSurfaceArea() {
        return 2 * (Math.PI * Math.pow(radius, 2)) + (2 * Math.PI * radius * height); // Total cylinder surface
    }
}
