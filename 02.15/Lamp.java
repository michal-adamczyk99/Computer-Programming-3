public class Lamp {
    boolean isOn=false;
    
    void switchOn() {
        isOn = true;
    }
    void switchOff() {
        isOn = false;
    }
    void showStatus() {
        if (isOn) {
            System.out.println("The lamp is on");
        } else {
            System.out.println("The lamp is off");
        }
    }
}