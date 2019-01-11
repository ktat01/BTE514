package FinalStudy;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.Scanner;

public class sdvsdvs {

/*
    public static void main(String[] args) throws FileNotFoundException {

        Scanner dosya=new Scanner(new File("/Users/trtatlik/development/Study1/src/ders/ders8file"));

        while(dosya.hasNextLine()){
            String line=dosya.nextLine();
            System.out.println(line);
        }
        dosya.close();
    }
*/



        public static void main(String[] args) throws FileNotFoundException, ClassNotFoundException, SQLException {


            Scanner dosya;
            try {
                dosya = new Scanner(new File("/Users/trtatlik/development/Study1/src/ders/ders8file"));
                PrintWriter dosyaYaz = new PrintWriter("/Users/trtatlik/development/Study1/src/ders/ders8file2");

                while (dosya.hasNextLine( )) {
                    String line = dosya.nextLine( );
                    dosyaYaz.println(line);
                }
                dosya.close( );
                dosyaYaz.close( );


            } catch (FileNotFoundException ex) {
                System.out.println("Dosya Bulunamadı!!!");
            }
        }
}

