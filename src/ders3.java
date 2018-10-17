import java.util.Random;

public class ders3 {

    public static void main(String[] args, Random konsol) {

        System.out.println("KKilonuzu giriniz (kg)");
        double kilo = konsol.nextDouble();

        System.out.println("Boyunuzu giriniz (m)");
        double boy = konsol.nextDouble();

        double bmi = kilo / (boy*boy);
        System.out.print("BMI =  " + (kilo/(boy*boy)));



    }
}
