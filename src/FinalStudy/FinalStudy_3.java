package FinalStudy;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class FinalStudy_3 {

    public static void main(String[] args) throws Exception{

        Scanner dosya;

        try{
            dosya= new Scanner(new File("/Users/trtatlik/development/Study1/src/ders/ders8file"));
            PrintWriter dosyaYaz=new PrintWriter(("/Users/trtatlik/development/Study1/src/ders/ders8file2"));

            while(dosya.hasNextLine()){
                String line=dosya.nextLine();
                dosyaYaz.println(line);
            }
            dosya.close();
            dosyaYaz.close();

        }catch(FileNotFoundException ex)
        {
            System.out.println("dosya bulunamadı");
        }

    }


}