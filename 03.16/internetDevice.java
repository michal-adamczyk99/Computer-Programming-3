public class internetDevice {
    String name;
    boolean connected = false;
    static int connectedDevices = 0;
    
    internetDevice(String name) {
        this.name = name;
    }
    void connect() {
        this.connected = true;
        connectedDevices++;
    }
    void disconnect() {
        this.connected = false;
        connectedDevices--;
    }
    void isConnected() {
        System.out.println(this.connected);
    }
    void displayStatus() {
        System.out.println(this.name);
        System.out.println(this.connected);
    }
    static void displayConnections() {
        System.out.println("Connected devices: " + connectedDevices);
    }
    public static void main(String[] args) {
        internetDevice tv = new internetDevice("tv");
        tv.connect();
        internetDevice pc = new internetDevice("pc");
        pc.connect();
        internetDevice laptop = new internetDevice("laptop");
        laptop.connect();
        laptop.disconnect();
        internetDevice tablet = new internetDevice("tablet");
        tablet.connect();
        internetDevice phone = new internetDevice("phone");
        tv.displayStatus();
        pc.displayStatus();
        laptop.displayStatus();
        tablet.displayStatus();
        phone.displayStatus();
        displayConnections();
        
    }
}