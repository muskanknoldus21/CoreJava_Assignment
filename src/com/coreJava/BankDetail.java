package com.coreJava;

class Bank
{
    String location;
    float returnrate;
    Bank(String location,float returnrate)
    {
        this.location = location;
        this.returnrate= returnrate;
    }
    public void getDetails()
    {
        System.out.println("\nBank Location: "+ location +"\nROI: "+ returnrate);
    }
}

class SBI extends Bank
{
    String branchId;
    public SBI(String city, float ror, String branchId)
    {
        super(city, ror);
        this.branchId = branchId;


    }

    public void getDetails()
    {
        super.getDetails();
        System.out.println("Branch Id: "+ branchId);
    }
}
class BOI extends Bank
{
    String branchId;
    public BOI(String city,float ror,String branchId)
    {
        super(city, ror);
        this.branchId=branchId;
    }

    public void getDetails()
    {
        super.getDetails();
        System.out.println("BranchId: "+ branchId);
    }
}


class ICICI extends Bank
{
    String branchId;
    public ICICI(String city, float ror, String branchId)
    {
        super(city, ror);
        this.branchId=branchId;
    }

    public void getDetails()
    {
        super.getDetails();
        System.out.println("BranchId: "+ branchId);
    }
}

public class BankDetail {
    public static void main(String[] args)
    {
        Bank bank =new Bank("Delhi",1.1f);
        SBI sbi= new SBI("Delhi",1.2f,"sbiN21");
        BOI boi= new BOI("Greater Noida",1.3f,"boiN21");
        ICICI icici=new ICICI("Noida",1.4f,"iciciN21");

        bank.getDetails();
        sbi.getDetails();
        boi.getDetails();
        icici.getDetails();
    }
}
