package collectionpractice;

/**
 *
 * @author bdcal
 */
public class Student 
{
    private String name;
    private int LSU_ID;
    
    public Student(String Name, int ID)
    {
        name = Name;
        LSU_ID = ID;
    }
    
    public void printInfo()
    {
        System.out.println("Student Name: " + name);
        System.out.println("LSU ID: " + LSU_ID);
    }
}
