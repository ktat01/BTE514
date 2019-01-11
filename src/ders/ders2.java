package ders;

public class ders2 {


    public static void main(String args []) {

        final int alt = 5;
        int us = -4;
        String s = "   ali osman yılmaz    \n";


        int radius = 5;

        /*
        System.out.println(alt + "^" + us + "=" + Math.pow(alt,us));
        System.out.println(us+" un mutlak degeri "+ Math.abs(us));
        System.out.println(Math.ceil(Math.pow(alt,us)));
        System.out.println(Math.floor(Math.pow(alt,us)));
        System.out.println(Math.round(0.5+Math.pow(alt,us)));
        System.out.println("Yaricapi " +
                radius +
                " olan bir dairennin alanı "+
                radius*radius*Math.PI);
        */

        System.out.println(s.substring(s.lastIndexOf(' ')+1, s.length()));
        //System.out.println(s.trim());
        //System.out.println(s);

/*
        Scanner konsol=new Scanner(System.in);
*/
        /*
        System.out.print("Ad Soyad: ");
        String var = konsol.nextLine();
        System.out.println("Adınız: "+ var.substring(0, var.indexOf(" ")));
        System.out.println("Soyadınız: "+ var.substring(var.indexOf(" ")+1));
        */
/*
        System.out.print("Lutfen bir fahrenheit degeri giriniz: ");
        //String var = konsol.next();
        //double fahr = Double.parseDouble(var);

        double fahr = konsol.nextDouble();
        System.out.println(fahr + " fahr = " + ((fahr-32)/1.8) +" celcius");
*/

    }
}
