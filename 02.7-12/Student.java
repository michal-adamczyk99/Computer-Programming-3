public class Student
{
    String imie;
    String nazwisko;
    String nrAlbumu;
    int wiek;
    String kierunek;
    boolean czyAktywny;
    String studentIdCard;
    boolean isValid;
    int semesterNo;
    double averageGrade;
    
    
    void sayHello() {
        System.out.println("Hello");
    }

    void displayName() {
        System.out.println(imie);
    }

    void displayAge() {
        System.out.println(wiek);
    }
    void displayInfo() {
        System.out.println(imie);
        System.out.println(semesterNo);
        System.out.println(averageGrade);
    }
    void changeStatus() {
        if (isValid == true){
            isValid = false; 
        } else {
            isValid = true;
        }
    }
    void displayCardInfo() {
        System.out.println(imie);
        System.out.println(studentIdCard);
        System.out.println(isValid);
    }
}