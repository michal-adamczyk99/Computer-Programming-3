public class surfaceArea {
    static double calculateCircle(double r) {
        return 3.14*r*r;
    }
    static double calculateTriangle(double w, double h) {
        return (w*h)/2;
    }
    static double calculateRectangle(double w, double h) {
        return w*h;
    }
    public static void main(String[] args) {
        System.out.println(surfaceArea.calculateRectangle(4,5));
        System.out.println(surfaceArea.calculateCircle(3));
        System.out.println(surfaceArea.calculateTriangle(3,4));
    }
}