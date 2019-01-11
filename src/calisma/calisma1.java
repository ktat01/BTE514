package calisma;

import java.util.Scanner;

public class calisma1 {

    public static void main(String args[]) {

        Scanner konsol = new Scanner(System.in);

        //1-28 arası rakamları 5'i atlayarak saydırma
       /*
        int i = 0;
        while (true) {
            i++;
            if (i ==5) {
                continue;
            }
            System.out.println(i);
            if (i == 28) {
                break;
            }
        */


        //1-10 arası saydırma
       /*
        int j = 0;
           while(j < 10){
              j++;
       System.out.println(j);
        }
        */


        //7-11 arası rakam saydırma
       /*
        int k = 7;
        do {
          k++;
          System.out.println(k);
        }
        while(k < 11);
       */


        //içi dolu kare oluşturma
       /*
        for(int i=1; i<=6 ; i++){
          for(int j=1; j<=6; j++){
             System.out.print("*");
             }
             System.out.println(" ");
        }
        */


        //içi boş kare
       /*
       for(int i=1; i<=4; i++){
         for(int j=1; j<=4; j++){
            if(i==1 || i==4 || j==1 || j==4){
               System.out.print("*");
               }
            else
               System.out.print(" ");
           }
            System.out.println( );
       }
       */


        //sıralı yıldız yazdırma

   /*
       for(int i=1; i<=4; i++){
          for(int j=1; j<=i; j++){
             System.out.print("*");
           }
       System.out.println(" ");
       }*/



        //içi boş piramit
       /*
        int n = 6;

        printPattern(n);
    }
    static void printPattern(int n)
    {
        int i, j, k = 0;
        for (i = 1; i <= n; i++) // row=6
        {
            // Print spaces
            for (j = i; j < n; j++) {
                System.out.print(" ");
            }
            // Print #
            while (k != (2 * i - 1)) {
                if (k == 0 || k == 2 * i - 2)
                    System.out.print("*");
                else
                    System.out.print(" ");
                k++;
                ;
            }
            k = 0;
            // print next row
            System.out.println();
        }
        // print last row
        for (i = 0; i < 2 * n - 1; i++) {
            System.out.print("*");
        }
        */


        //sola dayalı ters piramit
       /*
       for(int i=1; i<=5; i++){
         for(int j= i; j<=5; j++){
             System.out.print("*");
           }
         System.out.println(" ");
       }
       */


        // sağa dayalı normal piramit
        /*
     for(int i=0; i<5; i++){
        for(int s=i; s<4; s++){
           System.out.print(" ");
         }
        for(int j=0; j<=i; j++){
           System.out.print("*");
         }
        System.out.println(" ");
     }
     */


        //sağa dayalı ters piramit
       /*
     for(int i=0; i<5; i++){
        for(int s=0; s<i; s++){
           System.out.print(" ");
         }
        for (int j=i; j<5; j++){
           System.out.print("*");
         }
        System.out.println(" ");
     }
      */


        //diomand piramait pattern
     /*
     for(int i=0; i < 5; i++){
        for (int s=i; s<4; s++){
           System.out.print(" ");
         }
         for(int j=0; j<=i; j++){
             System.out.print("*");
         }
         for(int j=1; j<=i; j++){
             System.out.print("*");
         }
         System.out.println(" ");
      }

      for(int i=0; i<4; i++){
          for (int s=0; s<=i; s++){
              System.out.print(" ");
          }
          for(int j=i; j<4; j++){
              System.out.print("*");
          }
          for(int j=i; j<3; j++){
              System.out.print("*");
          }
          System.out.println(" ");
      } */



        //verilen sayılardan bazılarını atlayarak ortalama bulma
     /*
        System.out.println("Sayıları giriniz: ");

        int sayi=0;
        double sum =0;
        int counter=0;

        while(sayi!=10){
            sayi=konsol.nextInt();
            if(sayi ==10)
                    break;
            if(sayi<10 || sayi>10)
                    continue;

            sum+=sayi;
            counter++;
        }
        System.out.println("Sayıların ortalaması: " + (sum/counter));
     */


        //kullanıcıdan sayı isteyip, ortalamalarını bulma
        /*
     int not1, not2, not3, not4;
     double avarage;

     Scanner input = new Scanner(System.in);

        System.out.println("Enter your final notes from last semeter: " );
        not1 = input.nextInt();
        not2 = input.nextInt();
        not3 = input.nextInt();
        not4 = input.nextInt();

        input.close();

        avarage = (double) (not1 + not2 + not3 + not4)/4;

        System.out.println("Your last semeter note avarage is: " + avarage);
       */


        // kullanıcıdan sayı isteyip, toplamını bulma
       /*
        int n;
        int sum=0;
        int i=0;

        Scanner sc=new Scanner(System.in);

        System.out.println("Enter how many numbers you want to sum");
        n=sc.nextInt();

        int a[]=new int[n];
        System.out.println("Enter the " +n+" numbers");

        while(i<n)
        {
            System.out.println("Enter  number  " + (i+1) + ":");
            a[i]=sc.nextInt();
            sum+=a[i];
            i++;
        }
        System.out.println("sum is =" + sum);
        */


        //verilen sayıda yıldızdan piramit oluşturma
     /*
        System.out.println("kaç yıldız kullanılsın?");
        int yildiz;
        yildiz = konsol.nextInt();

        for(int i=0; i<yildiz; i++){
            for(int s=i; s<(yildiz-1); s++){
                System.out.print(" ");
            }
            for(int j=0; j<=i; j++){
                System.out.print("*");
            }
            System.out.println(" ");
        }

*/

        //verilen sayının asal sayı olup olmadığını bulma
/*
        System.out.println("Lütfen sayıyı giriniz: ");
        int num = konsol.nextInt( );
        boolean flag = false;

        for (int i = 2; i <= num / 2; i++) {
            if (num % i == 0) {
                flag = true;
                System.out.println(num + " asal sayı değildir.");
                break;
            }

        else if (!flag){
                System.out.println(num + " asal sayıdır");
            }*/


        }
    }