public class Computer {
    private String model;
    private Processor processor;
    private String system;
    private int ramCount;
    
    public Computer(String model, String system, int ramCount, String cpuModel, double cpuFreq, int cpuCores, int cpuCache){
        this.model = model;
        this.system = system;
        this.ramCount = ramCount;
        this.processor = new Processor(cpuModel, cpuFreq, cpuCores, cpuCache);
    }
    
    public String toString() {
        return "Model: " + this.model + "\nProcessor: " + this.processor.toString() + "\nSystem: " + this.system + "\nRam: " + this.ramCount;
    }
    public void setSystem(String system) {
        this.system = system;
    }
    public void setRamCount(int ramCount) {
        this.ramCount = ramCount;
    }
    public void setModel(String model) {
        this.model = model;
    }
    
    public static void main(String[] args) {
        Computer pc1 = new Computer("MSI", "W11", 6, "Intel Core i935952848425", 3.2, 4, 3);
        System.out.println(pc1);
    }
}