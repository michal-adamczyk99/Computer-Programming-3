public class Book {
    String title;
    String author;
    int pageNo;
    boolean isOpen;
    
    void openBook() {
        isOpen = true;
        System.out.println("The book is open");
    }
    
    void closeBook() {
        isOpen = false;
        System.out.println("The book is closed");
    }
    
    void nextPage() {
        if (isOpen) {
            pageNo++;
        } else {
            System.out.println("Error! The book is closed");
        }
    }
    void previousPage() {
        if (isOpen) {
            pageNo--;
        } else {
            System.out.println("Error! The book is closed");
        }
    }
    }
