package FinalStudy;

import java.util.Scanner;

public class FinalStudy_1 {

    public static void main(String[] args) {

        Scanner konsol = new Scanner(System.in);

       /* int a=12;
        int b=-2;
        String c="  Kediler gün içinde çok fazla uyur. ";
        int radius=4;

        System.out.println(a + " üssü " + b + "= " + Math.pow(a,b));
        System.out.println(b + "'nin mutlak değeri " + Math.abs(b));
        System.out.println(Math.round(Math.pow(a,b)));
        System.out.println(Math.ceil(Math.pow(a,b)));
        System.out.println(Math.floor(Math.pow(a,b)));
        System.out.println(Math.PI*Math.pow(radius,2));
        System.out.println(c.substring(10)); //-> substring(10), 10. karakterden sonrakileri getir demek.
        System.out.println(c.substring(11,23)); //->substring(11,23), stringin 11 ile 23. karakterleri arasındaki değerleri getir demek.
        System.out.println(c.substring(c.lastIndexOf("k")+1,c.length()));
        System.out.println(c.substring(c.lastIndexOf("e")+1,c.lastIndexOf(" ")));
        System.out.println(c.trim()); //--> başlangıç ve sondaki boşlukları yok eder.
        */

     /*
       Scanner konsol=new Scanner(System.in);

       System.out.println("Ad Soyad bilginizi giriniz:");
       String var=konsol.nextLine();

       System.out.println("Ad: " + var.substring(0,var.indexOf(" ")));
       System.out.println("Soyad: " + var.substring(var.lastIndexOf(" ")+1,var.length()));
     */

/*     Scanner konsol=new Scanner(System.in);

        System.out.println("Sıcaklık değerini seçiniz: F / C");
        String deger=konsol.nextLine();

        System.out.println("Sıcaklık derecesini giriniz:  ");
        Double derece=konsol.nextDouble();

        if(deger.equals("f") || deger.equals("F")){
            System.out.println("Celcius derecesi: " + ((derece-32)/1.8));
        }
        else if(deger.equals("c") || deger.equals("C")){
            System.out.println("Fahrenhait derecesi: " + ((derece*1.8)+32));
        }
        else {
            System.out.println("Hatalı bir değer girdiniz!");
        }*/


 /*      Scanner konsol=new Scanner(System.in);

        System.out.println("lütfen notları girin: ");

        int counter=0;
        int not=0;
        int sum=0;

        while(not!=-1){
            not=konsol.nextInt();
           if(not==-1)
               break;
           else if(not<-1 || not>-1){
               sum+=not;
               counter++;
           }
        }
        System.out.println("ortalama: "+ (sum/counter));*/


/*
       Scanner konsol=new Scanner(System.in);

        System.out.println("Kilonuzu giriniz(kg): ");
        Double kilo=konsol.nextDouble();

        System.out.println("Boyunuzu giriniz(cm): ");
        Double boy=konsol.nextDouble();

        Double bmi = (kilo/(boy*boy));

        if(bmi<=18){
            System.out.println("BMI: "+ kilo/(boy*boy));
            System.out.println("Kilo almanız gerekli");
        }
        else if(bmi>=24){
            System.out.println("BMI: "+ kilo/(boy*boy));
            System.out.println("Kilo vermeniz gerekli");
        }
        else{
            System.out.println("İdeal kilodasınız");
        }
*/


/*
        System.out.println("3 adet sayı giriniz: ");

        int a=konsol.nextInt();
        int b=konsol.nextInt();
        int c=konsol.nextInt();

        if((c<a && a<b)  || (b<a && a<c)){
            System.out.println("Median: " + a);
        }
        else if((c<b && b<a) || (a<b && b<c)){
            System.out.println("Median: " + b);
        }
        else if((a<c && c<b) || (b<c && c<a)){
            System.out.println("Median: " + c);
        }
*/


/*        System.out.println("Notları giriniz: ");
        int not=0;
        int sum=0;
        int counter=0;

        while(not != 1){
            not=konsol.nextInt();
            if(not!=1){
                sum=not+not;
                counter++;
            }
            else if(not == 1){
                break;
            }
        }
        System.out.println("Girilen notların ortalaması: "+(sum/counter));*/


/*        System.out.println("Lütfen sayı giriniz: ");

        int sayi=konsol.nextInt();
        int counter=0;

        while(sayi!=0){
            sayi/=10;
            counter++;
        }
        System.out.println("sayı " + counter+ "basamaklıdır");*/


/*
        System.out.println("kaç adet yıldız basılsın?");
        int adet=konsol.nextInt();

        for(int counter=0; counter<adet; counter++){
            System.out.println("*");
        }

*/

/*        System.out.println("Birinci kontrol edilecek sayıyı giriniz: ");
        int sayi=konsol.nextInt();
        int mod;

        if(sayi%2!=0){
            System.out.println(sayi + " asal bir sayıdır");
        }
        else{
            System.out.println(sayi + " asal bir sayı değildir");
        }*/


/*
        System.out.println("Notları giriniz: ");

        int not=0;
        int max=Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;

        while(not>=1 || not<=100){
            not=konsol.nextInt();
            if(not<0 || not>100)
                break;
            else if(not>max) {
                max = not;
            }

            else if(not<min) {
                min = not;
            }
        }
        System.out.println("Girilen max değer: "+max+" ,girilen min değer: "+min);

*/
/*

        int prev = 1;
        int prevprev = 1;
        int current = 0;

        System.out.println("Kaçıncı fibonacci sayısını yazıdıralım: ");
        int fib = konsol.nextInt( );

        if (fib == 0 || fib == 1) {
            System.out.println(fib + ". fibonacci sayısı=1");
        } else {
            for (int i = 2; i<=fib; i++) {
                current = prev + prevprev;
                prevprev = prev;
                prev=current;
            }
        }
        System.out.println(fib + ". fibonacci sayısı= " + current);
*/


/*        System.out.println("Polindrom testi için bri sayı giriniz: ");

        int num=konsol.nextInt();

        int num1=num;
        int basamak=0;

        while(num1!=0){
            num1/=10;
            basamak++;
        }
        System.out.println(basamak + " basamaklıdır");

        boolean isPolindrom=true;

        for(int bas=basamak,son=1; bas>son;bas--,son++){
            int ilkbas=(num/(int)Math.pow(10,bas-1))%10;
            int sonbas=(num/(int)Math.pow(10,son-1))%10;

            if(ilkbas!=sonbas){
                System.out.println("Sayı polindrom değildir");
                isPolindrom=false;
                break;
            }

        }
        if(isPolindrom)
            System.out.println("girilen sayı polindromdur");*/




/*        int zar1,zar2;

        System.out.println("kaç round yapılsın" );
        int round=konsol.nextInt();
        int pair=0;

        for(int i=0; i<round;i++){
            zar1=1+(int)(Math.random()*6);
            zar2=1+(int)(Math.random()*6);
            if(zar1==6 && zar2==6)
                pair++;
        }
        System.out.println("yakınsama: "+((double)pair/round));
        System.out.println("gerçek olasılık: " + 1/36.0);*/



 /*      int zar1, zar2=0;

        System.out.println("Kaç round yapılsın");
        int round=konsol.nextInt();
        int pair=0;

        for(int i=0;i<round;i++){
            zar1=1+(int)(Math.random()*6);
            zar2=1+(int)(Math.random()*6);

            if(zar1==6 && zar2==6){
                pair++;
            }
        }
        System.out.println("yakınsama: "+((double)pair/round));
        System.out.println("gerçek olasılık: "+1/26.0);

*/

/*
        System.out.println("Kaç adet not girişi yapılacaktır?");
        int adet=konsol.nextInt();

        System.out.println("Lütfen "+ adet + " adet not girişi yapınız:");


        int array[]=new int[adet];
        int toplam=0;

        for(int i=0;i<array.length;i++){
            array[i]=konsol.nextInt();
            toplam+=array[i];
        }
        System.out.println("Girilen notların ortalaması: "+ (toplam/array.length));

*/

/*
        System.out.println("kaç adet not girilecek?");
        int adet=konsol.nextInt();

        System.out.println("Lütfen "+ adet + " adet notu giriniz: ");
        int array[]=new int[adet];
        int toplam=0;

        for(int i=0;i<array.length;i++){
            array[i]=konsol.nextInt();
            toplam+=array[i];
        }

        double avarage=(toplam/adet);
        double sum=0;

        for(int i=0;i<array.length;i++){
            sum+=Math.pow(array[i]-avarage,2);
        }
        System.out.println("Girilen notların standard sapması: "+ Math.sqrt(sum/adet));
*/


/*
        int [] array={1,2,3,4,5,6};

        for(int i=0;i<array.length;i++){
            System.out.println(array[i]);
        }

*/

  /*      int [] array={1,3,5,7,9};

        System.out.println(Arrays.toString(array));*/


/*
        int [] array={1,2,3,4,5,6,7,8,9};

        int min= Arrays.stream(array).min().getAsInt();
        int max= Arrays.stream(array).max().getAsInt();

        for(int i=0; i<array.length;i++){
            if(array[i]>min){
                array[i]=min;
            }
            else if(array[i]>max){
                array[i]=max;
            }
        }
        System.out.println("arraydeki max değer: " + max + " arraydeki min değer: "+min);

*/

/*
         int[] array=new int[100];

         array[0]=1;
         array[1]=1;

         for(int i=2; i<array.length;i++){
             array[i]=array[i-1]+array[i-2];
         }
        System.out.println(Arrays.toString(array));
*/


/*
         String line = "Was it a cat I saw";
         ArrayList<String> lines=new ArrayList<String>();

         String[] words=line.split(" ");

         System.out.println(Arrays.toString(words));
*/

/*
         int [] array={10, 20, 30, 40, 50, 60};

         int temp;
         int mid=(int)Math.ceil(array.length/2.0);

         System.out.println("Before: " + Arrays.toString(array));

         for(int i=0;i<array.length/2;i++){
             temp=array[i];
             array[i]=array[mid+1];
             array[mid+1]=temp;
         }
        System.out.println("After: " + Arrays.toString(array));*/










    }
}


