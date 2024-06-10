/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package emailApp;

import java.util.Scanner;

/**
 *
 * @author praje
 */
public class Email {

    private String firstName;
    private String lastName;
    private String Address;
    private String Department;
    private String mainBoxCapacity;
    private String alternameEmail;
    private String password;
    private int defaultPasswordLength = 10;
    private String email;
    private String copanySufix = "nakocompany.com";

    //constructor to receive the first name and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
        System.out.println("EMPLOYEE NAME: " + this.firstName + " " + this.lastName);

        //call a method asking for the department - return the department
        this.Department = setDepartment();
        System.out.println("EMPLOYEE DEPARTMENT = " + this.Department);

        //combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + Department +"."+ copanySufix;
        System.out.println("EMPLOYEE E-mail is: " + email);

        //call a method that return  random password
        this.password = randomPassword(8);
        System.out.println("EMPLOYEES password is: " + this.password);

    }

    //ask for the department
    private String setDepartment() {
        System.out.print("DEPARTMENT CODES\n1 for Sales\n2 for Development\n3 for Accounting\n0 for none\nEnter department code: ");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) {
            return "sales";
        } else if (depChoice == 2) {
            return "develpoment";
        } else if (depChoice == 3) {
            return "accounting";
        } else {
            return "";
        }

    }

    //generate a random password
    private String randomPassword(int length) {
        String passwordSet = "abcdefghijklmnopqrstuvwxyz0987654321@#$%";
        var password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }

}
