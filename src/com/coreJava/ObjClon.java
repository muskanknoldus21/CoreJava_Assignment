package com.coreJava;

import java.util.Scanner;

public class ObjClon implements Cloneable {
    String EmpName;
    int EmpSalary;
    ObjClon(String EmpName , int EmpSalary){
        this.EmpName = EmpName;
        this.EmpSalary = EmpSalary;
    }
    //copy Constructor
    ObjClon(ObjClon Emp){
        Emp.EmpName = EmpName;
        Emp.EmpSalary = EmpSalary;
    }
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    public static void main(String[] args) {
        String EmppName;
        int EmppSal;
        Scanner ic = new Scanner(System.in);
        System.out.println("Enter Employee Name And his/her Salary:");
        try{
            EmppName = ic.nextLine();
            EmppSal = ic.nextInt();
        }
        finally{
            ic.close();
        }
        ObjClon ocl = new ObjClon(EmppName,EmppSal);
        System.out.println(ocl.EmpName + " " + ocl.EmpSalary);

        try {
            ObjClon ocl1 = (ObjClon)ocl.clone();
            System.out.println(ocl1.EmpName + " " + ocl1.EmpSalary);
        }catch (Exception e) {
            System.out.println(ocl.toString());
        }
    }
}