public class File {
    private String name;
    private String type;
    private double size;
    
    public File(String name, String type, double size) {
        this.name = name;
        this.type = type;
        this.size = size;
    }
    
    public String toString() {
        return "Name: " + this.name + "\nType: " + this.type + "\nSize: " + this.size;
    }
    
    public double getSize() {
        return this.size;
    }
    
    public String getName() {
        return this.name;
    }
}