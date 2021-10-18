public class cinemaTicket {
    static String cinemaName = "cinema";
    String filmTitle;
    int row;
    int seat;
    double price;
    
    cinemaTicket(String title, int row, int seat, double price) {
        this.filmTitle = title;
        this.row = row;
        this.seat = seat;
        this.price = price;
    }
    
    void displayTicketInfo() {
        System.out.println(String.format("Cinema name: %s, Film title: %s, Row: %d, Seat: %d, Price: %f", cinemaTicket.cinemaName, filmTitle, row, seat, price));
    }
    
    public static void main(String[] args) {
        cinemaTicket cinemaTicket1 = new cinemaTicket("film1", 2, 3, 20.50);
        cinemaTicket cinemaTicket2 = new cinemaTicket("film2", 1, 4, 19.20);
        
        cinemaTicket1.displayTicketInfo();
        cinemaTicket2.displayTicketInfo();
    }
    
}