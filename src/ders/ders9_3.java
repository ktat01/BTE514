/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*

package bte514.pkg1819;

*/
/**
 *
 * @author ovatman
 *//*

public class Student {

    private int number;
    private String name;
    private String surname;

    public Student(int number, String name, String surname) {
        setNumber(number);
        this.name = name;
        this.surname = surname;
    }

    Student(String[] line){
        setNumber(line[0]);
        name = line[1];
        surname = line[2];
    }

    public void setNumber(String num){
        if(num.length()>6 && num.length()<8)
            setNumber(Integer.parseInt(num));
        else number = 0;
    }


    public void setNumber(int num){
        if(num>=1000000 && num<10000000)
            number = num;
        else number = 0;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    public void printStudentInfo(){
        System.out.println(number+" "+ name + " " + surname);
    }

    @Override
    public String toString() {
        return "Student{" + "number=" + number + ", name=" + name + ", surname=" + surname + '}';
    }


}
*/
