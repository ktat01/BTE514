package calisma;

import java.util.Scanner;

public class calisma4 {

    public static void main(String args[]) {

        Scanner konsol = new Scanner(System.in);

        //data definition, data types and println
       /*
        x=x+10;
        x=x+x;

        System.out.println(x);
        x=x*x;
        System.out.println(x);
        x=x-5;
        System.out.println(x);

       // double y=x;
       // y=y/10;
       // System.out.println(y);
        double y = Double.valueOf(x);
        y=y/10;
        System.out.println(y);
        */

       /*
       int x = 10;

       x/=2;

       System.out.println(x);
       */

       /*
       Double y= 8.15;
       System.out.println(Double.toString(y)); */

       /*
       String a="Hello World";

       System.out.println(a); */

       /*
       String a="Kübra ";
       String b="'ndür diyette";
       int c= 9;

       System.out.println(a+ c+b); */

       /*
        Scanner konsol=new Scanner(System.in);

        System.out.println("isminiz nedir?");
        String isim=konsol.next();

        System.out.println("Kaç gündür diyettesiniz?");
        int gun=konsol.nextInt();

        System.out.println(isim+" "+gun+" gündür diyette!"); */

       /*
        final int alt = 5;
        int us = -4;
        String s = "   ali osman yılmaz     \n"; */


        // System.out.println(s.substring(s.lastIndexOf(' ')+1, s.length())); -->ANLAMADIM???????

        /*
        //System.out.println(s.trim());
        //System.out.println(s); */

       /*
        double a=10.234;
        double b=20.980;
        int c=2;
        int d=5;
        int e=-3;
        double f=49; */


        //üssü alma
        /* System.out.println("5 üssü -3 = "+ Math.pow(5,-3));*/


        //mutlak değer bulma
        /* System.out.println("-3'ün mutlak değeri= " + Math.abs(e));*/


        //max ve min value bulma
        /* System.out.println("a ve b sayılarından büyük olanı= " + Math.max(a,b));
           System.out.println("a ve b sayılarından küçük olanı= " + Math.min(a,b)); */


        //karekök bulma
        /* System.out.println("49'un karekökü =" + Math.sqrt(f)); */


        //üste yuvarlama
        /* System.out.println(Math.ceil(b)); */


        //alta yuvarlam
        /* System.out.println(Math.floor(a)); */


        //fahrenheit alıp, celcius'a çevirme
        /*
        Scanner konsol=new Scanner(System.in);

        System.out.println("Lütfen havanın kaç Fahrenheit olduğunu giriniz!");
        double fahren=konsol.nextDouble();

        System.out.println("Celcius değeri= " + ((fahren-32)/1.8)); */


        //celcius alıp, fahrenheit'a çevirme
        /*
        Scanner konsol=new Scanner(System.in);

        System.out.println("Lütfen havanın kaç celcius olduğunu giriniz?");
        double celcius=konsol.nextDouble();

        System.out.println("Fahrenheit değeri= " + ((celcius*1.8)+32)); */


        //boy ve kilo isteyip bmi index bulma ve if ile sonuç dönme
        /*
        Scanner konsol=new Scanner(System.in);

        System.out.println("Lütfen boyunuzu cm cinsinden giriniz!");
        double boy=konsol.nextDouble();

        System.out.println("Lütfen kilonuzu kg cinsinden giriniz!");
        double kilo=konsol.nextDouble();

        double bmi=Math.round(kilo/(boy*boy));

        System.out.println("BMI indexiniz= " + bmi);

        if(bmi<=18){
            System.out.println("Biraz kilo almalısınız.");
        }

        else if(bmi>=24 && bmi<=30){
            System.out.println("Biraz kilo vermelisiniz");
        }

        else if(bmi>=18 && bmi<=24){
        System.out.println("İdeal kilonuzdasınız");
        }

        else if(bmi>=30){
            System.out.println("Obezsiniz, lütfen bir diyetisyene görünün.");
        }  */


        //kullanıcıdan celcius veya fahrenheit ile sayısal değer isteyip, verilen değerin tam tersini hesaplma
       /*
        Scanner konsol=new Scanner(System.in);

        System.out.println("Lütfen C veya F değerlerinden birini giriniz");
        String deger1=konsol.next();

        System.out.println("Lütfen sayısal bir değer giriniz");
        double deger2=konsol.nextDouble();

        if(deger1.equals("c") || deger1.equals("C")){
            System.out.println(deger2 + " Celcius= " + (Math.ceil((deger2*1.8)+32)) + " Fahrenheit");
        }

        else if(deger1.equals("F") || deger1.equals("f")){
            System.out.println(deger2 + " Fahrenheit= " + (Math.ceil((deger2-32)/1.8)) + " Celcius");
        }

        else{
            System.out.println("Yanlış bir değer girdiniz. Lütfen girdiğiniz değerleri kontrol ediniz!");
        } */


        //verilen 3 bilinmeyen sayıdan hangisinin ortancı olduğunu bulma
         /*
        Scanner konsol=new Scanner(System.in);

        System.out.println("Lütfen 3 tane tamsayı girin!");

        int x=konsol.nextInt();
        int y=konsol.nextInt();
        int z=konsol.nextInt();

        if((y<x && x>z) || (z>x && x>y)){
           System.out.println("Median is " + x);
        }

        else if((x>z && z>y) || (y>z && z>x)){
           System.out.println("Median is " + z);
        }

        else if ((x>y && y>z) || (z>y && y>x)){
            System.out.println("Median is " + y);
         }  */


        //verilen sıcaklık değerini(20C veya 49 F gibi) ayırıp, sonra if yazmak
         /*
        Scanner konsol=new Scanner(System.in);

        System.out.println("Lütfen dönüştürülecek değeri girin!");
        String deger=konsol.next();

        char harf=deger.charAt(deger.length()-1);
        double sayi=Double.parseDouble(
                deger.substring(0,deger.length()-1));*/


        //girilen sayıların -1 girilene kadar toplayıp ortalamalarını bulma
         /*
        Scanner konsol=new Scanner(System.in);

        System.out.println("Lütfen notları giriniz!");

        int not=0;
        int counter = 0;
        double sum=0;

        while(not!=-1){
            not=konsol.nextInt();

            if(not==-1)
                break;

            else{
                sum+=not;
                counter++;
               }
            }
        System.out.println("Girilen notların ortalaması: " + (sum/counter)); */


        //not girilmesini isteyip sonuç dönme
        /*
        Scanner konsol=new Scanner(System.in);

        System.out.println("Lütfen notunuzu giriniz");
        int not=konsol.nextInt();

        if (not>=90 && not<=100){
            System.out.println("Sınav sonucunuz AA");
        }
        else if(not>=80){
            System.out.println("Sınav sonucunuz BB");
        }
        else if(not>=70){
            System.out.println("Sınav sonucunuz CC");
        }
        else{
            System.out.println("Sınav sonucunuz FF");
        } */


        //ekrana aritmetik sayı bastırma
         /*
        Scanner konsol=new Scanner(System.in);

        for(int i=0;i<=17;i++){
            System.out.println(i);
        }  */


        //verilen bir tamsayının kaç basamaklı olduğunu bulma
        /*
        Scanner konsol=new Scanner(System.in);

        System.out.println("Lütfen bir tamsayı giriniz: ");

        int tamsayi=konsol.nextInt();
        int counter=0;

        while(tamsayi>0){
            tamsayi/=10;
            counter++;
        }
        System.out.println("Girilen tamsayi " +counter+ " basamaklıdır.");
          */


        //verilen n tane sayının ortalamasını bulma
        /*
        Scanner konsol=new Scanner(System.in);

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


        //verilen n tane değerle array yaratıp, standart sapmasını bulma
         /*
        Scanner konsol=new Scanner(System.in);

        System.out.println("Kaç adet sayı gireceksiniz?");
        int adet=konsol.nextInt();

        System.out.println("Lütfen " +adet+ " tane sayı giriniz: ");
        int arr[]=new int[adet];
        int toplam=0;

        for(int i=0;i<arr.length;i++){
            arr[i]=konsol.nextInt();
            toplam+=arr[i];
        }

        double ortalama=(toplam/adet);
        double ssapma=0;

        for(int i=0;i<arr.length;i++){
            toplam+=Math.pow(arr[i]-ortalama,2);
        }
        System.out.println("Standart sapma: "+(Math.sqrt(toplam/(adet-1))));
           */


        //dizinde verilen sayıları alt alta yazdırma
        /*
        Scanner konsol=new Scanner(System.in);

        int dizin1[]={10,11,12,13,14,15,16,17};

        for(int i=0;i<dizin1.length;i++){
        System.out.println(dizin1[i]);
        } */


        //arraydeki sayılar max ve min olanını bulma
        /*
        int arr []=new int[]{3, 54, 12, 8, 61};

        int max=Arrays.stream(arr).max().getAsInt();
        int min=Arrays.stream(arr).min().getAsInt();

        for(int i=0;i<arr.length;i++){
            if(arr[i]<min){
                min=arr[i];
            }
            if(arr[i]>max){
                max=arr[i];
            }
        }
        System.out.println("min değer: "+ min+"\nmax değer: "+max); */


        //Arrays.toString ile String'i array'e çevirme
        /*
        String[] name=new String[]{"Kubra", "Ali", "Ayse"};

        System.out.println(Arrays.toString(name)); */

        /*
        String[] takimlar=new String[]{"Beşiktaş", "Athletico Madrid", "Galatasaray", "Juventus", "Fenerbahçe", "Barcelona",};
        System.out.println(Arrays.toString(takimlar));
        */


        //toString ile Array'i String'e çevirme
        /*
        int [] sayilar={1, 2, 3, 4, 5, 6, 7};
        System.out.println(sayilar.toString());
        */


        /*
        String line = "Was it a cat I saw";
        ArrayList<String> lines = new ArrayList<String>( );

        String[] words = line.split(" ");

        System.out.println(Arrays.toString(words));
        */

        //Sınavda çıkmış soru-1
        /*
        Scanner konsol=new Scanner(System.in);

        System.out.println("hava sıcaklığı kaç fahrenheit?");
        double fahrenheit=konsol.nextInt();
        double celcius=(fahrenheit-32)/1.8;

        System.out.println("hava sıcaklığı "+celcius+ "C");
        */


        //Ebob bulma
        /*
        System.out.println("ilk sayıyı giriniz");
        int s1=konsol.nextInt();

        System.out.println("ikinci sayıyı giriniz");
        int s2=konsol.nextInt();

        int max = Integer.max(s1,s2);
        int min = Integer.min(s1,s2);
        int mod;

        while(max%min!=0 && max%min!=1){
            mod=max%min;
            max=min;
            min=mod;
        }

        if(max%min==0)
            System.out.println("Ebob: " + min);

        else
            System.out.println("Ebob: " + "1"); */


        //Asal sayı mıdır?
        /*
        System.out.println("Test edilecek sayıyı giriniz: ");

        int sayi=konsol.nextInt();
        boolean bayrak=false;

        for(int i=2;i<Math.sqrt(sayi);i++) {
            if (sayi % i == 0) {
                System.out.println("sayı asal değildir.");
                bayrak = true;
                break;
            }
        }

        if(!bayrak)
            System.out.println("Sayı asaldır"); */

        //Girilen sayının fibonacci değerin bulmak
        /*
        int prev=1;
        int prevprev=1;
        int fib=0;

        System.out.println("Kaçıncı fibonacci değerini istiyorsunuz?");
        int deger=konsol.nextInt();

        if(deger==0 || deger==1)
            System.out.println(deger +" .fibonacci sayısı:1");

        else{
            for(int i=3;i<=deger;i++){
                fib=prev+prevprev;
                prevprev=prev;
                prev=fib;

            }
        }
        System.out.println(deger+". fibonacci sayısı: "+fib);
        */


        //Fibonacci sayılarını array'in uzunluğunca listelemek
        /*
        int [] fibarray=new int[20];

        fibarray[0]=1;
        fibarray[1]=1;

        for(int i=2;i<fibarray.length;i++){
            fibarray[i]=fibarray[i-1]+fibarray[i-2];
        }
        System.out.println(Arrays.toString(fibarray)); */


        //ekrana verilen sayıda alt alta yıldız bastırma
        /*
        System.out.println("Ekrana kaç yıldız basılsın?");
        int numOfYildiz=konsol.nextInt();
        System.out.println(" ");

        for(int counter=0;counter<numOfYildiz;counter++){
            System.out.println("*");
        }
        System.out.println(" "); */


        //Sola dayalı üçgen
        /*
        System.out.println("kaç yıldız basılsın?");
        int yildiz=konsol.nextInt();

        for(int i=1; i<=yildiz; i++){
            for(int j=1; j<=i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }*/


        //eşkenar üçgen çizimi

        System.out.println("kaç adet satır basılsın?");
        int adet=konsol.nextInt();

        int ortanca=(2*adet)-1;

        for(int i=0;i<adet;i++){
            for(int j=0;j<ortanca;j++){
                if (j == ((ortanca-1)/2-i) || j == ((ortanca-1)/2+i) || (j > ((ortanca-1)/2-i) && j < ((ortanca-1)/2+i))) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println(" ");
        }








   }
}

