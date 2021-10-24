public class cinemaTicket {
    static String cinemaName = "cinema";
    String filmTitle;
    int row;
    int seat;
    double price;
    
    cinemaTicket(String title, int row, int seat) {
        this.filmTitle = title;
        this.row = row;
        this.seat = seat;
        if (this.row<=2) {
            this.price = 10;
        } else {
            this.price = 25;
        }
    }
    
    void displayTicketInfo() {
        System.out.println(String.format("Cinema name: %s, Film title: %s, Row: %d, Seat: %d, Price: %f", cinemaTicket.cinemaName, filmTitle, row, seat, price));
    }
    
    public static void main(String[] args) {
        cinemaTicket.cinemaName = "Morning Star Cinema";
        cinemaTicket cinemaTicket1 = new cinemaTicket("Gladiator", 2, 3);
        cinemaTicket cinemaTicket2 = new cinemaTicket("Gladiator", 7, 4);
        
        cinemaTicket1.displayTicketInfo();
        cinemaTicket2.displayTicketInfo();
    }
    
}