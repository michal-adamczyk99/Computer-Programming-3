public class Rectangle {
    int height;
    int width;
    
    void showInfo() {
        int perimeter = 2*height+2*width;
        int surfaceArea = height*width;
        System.out.println(String.format("Height: %d Width: %d Perimeter: %d Surface area: %d", height, width, perimeter, surfaceArea));
    }
}