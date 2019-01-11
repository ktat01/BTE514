
// FİNAL SINAVINDA YAZDIĞIN HER KODUN YANINA ÇİFT SLASHLA NE YAPMAK İSTEDİĞİNİ YAZ. HOCA ANLAMAYIP, SORUYA SIFIR VERİYOR!!!!!!!!
// FİNAL SINAVINDA HANGİ KODU HANGİ SIRADA YAZACAĞINI ÇOK İYİ SEÇ. BİR KODU BİR SATIR ÜSTE YAZSAN HOCA YARIM PUAN KIRIYOR!!!!!!!
// BU DERSTE 1 SORU BİLDİM. -- 3 PUAN

package ders;

import java.util.Scanner;

public class ders7 {
    public static void main(String[] args){

        Scanner konsol=new Scanner(System.in);

       // System.out.println(tempeatureConverter(30,'C',  'K' ) ); //temperature fonksiyonunu çağırıyorsun bu adımda.

    } //yazılan her yeni fonksiyon mutlaka main fonksiyonu dışına yazılmalı. çünkü main de bir fonksiyon.

    /*
    static double tempeatureConverter(double temperature, char type, char to){ //user fonksiyonda verilen değerlerin sırasına uygun şekilde değerler vermeli. önce temperature sonra type girmeli. yoksa hata döner.
        double val=0;

        if(type=='C' && to=='F'){
           val=(temperature*1.8)+32;
        }
        else if(type=='C' && to=='K' ){  //-->çoklu iflerde sadece ilki if olur, ondan sonrakiler else if olur. en sonuna hata dönecekse else dersin.
            val=(temperature+273.15);
        }
        else if(type=='F' && to=='C'){
            val=(temperature-32)/1.8;
        }
        else if(type=='F' && to=='K'){
            val=(temperature+ 459.67)* 5/9;
        }
        else if(type=='K' && to=='C') {
            val = ( temperature - 273.15 );
        }
        else if(type=='K' && to=='F') {
            val=(temperature- 459.67)* 9/5;
        }
        else{
            System.out.println("Hatalı giriş");
        }
        retuewrn val;
    }
    */

    //void javada fonskiyondan geriye bir değer döndürmediğinde kullanılır.

   /* static void printArray(int[] arr){
        if(arr.length<0)
            return; //return'ü bu şekilde tek başına sadece fonksiyondan geriye bişey döndürmeyeceğin zaman böyle tek başına kullanırsın. bi sonuç dönecekse returnden sonra onu eklersin.
     System.out.println("[");
     for(inti=0;i<arr.length-1;i++)
         System.out.print(arr[i]+" , ");

    }*/




   static int countChar(String word, char a){ //word sana verilen string, c ise o string içinde arayacağın değer
       int count=0;
       for(int i=0;i<word.length();i++){
           if((word.charAt(i)==a)){
               count++;
           } //--> bu satırdan sonra if döngüsünden çıkarsın bir alt satırdaki for döngüsüne dönersin. Ta ki sayılacak karakter kalmayana kadar.
       } //--> burada hala for döngüsündesin. sayılacak karakter kalmadığında for döngüsünden de çıkarsın.
       return count; //--> return ile count kaç ise onu dönersin. ama bunu if ve for döngülerinden çıktıktan sonra yaparsın.o yüzden if ve for'un curly parantezinin dışına return yazıldı!
   }

    //primitive tipler değişmeden çıkar fonksiyondan, arrayler ise fonksiyondan değişerek çıkar.(son soru)







}
