import java.util.Scanner;

/**
 * This program will prompt the user for some information then make an email and password for them
 * then the info can be checked or changed as well as checking the mail capacity of the email account
 */
public class Main
{

    /**
     * Constructor for objects of class Main
     */
    public Main()
    {
        //prompt the user for their info then create the email
        Scanner scnr = new Scanner(System.in);
        System.out.println("This program is going to create a new email and password for you, a new intern at a company.");
        System.out.println("Enter your first then last name:");
        String first = scnr.nextLine();
        String last = scnr.nextLine();
        System.out.println("Enter your department:");
        String depar = scnr.nextLine();
        Email test = new Email(first,last,depar);
        
        //main loop with functions
        Boolean running = true;
        while(running){
            System.out.println("\nWhat do you want to do?");
            System.out.println("1. Check name");
            System.out.println("2. Check email");
            System.out.println("3. Check department");
            System.out.println("4. Check password");
            System.out.println("5. Change name");
            System.out.println("6. Change email");
            System.out.println("7. Change department");
            System.out.println("8. Change password");
            System.out.println("9. Check mail");
            System.out.println("10. Clear mail");
            System.out.println("11. Quit");
            int choice = scnr.nextInt();
            
            switch(choice){
                case 1:
                    System.out.println("Your name is " + test.getName());
                    break;
                case 2:
                    System.out.println("Your email is " + test.getEmail());
                    break;
                case 3:
                    System.out.println("Your department is " + test.getDepartment());
                    break;
                case 4:
                    System.out.println("Your password is " + test.getPassword());
                    break;
                case 5:
                    System.out.println("Your name is currently " + test.getName());
                    System.out.println("Enter your new name:");
                    String newName = scnr.nextLine();
                    test.changeName(newName);
                    System.out.println("Your new name is " + test.getName());
                    break;
                case 6:
                    System.out.println("Your email is currently " + test.getEmail());
                    System.out.println("Enter your new email:");
                    String newEmail = scnr.nextLine();
                    test.changeEmail(newEmail);
                    System.out.println("Your new email is " + test.getEmail());
                    break;
                case 7:
                    System.out.println("Your department is currently " + test.getDepartment());
                    System.out.println("Enter your new department:");
                    String department = scnr.nextLine();
                    test.changeDepartment(department);
                    System.out.println("Your new department is " + test.getDepartment());
                    break;
                case 8:
                    System.out.println("Your password is currently " + test.getPassword());
                    System.out.println("Enter your new password:");
                    String newPass = scnr.nextLine();
                    test.changePassword(newPass);
                    System.out.println("Your new password is " + test.getPassword());
                    break;
                case 9:
                    System.out.println("You have " + test.getCapacity() + " emails");
                    break;
                case 10:
                    System.out.println("You currently have " + test.getCapacity() + "emails");
                    System.out.println("You now have 0");
                    test.clearCapacity();
                    break;
                case 11:
                    running = false;
                    break;
            }
            
        }

    }

}
