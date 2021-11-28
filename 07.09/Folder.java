import java.util.ArrayList;
public class Folder {
    private String name;
    private double size=0;
    private int numberOfFiles=0;
    private ArrayList<File> files = new ArrayList<File>();
    
    public Folder(String name) {
        this.name = name;
    }
    
    public void addFile(String name, String type, double size) {
        File file = new File(name, type, size);
        this.files.add(file);
        this.numberOfFiles += 1;
        this.size += size;
    }
    public void removeFile(String name) {
        this.numberOfFiles -= 1;
        for (int i = 0; i < this.files.size(); i++) {
            if (this.files.get(i).getName() == name) {
                this.size -= this.files.get(i).getSize();
                this.files.remove(i);
                break;
            }
        }
    }
    public ArrayList<File> getFiles() {
        return this.files;
    }
    
    public String toString() {
        return "Name: " + this.name + "\nSize: " + this.size + "\nNumber Of Files" + this.numberOfFiles; 
    }
    
    public static void main(String[] args) {
        Folder folder = new Folder("Test");
        folder.addFile("file1", "jpg", 5.5);
        folder.addFile("file2", "png", 6.25);
        System.out.println(folder.getFiles());
        folder.addFile("file3", "mp3", 8.75);
        System.out.println(folder.getFiles());
        folder.removeFile("file1");
        System.out.println(folder.getFiles());
    }
}