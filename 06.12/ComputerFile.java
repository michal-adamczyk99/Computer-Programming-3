public class ComputerFile {
    private String name;
    private int size;
    private String format;
    
    public void setName(String name) {
        this.name = name;
    }
     public void setSize(int size) {
        this.size = size;
    }
     public void setFormat(String format) {
        this.format = format;
    }
    
    public String getName() {
        return this.name;
    }
    public int getSize() {
        return this.size;
    }
    public String getFormat() {
        return this.format;
    }
    
    ComputerFile(String name, int size, String format) {
        this.setName(name);
        this.setSize(size);
        this.setFormat(format);
    }
    
    public String toString() {
        return "Name: " + this.getName() + " Size: " + this.getSize() + " Format: " + this.getFormat();
    }
}