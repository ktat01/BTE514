package ders;

import java.util.Scanner;

public class ders3 {

    public static void main(String[] args) {

        Scanner konsol = new Scanner(System.in);

      /*
        System.out.println("Kilonuzu giriniz (kg)");
        double kilo = konsol.nextDouble();

        System.out.println("Boyunuzu giriniz (m)");
        double boy = konsol.nextDouble();

        double bmi = kilo / (boy*boy);
        //System.out.print("BMI =  " + (kilo/(boy*boy)));

        if (bmi<=18){
            System.out.println("BMI= " + kilo/(boy*boy));
            System.out.println("Biraz kilo alabilirsiniz.");
        }

        else if (bmi>=24){
            System.out.println("BMI= " + kilo/(boy*boy));
            System.out.println("Biraz kilo vermeniz iyi olur.");
        }

        else {
            System.out.println("BMI= " + kilo/(boy*boy));
            System.out.println("Kilo durumunuz iyi.");
        }

        //if (!(bmi<=18)) {  ----> ünlem işareti if not demektir <-----
        //    System.out.println("BMI= " + kilo/(boy*boy));
        //    System.out.println("Biraz kilo alabilirsiniz.");
 */


/*
        int x = konsol.nextInt();
        int y = konsol.nextInt();
        int z = konsol.nextInt();

       if(x>y){
            if(z>x) System.out.println("Median: "+ x);
            else if(z>y) System.out.println("Median: "+z);
            else System.out.println("Median: "+y);
        }
        else if(y>z){
            if(x>z)
                System.out.println("Median: "+ x);
            else System.out.println("Median: "+ z);
        }
        else{

            System.out.println("Median: "+y);
        }

     veya

        if((x<y && z<x) || (x<z && y<x)){
            System.out.println("Median: "+x);
        }
        else if((y<x && z<y) || ((y<z && x<y))){
            System.out.println("Median: "+y);
        }
        else if((y<z && z<x) || (x<z && z<y)){
            System.out.println("Median: "+z);
        }
 */

/*
        int sum = x+y+z;
        int min = Math.min(Math.min(x, y),z);
        int max = Math.max(Math.max(x, y),z);

        System.out.println("Median:"+ (sum-max-min));
*/

/*
         System.out.println("Celcius or Fahrenheit");
         String var = konsol.next();
         System.out.println("Input Value to be converted:");
         double val = konsol.nextDouble();

          if ( var.equals("C")) || (var.equals("c"))
              System.out.println( val + "C=" + (val*1.8+32) + "F");

          else if ((var.equals("F")) || (var.equals("f"))
              System.out.println( val + "F=" + ((val-32)/1.8)) + "C");

          else System.out.println ("Yanlış bir değer girdiniz.");
      */

      /*
        if(choice.toUpperCase().equals("C"))
            System.out.println(val+" C = "+ (val*1.8+32) +" F");

        else if(choice.toUpperCase().charAt(0) == 'C')
            System.out.println(val+" F = "+ ((val-32)/1.8) +" C");

        else System.out.println("Yanlis deger girdiniz");
      */


     /*   System.out.println("Input value to be converted");
        String input = konsol.next();
        char choice = input.charAt(input.length()-1);
        double val = Double.parseDouble(
                input.substring(0, input.length()-1));

        if(choice=='C')
            System.out.println(val+" C = "+ (val*1.8+32) +" F");
        else if(choice == 'F')
            System.out.println(val+" F = "+ ((val-32)/1.8) +" C");
        else System.out.println("Yanlis deger girdiniz");*/


      /*
        System.out.println("Kilonuzu giriniz (kg)");
        double kilo = konsol.nextDouble();

        System.out.println("Boyunuzu giriniz (m)");
        double boy = konsol.nextDouble();

        double bmi = kilo / (boy*boy);
        //System.out.print("BMI =  " + (kilo/(boy*boy)));

        if (bmi>=18 && bmi<=24){
            System.out.println("BMI= " + kilo/(boy*boy));
            System.out.println("İyi");
        }

        else System.out.println("doktora gidin"); */


    }
}
