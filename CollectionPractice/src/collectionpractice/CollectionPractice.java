package collectionpractice;
import java.util.LinkedList;
public class CollectionPractice 
{
    public static void main(String[] args) 
    {
        LinkedList<Student> sList = new LinkedList<>();
        
        sList.add(new Student("Sarah", 933654));
        sList.add(new Student("Josh", 933655));
        sList.add(new Student("Bob", 945763));
        
        sList.add(0, new Student("Joseph", 873475));
        sList.addFirst(new Student("Alex", 754103));
        sList.addLast(new Student("Chris", 154378));
        sList.remove(3);
        sList.add(3, new Student("Matt", 354794));
        for(Student s: sList)
        {
            s.printInfo();
            System.out.println();
        }
    }
    
}
