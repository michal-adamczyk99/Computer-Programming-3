public class DrivingLicense {
    private String name;
    private String surname;
    private String adress;
    private String postalCode;
    private String city;
    private String drivingLicenseNumber;
    private int yearOfIssue;
    private String drivingLicenseCategory;
    
    DrivingLicense(String name, String surname, String adress, String postalCode, String city, String drivingLicenseNumber, int yearOfIssue, String drivingLicenseCategory) {
        this.setName(name);
        this.setSurname(surname);
        this.setAdress(adress);
        this.setPostalCode(postalCode);
        this.setCity(city);
        this.setDrivingLicenseNumber(drivingLicenseNumber);
        this.setYearOfIssue(yearOfIssue);
        this.setDrivingLicenseCategory(drivingLicenseCategory);
    }
    //getters
    public String getName() {
        return this.name;
    }
    public String getSurname() {
        return this.surname;
    }
    public String getAdress() {
        return this.adress;
    }
    public String getPostalCode() {
        return this.postalCode;
    }
    public String getCity() {
        return this.city;
    }
    public String getDrivingLicenseNumber() {
        return this.drivingLicenseNumber;
    }
    public int getYearOfIssue() {
        return this.yearOfIssue;
    }
    public String getDrivingLicenseCategory() {
        return this.drivingLicenseCategory;
    }
    //setters
    public void setName(String name) {
        this.name = name.substring(0, 1).toUpperCase() + name.substring(1).toLowerCase();
    }
    public void setSurname(String surname) {
        this.surname = surname;
    }
    public void setAdress(String adress) {
        this.adress = adress;
    }
    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }
    public void setCity(String city) {
        this.city = city;
    }
    public void setDrivingLicenseNumber(String drivingLicenseNumber) {
        this.drivingLicenseNumber = drivingLicenseNumber;
    }
    public void setYearOfIssue(int yearOfIssue) {
        if (yearOfIssue >= 1980 && yearOfIssue <= 2021) {
            this.yearOfIssue = yearOfIssue;
        }
    }
    public void setDrivingLicenseCategory(String drivingLicenseCategory) {
        this.drivingLicenseCategory = drivingLicenseCategory;
    }
    
    public String toString() {
        return "Name: "+ this.getName() + " " + "Surname: " + this.getSurname() + " " + "Adress: " + this.getAdress() + " " + this.getCity() + " " + this.getPostalCode() + " " + "License number: " + this.getDrivingLicenseNumber() + " " + "Year of issue: " + this.getYearOfIssue() + " " + "Category: " + this.getDrivingLicenseCategory();
    }
    
    
    public void displayInfo() {
        System.out.println("Name: "+ this.getName() + " " + "Surname: " + this.getSurname());
        System.out.println("Adress: " + this.getAdress() + " " + this.getCity() + " " + this.getPostalCode());
        System.out.println("License number: " + this.getDrivingLicenseNumber() + " " + "Year of issue: " + this.getYearOfIssue() + " " + "Category: " + this.getDrivingLicenseCategory());
    }
    public static void main(String[] args) {
        DrivingLicense instance1 = new DrivingLicense("mAREK", "Darek", "Kolorowa 15", "30-567", "Krakow", "12/2356/1256", 2005, "C+E");
        instance1.displayInfo();
        System.out.println(instance1);
    }
}