package emailApp;

import java.util.Scanner;

public class ChildEmail {
    private String firstName;
    private String lastName;
    private String Password;
    private String Department;
    private int passwordLength=10;
    private int emailBoxCapacity;
    private String alternateEmail;
    private String anyCom="Jacobes.co.in";
    private String showingInfo;

    //Our Constructor to receive first and the last name;

    public Email(String firstName,String lastName){

        this.firstName=firstName;
        this.lastName=lastName;
        System.out.println("Hello "+firstName+" "+lastName);
          //Call a method for asking the department
        this.Department=setDepartment();
        System.out.println("Department is :- "+ Department);
        this.Password=genRandomPassword(passwordLength);
        System.out.println("Your password is:-"+ Password);
        this.alternateEmail=genEmail();
        System.out.println("Your Email is:-"+ alternateEmail+"\n");
        this.showingInfo=showInfo();
        System.out.println("Your Info:- \n"+showingInfo);
    }
    //Ask for the Department and return it
    private String setDepartment(){
        System.out.println("DEPARTMENT CODES:-\n 1 for Sales\n 2 for Development\n 3 for Accounting\n 0 for None");
        System.out.println("Enter the Department Code:- ");
        Scanner scanner=new Scanner(System.in);
        int deptChoice=scanner.nextInt();
        if(deptChoice==1){
            Department="sales";
            return "sales";
        } else if (deptChoice==2) {
            Department="dev";
            return "dev";
        }
        else if(deptChoice==3){
            Department="acct";
            return "acct";
        }
        else{
            Department=" ";
            return " ";
        }

    }


    //Create method to generate a random password:-
    private String genRandomPassword(int length){
        String randomPassword="ABCDEFGHIJKLMOPQRSTUVWXYZ1234567890@._#$*^";
        char[] password=new char[length];
        for(int i=0;i<length;i++){
            int rand=(int)(Math.random()*randomPassword.length());
            password[i]=randomPassword.charAt(rand);
        }
        return new String(password);
    }

    //Set the mailbox capacity
    private String genEmail(){
        String eMail=firstName.toLowerCase()+lastName.toLowerCase()+Department.toUpperCase()+"@"+anyCom;
        return eMail;
    }
   //Show the Info()
    private String showInfo(){
        return "DISPLAY NAME:- "+firstName+" "+lastName+
        "\nCOMPANY EMAIL:- "+ alternateEmail+
        "\nPASSWORD:- "+ Password+
        "\nDEPARTMENT:- "+ Department;
    }
}
