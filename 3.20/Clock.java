public class Clock {
    int hour;
    int minute;
    int alarmHour;
    int alarmMinute;
    
    Clock() {
        this.hour = 0;
        this.minute = 0;
    }
    Clock(int hour, int minute) {
        if (0<=hour & hour<=23) {
            this.hour = hour;
        }
        if (0<=minute & minute<=59) {
            this.minute = minute;
        }
    }
    void setClock(int hour, int minute) {
        if (0<=hour & hour<=23) {
            this.hour = hour;
        }
        if (0<=minute & minute<=59) {
            this.minute = minute;
        }
    }
    void setClock() {
        this.hour = 0;
        this.minute = 0;
    }
    void displayTime() {
        String time = "";
        if (this.hour<10) {
            time += "0" + Integer.toString(this.hour);
        } else {
            time += Integer.toString(this.hour);
        }
        time += ":";
        if (this.minute<10) {
            time += "0" + Integer.toString(this.minute);
        } else {
            time += Integer.toString(this.minute);
        }
        System.out.println(time);
    }
    void setAlarm(int hour, int minute) {
         if (0<=hour & hour<=23) {
            this.alarmHour = hour;
        }
        if (0<=minute & minute<=59) {
            this.alarmMinute = minute;
        }
    }
    void runAlarm() {
        System.out.println("beep-beep-beep-beep !!");
    }
    void addOneMinute() {
        this.minute++;
        if (this.minute == 60) {
            this.hour++;
            this.minute = 0;
        }
        if (this.hour == 24) {
            this.hour = 0;
        }
        if (this.hour == this.alarmHour & this.minute == this.alarmMinute) {
            this.runAlarm();
        }
    }
    public static void main(String[] args) {
        Clock clock1 = new Clock(12, 47);
        clock1.displayTime();
        clock1.setClock(18,14);
        clock1.displayTime();
        clock1.setClock(9,3);
        clock1.displayTime();
        clock1.setClock(23, 58);
        clock1.displayTime();
        clock1.addOneMinute();
        clock1.displayTime();
        clock1.setAlarm(0,0);
        clock1.addOneMinute();
        clock1.displayTime();
    }
}