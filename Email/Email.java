import java.util.Random;

/**
 * Write a description of class Email here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Email
{
    private String Name;
    private String Email;
    private String Department;
    private String Password;
    private int capacity;
    
    
    /**
     * creates email / password and stores information
     */
    public Email(String first,String last,String department)
    {
        Email = first + "." + last + "@" + department + ".Amazon.com";
        Name = first + " " + last;
        Department = department;
        String[] string1 = new String[]{"Password","1234","Amazon","Example"};
        String[] string2 = new String[]{"!","?","#","%"};
        Password = string1[(int)(Math.random()*3)] + (int)(Math.random()*100) + string2[(int)(Math.random()*3)];
        capacity = (int)(Math.random() * 1000);
    }

    //get functions to return variables
    
    public String getName()
    {
        return Name;
    }
    
    public String getEmail()
    {
        return Email;
    }
    
    public String getDepartment()
    {
        return Department;
    }
    
    public String getPassword()
    {
        return Password;
    }
    
    public int getCapacity(){
        return capacity;
    }

    //functions to change variables
    
    public void changeName(String n)
    {
        Name = n;
    }
    
    public void changeEmail(String n)
    {
        Email = n;
    }
    
    public void changeDepartment(String n)
    {
        Department = n;
    }
    
    public void changePassword(String n)
    {
        Password = n;
    }
    
    public void clearCapacity(){
         capacity = 0;   
    }
    }

