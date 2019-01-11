/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*

package ders;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


*/
/**
 *
 * @author ovatman
 *//*

public class BTE5141819 {
    */
/**
     * @param args the command line arguments
     *//*

    public static void main(String[] args) throws FileNotFoundException {
*/
/*
        final int NUM_OF_STUDENTS = 5;

        Student aStudent = new Student(2434,"Tolga","Ovatman");

        System.out.println(aStudent.getName());

        Student[] students = new Student[NUM_OF_STUDENTS];

        getStudentInfo(students,"ogrenciler.txt");


        //Student selected = getStudentWithName("Duygu", students);

        //if(selected!=null)
        //    System.out.println(selected);


        Course.MAX_NUM_OF_STUDENTS=10;

        Course blg514 = new Course("Programming", 3.5);
        for(Student s: students)
            blg514.enroll(s);

        System.out.println(blg514);

        Course blg311 = new Course("Random",2.5);

        Student s;
        do{
            s = new Student(1000000+(int)(Math.random()*9000000),getRandomText(10),getRandomText(10));
        }while(blg311.enroll(s));

        System.out.println(blg311);
       *//*


        final int AYSAYISI = 12;
        String[] aylar = new String[AYSAYISI];
        double[] degerler = new double[AYSAYISI];
        String[] siraliAylar = {"Ocak","Subat","Mart","Nisan",
                "Mayıs","Haziran","Temmuz","Agustos","Eylul",
                "Ekim","Kasım","Aralık"};

        Scanner oku = new Scanner(new File("aylar.txt"));

        int counter = 0;
        while(oku.hasNextLine()){
            String[] line = oku.nextLine().split(" ");
            aylar[counter]=line[0];
            degerler[counter++] = Double.parseDouble(line[1]);
        }

        for(int i=0;i<AYSAYISI;i++){
            int indice = getMonthFrom(siraliAylar[i],aylar);

            System.out.println(aylar[indice]+" "+degerler[indice]);
        }


        int[] arr={5,2,3,4,6,9,8,0,1,7};
        boolean[] flags= new boolean[10];

        for(int i=0;i<arr.length;i++)
            flags[arr[i]]=true;

        boolean hit=false;
        for(int i=0;i<flags.length;i++){
            if(!flags[i]){
                hit=true;
                System.out.println("NOT SUDOKU");
            }
        }

        if(!hit)
            System.out.println("SUDOKU");

    }

    static int getMonthFrom(String ayismi, String[] aylar){

        int counter=0;

        for(String s:aylar){
            if(s.equals(ayismi))
                return counter;
            counter++;
        }
        return -1;
    }

    static String getRandomText(int numOfChar){

        String s="";

        for(int i=0;i<numOfChar;i++)
            s += (char) ( 65 + (int)(57*Math.random()) );

        return s;
    }
    static void getStudentInfo(Student[] students, String fname){

        try {
            Scanner oku = new Scanner(new File(fname));
            int count=0;
            while(oku.hasNextLine()){
                students[count++] = new Student(oku.nextLine().split(" "));
            }
            oku.close();



        } catch (FileNotFoundException ex) {
            Logger.getLogger(BTE5141819.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    static Student getStudentWithName(String name, Student[] students) {

        for(Student aStudent : students){
            if(name.equals(aStudent.getName())){
                return aStudent;
            }
        }

        return null;

    }
}












*/
