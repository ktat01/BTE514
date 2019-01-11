package ders;

import java.util.Scanner;

public class ders4 {

        public static void main(String[] args) {


            Scanner konsol=new Scanner(System.in);


         //verilen notların ortalamasını bulma
        /*
        System.out.println("Lutfen notları giriniz");

        int counter = 0;
        int not=0;
        double sum = 0;

        while(not!=-1){
            not=konsol.nextInt();
            if(not==-1)
                break;
            if(not<-1 || not>100)
            sum+=not;
            counter++;
            }
        System.out.println("Ortalama:" + (sum/counter));
        */


        //verilen sayının kaç basamaklı olduğunu bulma
        /*
        System.out.println("Lutfen bir tamsayı giriniz");

        int sayi = konsol.nextInt();
        int counter = 0;

        while(sayi!=0){
            sayi /= 10;
            counter++;
        }
        System.out.println("Sayi "+counter+" basamaklıdır");
        */


        //ekrana verilen sayı adedinde yıldız bastırma  <<<-------EN SON BURADA KALDIM

        System.out.println("Kaç yıldız basayım: ");
        int numOfStars = konsol.nextInt();

        int counter=0;
        while(counter<numOfStars){
            int counter2=0;
            while(counter2 < (numOfStars-counter)){
                System.out.print(" ");
                counter2++;
            }
            counter2=0;
            while(counter2<2*(counter+1)-1){
                System.out.print("*");
                counter2++;
            }
            System.out.println("");
            counter++;
        }



        //verilen sayı kadar ekrana yıldız bastırma
        /*
        System.out.print("Kaç yıldız basayım? ");
        int numOfStars=konsol.nextInt();
        System.out.println("");


        for(int counter=0; counter<numOfStars; counter++){
            System.out.print("*");
        }
        System.out.println("");
                */


        //verilen sayıların obeb ve okek değerlerini bulma
           /*
            System.out.println("ilk sayiyi giriniz:");
            int sayi1 = konsol.nextInt();

            System.out.println("ikinci sayiyi giriniz:");
            int sayi2 = konsol.nextInt();

            int max = Integer.max(sayi1, sayi2);
            int min = Integer.min(sayi1, sayi2);
            int mod;

            while(max%min!=0 && max%min!=1){
                mod = max%min;
                max=min;
                min=mod;
            }

            if(max%min==0)
                System.out.println("OBEB: "+ min);
            else System.out.println("OBEB: "+ 1); */



        //verilen sayıların asal sayı olup olmadıklarını bulma
        /*
            System.out.println("Test edilecek sayiyi giriniz:");
            int sayi = konsol.nextInt();
            boolean bayrak=false;

            for(int i=2;i<Math.sqrt(sayi);i++){
                if(sayi%i == 0){
                    System.out.println(sayi+ " asal değildir");
                    bayrak=true;
                    break;
                }

            }

            if(!bayrak)
                System.out.println(sayi+ " asaldır");
         */










        }

    }
