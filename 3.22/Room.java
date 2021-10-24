import java.util.Arrays;
public class Room {
    int number;
    int beds;
    boolean occupied;
    String guestName;
    
    Room(int number) {
        this.number = number;
        this.beds = 2;
    }
    Room(int number, int beds) {
        this.number = number;
        this.beds = beds;
    }
    
    public String toString() {
        return "Room number: " + this.number + " " + "Beds: " + this.beds + " " + "Occupied: " + this.occupied + " " + "Guest Name: " + this.guestName;
    }
    void checkin(String guestName) {
        this.guestName = guestName;
        this.occupied = true;
    }
    void checkout() {
        this.guestName = null;
        this.occupied = false;
    }
    void isOccupied() {
        System.out.println(this.occupied);
    }
    /*
    void displayStatus() {
        if (this.occupied) {
            System.out.println("Room number: " + this.number + " " + "Beds: " + this.beds + " " + "Occupied: " + this.occupied + " " + "Guest Name: " + this.guestName);
        } else {
            System.out.println("Room number: " + this.number + " " + "Beds: " + this.beds + " " + "Occupied: " + this.occupied);
        }
    }
    */
    static void displaySingleRoom(Room[] rooms, int number) {
        System.out.println(rooms[number]);
    }
    static void displayReport(Room[] rooms) {
        for (Room i : rooms) {
            System.out.println(i);
        }
    }
    static void displayBedReport(Room[] rooms, int beds) {
        for (Room i : rooms) {
            if (i.beds == beds) {
                System.out.println(i);
            }
        }
    }
    static void displayVacancyReport(Room[] rooms) {
        int vacant1 = 0;
        int occupied1 = 0;
        for (Room i : rooms) {
            if (i.occupied) {
                occupied1++;
            } else {
                vacant1++;
            }
        }
        System.out.println("Occupied: " + occupied1 + " " + "Vacant: " + vacant1);
    }
    static void displayBedVacancyReport(Room[] rooms) {
        int vacantBeds = 0;
        for (Room i : rooms) {
            if (i.occupied == false) {
                vacantBeds += i.beds;
            }
        }
        System.out.println("Vacant beds: " + vacantBeds);
    }
    public static void main(String[] args) {
        Room[] rooms = new Room[6];
        rooms[0] = new Room(1, 2);
        rooms[1] = new Room(2, 2);
        rooms[1].checkin("Alberto");
        rooms[2] = new Room(3, 2);
        rooms[3] = new Room(4, 3);
        rooms[3].checkin("Zenon");
        rooms[3].checkout();
        rooms[4] = new Room(5, 3);
        rooms[5] = new Room(6, 1);
        
        Room.displaySingleRoom(rooms, 1);
        Room.displayReport(rooms);
        Room.displayBedReport(rooms, 3);
        Room.displayVacancyReport(rooms);
        Room.displayBedVacancyReport(rooms);
        
        
    }
    
}