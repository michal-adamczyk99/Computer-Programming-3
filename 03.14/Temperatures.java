public class Temperatures {
    static double celsiusToKelvin(double celsius) {
        return celsius + 273.15;
    }
    static double celsiusToFahrenheit(double celsius) {
        return celsius*1.8 + 32;
    }
    static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit-32)/1.8;
    }
    static double fahrenheitToKelvin(double fahrenheit) {
        return (fahrenheit-32)/1.8 + 273.15;
    }
    static double kelvinToCelsius(double kelvin) {
        return kelvin - 273.15;
    }
    static double kelvinToFahrenheit(double kelvin) {
        return (kelvin-273.15)*1.8 + 32;
    }
    public static void main(String[] args) {
        System.out.println(celsiusToKelvin(25));
        System.out.println(celsiusToFahrenheit(25));
        System.out.println(fahrenheitToKelvin(100));
        System.out.println(fahrenheitToCelsius(100));
        System.out.println(kelvinToCelsius(0));
        System.out.println(kelvinToFahrenheit(0));
    }
}