package calisma;

import java.util.Scanner;

public class calisma2 {

    public static void main(String[] args) {

        Scanner konsol = new Scanner(System.in);


        //user'a kaç sayı gireceğini sorup, girdiği sayıların ortalamasını bulma
    /*
        System.out.println("Kaç not gireceksiniz");
        int notSay=konsol.nextInt();
        int toplam=0;

        for(int i=0; i<notSay; i++)
            toplam+=konsol.nextInt();

        System.out.println("Ortalama:" + ((double)toplam/notSay));
*/



     /*
        System.out.println("Kaç not gireceksiniz");
        int notSay=konsol.nextInt();
        int toplam=0;

        for(int i=0; i<notSay; i++)
            toplam+=konsol.nextInt();

        System.out.println("Ortalama:" + ((double)toplam/notSay));
     */

     /*

     int [] arr = {4, 5, 6, 10, 12, 17, 23};

        for (int element: arr) {
            System.out.println(element);
        }

     */

     /*
        int[] arr = {4, 5, 6, 10, 12, 17, 23};

        int maxValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > maxValue) {
                maxValue = arr[i];
            }
        }
        int minValue = arr[0];
        for (int i = 1; i < arr.length; i++) {
             if (arr[i] < minValue) {
                minValue = arr[i];
             }
        }
           System.out.println("max değer:" + maxValue + " min değer:" + minValue);
     */


       /*
        String line = "Was it a cat I saw";

        ArrayList<String> lines = new ArrayList <String>( );


        String[] words = line.split(" ");

        System.out.println(Arrays.toString(words));
       */


       /*
        int[] arr = {40, 72, 14, 26, 1000, 64};

        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
        */

        int a []=new int[5];
        a[2]=9;

        System.out.println("" + a[2]);


    }
}