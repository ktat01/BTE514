/*
package ders;

import java.io.FileNotFoundException;
import java.sql.SQLException;
import java.util.Scanner;

public class ders8Hoca {


*/
/*import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;*//*



        public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, SQLException {
        */
/*
        Scanner dosya;
        try {
            dosya = new Scanner(new File(                                  ));
            PrintWriter dosyaYaz = new PrintWriter("notlarYaz.txt");

            while(dosya.hasNextLine()){
                String line = dosya.nextLine();
                dosyaYaz.println(line);
            }
            dosya.close();
            dosyaYaz.close();


        } catch (FileNotFoundException ex) {
            System.out.println("Dosya Bulunamadı!!!");
        }

        *//*

        */
/*
                FileWriter dosyaYaz = new FileWriter("notlarYaz.txt",true);
        dosyaYaz.append("Ekleme");
        dosyaYaz.close();*//*


        */
/*
        while(dosya.hasNext()){
            String isim = dosya.next();
            int not = dosya.nextInt();
            System.out.println(isim+":"+not);
        }
                *//*


        */
/*
        try{
            System.out.println(bol(5,0));
        }
        catch(ArithmeticException ex){
            System.out.println(ex.getMessage());

        }
                *//*

            Scanner oku =  new Scanner(new File("aylar.txt"));
            double top=0;
            int count=0;
            while(oku.hasNext()){
                String ay = oku.next();
                double deger = oku.nextDouble();
                top+=deger;
                count++;
            }
            System.out.println("Ortalama= "+ (top/count));


        */
/*
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/MyDB","ovatman","password");

        Statement stmt=conn.createStatement();
        ResultSet rs=stmt.executeQuery("SELECT * from");
        rs.next();
        *//*

        }


        static double bol(int sayi, int bolen){

            double bolum=0;
            try{
                bolum=sayi/bolen;
            }
            catch(ArithmeticException ex){
                System.out.println("0a bolme hatasi");
                bolum = Double.NaN;
            }

            return bolum;
        }
    }






*/
