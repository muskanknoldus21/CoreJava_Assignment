package com.coreJava;
import java.util.Scanner;
class Employee{
    private int Empid;
    private String EmpName;
    private String Empdeg;
    Employee(int empid,String empname,String Empdeg)
    {
        this.Empid=empid;
        this.EmpName=empname;
        this.Empdeg=Empdeg;
    }
    public String print()
    {
        return "Emp id : "+ Empid + " Emp Name: "+ EmpName + " Designation: " + Empdeg;
    }
}

public class MaintainListOfEmployees {
    public static void  main(String[] args)
    {
        int n,i,inc;
        n=Integer.parseInt(args[0]);
        i=Integer.parseInt(args[1]);
        inc=Integer.parseInt(args[2]);
        Employee emp[]=new Employee[n];
        int id;
        String nm;
        String deg;
        Scanner s= new Scanner(System.in);
        for(int v=i;v<n;v+=inc)
        {
            id=s.nextInt();
            s.nextLine();
            nm=s.nextLine();
            deg=s.nextLine();
            emp[i]= new Employee(id,nm,deg);
            System.out.println(emp[i].print());
        }
    }

}