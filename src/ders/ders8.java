
//Bu derste bir soru çözdüm !!!

package ders;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ders8 {

    public static void main(String[] args) throws FileNotFoundException {

        //burada içinde ne yazdığını bildiğin bir dosyayı, bir string bir integer oku şeklinde kurallı okutabilirsin.


        Scanner dosya = new Scanner(new File("/Users/trtatlik/development/Study1/src/ders/ders8file")); //dosya ismini verip okutabilirsin

        // Scanner dosya = new Scanner(new File("/Users/trtatlik/Desktop/ders8file.txt")); //full path verip okutabilirsin

/*
        while (dosya.hasNext( )) {
            String isim = dosya.next( );
            int not = dosya.nextInt( );
            System.out.println(isim + ":" + not);
        }
    }
}
*/

        //burada içinde ne olduğunu bilmediğin herhangi bir dosyayı line line okutuyorsun.

        while (dosya.hasNextLine( )) {
            String line = dosya.nextLine( );
            System.out.println(line);
        }
        dosya.close( );
    }
}


// bir dosyadan okuduklarını başka bir dosyaya yazdırma metod -1
/*
    public static class FileInputOutputExample {
        public static void main(String[] args) throws Exception {

            InputStream ders8file = new FileInputStream("ders8file.txt");
            OutputStream ders8file2 = new FileOutputStream("ders8file2.txt");
            int c;
            while ((c = ders8file.read()) != -1) {
                System.out.print((char) c);
                ders8file2.write(c);
            }
            ders8file.close();
            ders8file2.close();

        }
 *//*


// bir dosyadan okuduklarını başka bir dosyaya yazdırma metod -2
      //  ........

            public static void main(String[] args) throws Exception {
                try {
                    Scanner dosya = new Scanner(new File("/Users/trtatlik/development/Study1/src/ders/ders8file"));
                    while (dosya.hasNext( )) {
                        String isim = dosya.next( );
                        double not = dosya.nextDouble( );
                        int count = 0;
                        System.out.println("ortalama: " + (not/count));
                    }
                    dosya.close( );
                } catch (FileNotFoundException ex) {
                    System.out.println("no file");
                }
            }
 }
*/
