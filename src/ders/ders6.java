package ders;

import java.util.Scanner;

public class ders6 {

    public static void main(String[] args) {

        Scanner konsol = new Scanner(System.in);

     //n adet sayı isteyip, array oluşturarak ortalamasını bulma
        /*
        System.out.println("Kaç adet sayı gireceksiniz?"); //-->> arraylerin yapıları gereği sayıları belli olmak zorundadır.o sebeple bu ilk printte kullanıcıya kaç adet sayı gireceğini sorup, dizin uzunluğunu o sayıya göre belirlememiz gerekir. belirsiz sayıda array uzunluğuyla işlem yapılmaz.
        int sayilar=konsol.nextInt();
        System.out.println("Lütfen "+sayilar+ " adet sayı giriniz");

        int dizin[]=new int[sayilar];
        double toplam=0;

        for(int i=0;i<dizin.length;i++){ //-->> buradaki "i", indexi ifade eder. sıfırıncı indexe ilk girilen sayıyı, birinci indexe ikinci girilen sayıyı şeklinde, girilen sayıları index hanelerine atar.
            dizin[i]=konsol.nextInt();
            toplam+=dizin[i];
        }
        System.out.println("Girilen sayıların ortalaması " + (toplam/dizin.length));
        */

        //n adet sayı isteyip, array oluşturarak standart sapmasını bulma
        /*
        System.out.println("Kaç adet sayı gireceksiniz?");
        int sayiadet=konsol.nextInt();

        System.out.println("Lütfen " + sayiadet +" adet sayıyı giriniz: ");

        int dizin[]=new int[sayiadet];
        int toplam = 0;

        for (int i = 0; i < sayiadet; i++) {
            dizin[i] = konsol.nextInt();
            toplam += dizin[i];
        }

        double standartSapma=0;
        double ortalama=(toplam/sayiadet);

        for(int i=0;i<sayiadet;i++){
            standartSapma += Math.pow(dizin[i]-ortalama,2);
        }
        System.out.println("Standart sapma: " + Math.sqrt(standartSapma/(sayiadet-1)));
        */


/*
        double ortalama = (toplam / notSay);

        toplam=0;
        for(int i=0;i<notlar.length;i++){
            toplam+= Math.pow(notlar[i]-ortalama,2);
        }

        System.out.println("Standart sapma:"+ Math.sqrt(toplam/notSay));
    */


     //arrayde verilen sayıları alt alta yazdırmak(uzun yol)
       /*
        int[] arr = {40, 72, 14, 26, 1000, 64};

        for(int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
        */


     //arrayde verilen sayıları alt alta yazdırmak(kısa yol)
        /*
        int [] arr = {4, 5, 6, 10, 12, 17, 23};

        for (int element: arr) {
            System.out.println(element);
        }
      */

     //arraydeki değerleri string'e çevirip yazdırmak
      /*
      System.out.println(Arrays.toString(arr)); */



        // verilen bir arraydeki sayıların max ve min olanlarını bulup yazdırma
     /*
       int[] arr = {4, 5, 6, 10, 12, 17, 23, 139};

       int min= Arrays.stream(arr).min().getAsInt();
       int max= Arrays.stream(arr).max().getAsInt();

       for(int i=0;i<arr.length;i++){
           if(arr[i]>min){
               arr[i]=min;
           }
           if(arr[i]>max){
               arr[i]=max;
           }
       }
        System.out.println("Max value: "+max+ "\nMin value: " +min);
       */



     //??? //uzunluğu 100 olan bir arrayi fibonacci sayılarıyla doldurma
        /*
        double[] fibarray = new double[100];

        fibarray[0]=1;
        fibarray[1]=1;

        for(int i=2;i<fibarray.length;i++)
            fibarray[i]=fibarray[i-1]+fibarray[i-2];

        System.out.println(Arrays.toString(fibarray));

        */


     //??? //bir arraydeki sayıların standart sapmasını bulma
      /*
        double[] arr = {10, 40, 50, 30, 20, 15};

        double min = arr[0];
        double max = arr[0];



        for(int i=0;i<arr.length;i++){
            if(arr[i]<min)
                min=arr[i];
            if(arr[i]>max)
                max=arr[i];
          }

        Double[] result = new Double[6];
        for(int i=0;i<arr.length;i++)
            result[i]=(arr[i]-min)*100/(max-min);

        System.out.println(Arrays.toString(result));
       */


     //??? //bir arraydeki sayıların yerini değiştirme
        /*
        int[] arr = {10, 40, 50, 30, 20, 15};

        int temp;
        int mid=(int)Math.ceil(arr.length/2.0);
        System.out.println("Before:"+Arrays.toString(arr));

        for(int i=0;i<arr.length/2;i++){
            temp=arr[i];
            arr[i]=arr[mid+i];
            arr[mid+i]=temp;
        }
        System.out.println("After:"+Arrays.toString(arr));

        */


     //string şeklinde verilen bir cümlenin kelimlerini array içine ayrı değerler olarak yazdırma(Kısa Yöntem)
        /*
        String line = "Was it a cat I saw";
        ArrayList<String> lines = new ArrayList <String>( );

        String[] words = line.split(" ");

        System.out.println(Arrays.toString(words));
           */


     //??? //string şeklinde bir cümleyi array içine ayrı değerler olarak yazdırma(Uzun Yöntem)
      /*
        String line = "Was it a cat I saw";
        ArrayList <String> lines = new ArrayList <String>( );

        int i = 0;
        while (line.indexOf(" ") > 0) {
            lines.add(line.substring(0, line.indexOf(" ")));
            line = line.substring(line.indexOf(" ") + 1);
            i++;
        }
        lines.add(line);

        System.out.println(lines);

        */



    }
}
