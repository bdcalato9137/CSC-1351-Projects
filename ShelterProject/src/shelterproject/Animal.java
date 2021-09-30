package shelterproject;

/**
 *Student Name: Brennen Calato
 */
public class Animal implements Comparable<Animal>
{
    private String name;
    
    private String kind;
    
    private double age;
    //Creates an animal object with the attributes of name, kind, and age
    public Animal(String animalName, String animalKind, double animalAge)
    {
        name = animalName;
        kind = animalKind;
        age = animalAge;
    }
    /*Sorts animal in order based on the kind of animal. If kind is the same it 
    is put in order of descending age. If the age is the same they are compared
    based on name. */
    @Override
    public int compareTo(Animal other)
    {
        if(kind.compareTo(other.kind)!=0)
            return kind.compareTo(other.kind);
        else if(Double.compare(age, other.age) != 0)
            return -1*Double.compare(age, other.age);
        else 
            return name.compareTo(other.name);
    }
    //Prints the attributes of the animal
    public String printInfo()
    {
        if(age < 1)
            return String.format("%-10s%.1f months \t%s", kind, age*12, name);
        else
            return String.format("%-10s%.1f years \t%s", kind, age, name);
    }
}

