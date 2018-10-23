import java.util.Scanner;

public class odev2 {

    public static void main (String args[]) {


        Scanner konsol = new Scanner(System.in);

        System.out.println("Karenin alanını giriniz: ");
        Double karealan = konsol.nextDouble();

        System.out.println("Küpün hacmini giriniz: ");
        Double kuphacim = konsol.nextDouble();


        if (Math.abs(Math.pow(karealan,1/2.0) - Math.pow(kuphacim,1/3.0)) < 0.000000001)
        System.out.println("Kare ve Küpün kenarları eşittir.");

        else System.out.println("Kare ve küpün kenarları eşit değildir.") ;



    }
}
