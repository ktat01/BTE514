package odev;

import java.util.Scanner;

public class odev1 {

    public static void main (String args[]) {

        Scanner konsol = new Scanner (System.in);


        System.out.println ("Lütfen karenin bir kenarının uzunluğunu giriniz: ");

        String var = konsol.next();
        Integer kenar = Integer.parseInt (var);


        System.out.print("Kare ile aynı alana sahip esk9enar ucgenin bir kenarının uzunluğu = " + Math.sqrt ((kenar * kenar *4) / Math.sqrt(3))  + " cm'dir");


    }
}
