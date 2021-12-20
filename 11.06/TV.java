public class TV implements CanOnOff, CanChangeChannel, CanChangeVolume{
    private boolean isOn=false;
    private int channelNo;
    private int volumeLevel;
    private String[] channelNames = new String[99];
    
    public TV() {
        this.channelNames[0] = "TVP1";
        this.channelNames[1] = "TVP2";
        this.channelNames[2] = "TVP INFO";
        this.channelNames[3] = "Polsat";
        this.channelNames[4] = "TVN";
        this.channelNames[5] = "TV4";
        this.channelNames[6] = "FOKUS TV";
        this.channelNames[7] = "TVN24";
        this.channelNames[8] = "Polsat News";
        this.channelNames[9] = "TVN7";
    }
    public void showStatus() {
        if (this.isOn) {
        System.out.println("TV is on");
        System.out.println("Channel Number: " + this.channelNo + " Channel: " + this.channelNames[this.channelNo-1]);
        System.out.println("Volume Level: " + this.volumeLevel);
        } else {System.out.println("TV is off");}
    }
    
    public void on() {
        this.isOn = true;
        this.channelNo=1;
        this.volumeLevel=1;
    }
    public void off() {
        this.isOn = false;
    }
    
    public void channelUp() {
        if (this.isOn && this.channelNo < 99) {
            if (this.channelNo == 99) {
                this.channelNo = 1;
            } else {this.channelNo += 1;}
        }
    }
    
    public void channelDown() {
        if (this.isOn && this.channelNo > 1) {
            if (this.channelNo == 1) {
                this.channelNo = 99;
            } else {this.channelNo -= 1;}
        }
    }
    public void setChannel(int channelNo) {
        if (this.isOn && channelNo >= 1 && channelNo <=99) {
            this.channelNo = channelNo;
        }
    }
    
    public void volumeUp() {
        if (this.isOn && this.volumeLevel < 10) {
            this.volumeLevel += 1;
        }
    }
    public void volumeDown() {
        if (this.isOn && this.volumeLevel > 1) {
            this.volumeLevel -= 1;
        }
    }
    
    public void displayChannels() {
        System.out.println("Channel list:");
        for (int i=0;i<10;i++) {
            System.out.println("Channel number: " + (i+1) + " Channel name: " + this.channelNames[i]);
        }
    }
    
    public static void main(String[] args) {
        TV tv = new TV();
        /*tv.on();
        tv.showStatus();
        tv.off();
        tv.showStatus();*/
        
        /*tv.on();
        tv.showStatus();
        tv.channelUp();
        tv.setChannel(7);
        tv.setChannel(142);
        tv.showStatus();
        tv.channelDown();
        tv.showStatus();
        tv.off();
        tv.showStatus();*/
        
        /*tv.on();
        tv.showStatus();
        tv.setChannel(15);
        for (int i=0; i<6; i++) {
            tv.volumeUp();
        }
        tv.showStatus();
        tv.off();
        tv.showStatus();*/
        
        tv.displayChannels();
        tv.on();
        tv.showStatus();
    }
    
}