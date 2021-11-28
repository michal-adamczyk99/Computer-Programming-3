public class Processor{
    private String model;
    private double frequency;
    private int coreCount;
    private int cache;
    private boolean boostEnabled;
    
    public Processor(String model, double frequency, int coreCount, int cache) {
        this.model = model;
        this.frequency = frequency;
        this.coreCount = coreCount;
        this.cache = cache;
    }
    
    public String toString() {
        return this.model + "\nFrequency: " + this.frequency + "\nCores: " + this.coreCount + "\nCache: " + this.cache + "\nBoost: " + ((boostEnabled) ? "Yes" : "No");
    }
    
    
}
