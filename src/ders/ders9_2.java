/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 *//*

package bte514.pkg1819;

import java.util.Arrays;

*/
/**
 *
 * @author ovatman
 *//*

public class Course {

    private Student[] students;
    private String name;
    private double credits;
    private int currentStudentPop;
    static public int MAX_NUM_OF_STUDENTS;

    public Course(String name, double credits) {
        currentStudentPop = 0;
        this.students = new Student[MAX_NUM_OF_STUDENTS];
        this.name = name;
        this.credits = credits;
    }

    public boolean enroll(Student s){
        if(currentStudentPop<MAX_NUM_OF_STUDENTS){
            students[currentStudentPop++]=s;
            return true;
        }
        return false;

    }

    @Override
    public String toString() {
        String s = "Course name=" + name + "\n";
        s += "Course credits=" + credits + "\n";
        s += "Students\n-----------------------\n";

        for(int i=0;i<currentStudentPop;i++)
            s+=students[i]+"\n";

        s += "-----------------------\n";
        return s;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }



}
*/
