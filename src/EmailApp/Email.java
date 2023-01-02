package EmailApp;

import java.util.Scanner;

public class Email {
    private String firstName;
    private String lastName;
    private String password;
    private String department;
    private String email;
    private int mailboxCapacity = 500;
    private int defaultPasswordLength = 8;
    private String alternateEmail;
    private String companySuffix = "pilatus-aircraft.com";



    // Constructor to receive the first name and last name
    public Email(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;




        // call a method asking for the department - return the department
        this.department = setDepartment();
        System.out.println("Department: " + this.department);

        // call a method that returns a random password
        this.password = randomPassword(defaultPasswordLength);
        System.out.println("Your password is: " + this.password);

        // combine elements to generate email
        email = firstName.toLowerCase() + "." + lastName.toLowerCase() + "@" + department + "." + companySuffix;


    }
    // ask for the department - return the department
    private String setDepartment() {
        System.out.print("NEW EMPLOYEE: " + firstName + " " + lastName + "\n" +
                "\nDEPARTMENT CODES\n1 for Sales\n2 for IT\n3 for Accounting\n0 for none \nEnter department code: \n");
        Scanner in = new Scanner(System.in);
        int depChoice = in.nextInt();
        if (depChoice == 1) { return "sales"; }
        else if (depChoice == 2) { return "IT"; }
        else if (depChoice == 3) { return "acct"; }
        else { return ""; }
    }

    // generate a random password

    private String randomPassword(int length) {
        String passwordSet = "ABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789!@#$%";
        char[] password = new char[length];
        for (int i = 0; i < length; i++) {
            int rand = (int) (Math.random() * passwordSet.length());
            password[i] = passwordSet.charAt(rand);
        }
        return new String(password);
    }
    // set the mailbox capacity
    public void setMailboxCapacity(int capacity) {
        this.mailboxCapacity = capacity;
    }

    public int getMailboxCapacity() {
        return mailboxCapacity;
    }
    // set the alternate email
    public void setAlternateEmail(String altEmail) {
        this.alternateEmail = altEmail;
    }

    public String getAlternateEmail() {
        return alternateEmail;
    }
    // change the password
    public void changePassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public String showInfo() {
        return "EMPLOYEE NAME: " + firstName + " " + lastName +
                "\nCOMPANY EMAIL: " + email +
                "\nMAILBOX CAPACITY: " +  mailboxCapacity + "mb";
    }
    public String setFirstName(String firstName) {
        return firstName;
    }
    public String setLastName(String lastName) {
        return lastName;
    }



}
