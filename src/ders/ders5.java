package ders;

import java.util.Scanner;

public class ders5 {

    public static void main(String[] args) {

        Scanner konsol = new Scanner(System.in);

        //girilen çoklu sayılardan max ve min olanı bulma
        /*
        System.out.println("Lütfen notları giriniz: ");

        int not = 0;
        int max= Integer.MIN_VALUE;
        int min=Integer.MAX_VALUE;


        while (not>=1 || not<=100){
            not=konsol.nextInt();
            if (not<0 || not>100)
                break;
            if (not>max)
                max=not;
            if (not<min)
                min=not;
        }
        System.out.println("Girilen en büyük not" +  max +  "girilen en küçük değer" +  min);
     */


        //kullanıcının verdiği sıradaki fib sayısını bulma ********
        /*
        int prevprev=1;
        int prev=1;
        int fib=0;

        System.out.println("Kaçıncı fibonacci sayısı olsun?");
        int index=konsol.nextInt();

        if(index==0 || index==1)
            System.out.println(index+". sayı = 1");

        else{
            for(int i=2; i<=index; i++){
                fib=prev +prevprev;
                prevprev=prev;
                prev=fib;
            }
        }
        System.out.println(index+". sayı= " + fib);
        */


        //sayıların polindrom olup olmadığını bulmak ********

/*
             System.out.println("Palindrom testi icin sayi girin:");

        int num = konsol.nextInt();

        int numSave = num;
        int basamak=0;

        while(numSave!=0){
            numSave/=10;
            basamak++;
        }
        System.out.println(basamak+" basamaklı");

        boolean isPalindrome=true;

        for(int bas=basamak,son=1;bas>son;bas--,son++){
            int ilkBas = (num/(int)Math.pow(10,bas-1)) % 10;
            int sonBas = (num/(int)Math.pow(10,son-1)) % 10;

            if(ilkBas!=sonBas){
                System.out.println("Palindrom degil!!!");
                isPalindrome = false;
                break;
            }
        }
        if(isPalindrome)
            System.out.println("Palindrom!!!");
*/



      //bilgisyarın tuttuğu sayıyı bulma
        /*
        int sayi = (int) ( Math.random( ) * 100 );
        int tahmin=0;
        int count=0;

        System.out.println("Attığım sayı:" + sayi);

        System.out.println("Tahmin edin hangi sayıyı tuttum: ");
        tahmin = konsol.nextInt( );
        while (tahmin != sayi) ;
        {
            if (tahmin < sayi)
            System.out.println("sayıyı arttırın!");

            else if (tahmin > sayi)
            System.out.println("sayıyı azaltın");

            count++;

            if (tahmin == sayi) {
                break;
            }
            System.out.println("tebrikler bildiniz!!!");

        }
        */


        int zar1,zar2;
        System.out.println("Kaç deneme?");
        int round = konsol.nextInt();
        int pair=0;

        for(int i=0;i<round;i++){
            zar1 = 1+(int)(Math.random()*6);
            zar2 = 1+(int)(Math.random()*6);
            if(zar1==6 && zar2==6)
                pair++;
        }

        System.out.println("Yakınsama: "+((double)pair/round));
        System.out.println("Gerçek olasılık: "+1/36.0);
    }
}

