package com.coreJava;
import java.util.*;

public class ListOfEmployees {

    private String EmpID;
    private String EmpName;
    private String EmpDesignation;
    public ListOfEmployees (String Id, String Name, String Designation ) {
        this.EmpID = Id;
        this.EmpName = Name;
        this.EmpDesignation = Designation;
    }
    public String getId () {
        return EmpID;
    }
    public void setId (String id){
        EmpID= id;
    }
    public String getName () {
        return EmpName;
    }
    public void setName (String name){
        EmpName = name;
    }
    public String getDesignation () {
        return EmpDesignation;
    }
    public void setDesignation (String designation){
        EmpDesignation = designation;
    }

    public String toString()
    {
        return this.EmpID+"\t"+this.EmpName+"\t\t"+this.EmpDesignation+"\t\t\t";
    }
    public static  void main(String[] args)
    {
        try {

            Map< String, List<ListOfEmployees>> m=new HashMap< String, List<ListOfEmployees> >();
            List<ListOfEmployees> ListForFinance=new ArrayList<ListOfEmployees>();
            Scanner sc=new Scanner(System.in);
            String Id;
            String Name;
            String Designation;
            while(true)
            {
                System.out.print("\nThe Choices:\n1>add\n2>modification\n3>remove\n4>display\n\n");
                System.out.println("Enter the choice: ");
                System.out.println("To quit type -1");
                int num=sc.nextInt();
                if(num == -1)
                {
                    break;
                }
                switch(num)
                {
                    case 1:
                    {
                        System.out.print("\nDesignation: ");
                        Designation=sc.next();
                        System.out.print("\nId: ");
                        Id=sc.next();
                        System.out.print("\nName: ");
                        Name=sc.next();

                        ListOfEmployees employee1 = new ListOfEmployees(Id,Name,Designation);
                        ListForFinance.add(employee1);
                        m.put(Designation, ListForFinance);
                        break;
                    }
                    case 2:
                    {
                        System.out.println("Type Designation to be modified");
                        Designation=sc.next();
                        System.out.println("Modification values");
                        System.out.print("\nId: ");
                        Id=sc.next();
                        System.out.print("\nName: ");
                        Name=sc.next();

                        Set<String> s=m.keySet();
                        Iterator<String> i=s.iterator();

                        ListOfEmployees employee1=new ListOfEmployees(Id,Name, Designation);
                        ListForFinance.add(employee1);
                        m.put(Designation, ListForFinance);

                        while(i.hasNext())
                        {
                            System.out.println(i.next());
                        }
                        break;
                    }
                    case 3:
                    {
                        System.out.println("ID"+"\t"+"NAME"+"\t\t"+"DESIGNATION");
                        Set<String> s=m.keySet();
                        for (String dept : s) {
                            List<ListOfEmployees> employees = m.get(dept);
                            for (ListOfEmployees employee : employees) {
                                System.out.print("\n" + employee + "\n\n");
                            }
                        }
                        break;
                    }

                }
            }
        }
        catch(Exception e) {
            System.out.println("Warning: \n" + "Wrong key Pressed,please enter the correct key");
        }
        System.out.println("Try again (:");
    }
}
