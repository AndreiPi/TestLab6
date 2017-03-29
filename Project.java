package com.api.java2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by piand on 3/6/2017.
 * retine detalii despre proiect
 */
public class Project {
    private String name;
    private int capacity;
    private List<Student> prefs;
    private List<Student> studentAssigned;

    /**
     * constructor de copiere
     */
    public Project(Project prj)
    {

        this.name=prj.getName();
        this.capacity=prj.getCapacity();
        List<Student> newprefs=new ArrayList<Student>(prj.getPrefs());
        this.prefs=newprefs;
        List<Student> newStudentAssigned=new ArrayList<Student>(prj.getStudentAssigned());
        this.studentAssigned=newStudentAssigned;
    }

    /**
     *contructor pe baza numelui si a capacitatii
     */
    public Project(String name, int capacity )
    {
        this.name=name;
        this.capacity=capacity;
        if(prefs!=null) {
            List<Student> newprefs = new ArrayList<Student>(prefs);
        }
        prefs = new ArrayList<Student>();
        studentAssigned=new ArrayList<Student>();
    }

    public int getCapacity()
    {
        return capacity;
    }
    public List<Student> getStudentAssigned()
    {
        return studentAssigned;
    }

    public void setStudentAssigned(Student studentAssigned)
    {
        this.studentAssigned.add(studentAssigned);
        capacity--;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void removeStudent(Student std)
    {
        studentAssigned.remove(std);
    }

    public List<Student> getPrefs()
    {
        return prefs;
    }
    public void setPrefs(List<Student> newprefs)
    {
        if(prefs==null) System.out.printf("dada");
        else
        prefs.addAll(newprefs);
    }

    public List<Student> getProjectAssigned() { return studentAssigned;}

    /**
     *metoda prin care se verifica daca un student e mai preferat decat altul
     */
    private boolean isPrefered(String studentName1, String studentName2)
    {
        int prefPoz1,prefPoz2;
        prefPoz1=0;
        prefPoz2=0;
        for(Student std: prefs)
        {
            if(std.getName().equals(studentName1))
            {
                break;
            }
            prefPoz1++;
        }

        for(Student std: prefs)
        {
            if(std.getName().equals(studentName2))
            {
                break;
            }
            prefPoz2++;
        }
        return prefPoz2<prefPoz1;
    }

    /**
     * metoda prin care se ofera studentul mai preferat ,daca exista
     */
    public Student changeStudent(String freeStudent)
    {
       // List<Student> studentAssigned=this.getStudentAssigned();
        for(Student std:studentAssigned)
            if(this.isPrefered(std.getName(),freeStudent))
                return std;
        return null;
    }

    @Override public String toString()
    {
        String returned="Proiectul "+name +" are capacitatea " +capacity +" si preferintele: ";
        if(prefs!=null)
        {
            for(Student std:prefs)
                returned+=std.getName() + ' ';
        }
        return returned;

    }

    @Override public boolean equals(Object obj)
    {
        if(obj==null) return false;
        if(!(obj instanceof Project)) return false;
        Project std=(Project) obj;
        return (std.name.equals(this.name) && std.capacity==this.capacity);
    }


}
