package bookstore;

/**
 * Student Name: Brennen Calato
 * LSU ID: 895007806
 * Lab Section: 3
 * Assignment: Lab Assignment 5: Publication Citation
 */

public class Author implements Comparable<Author>
{
    protected String firstName;
    protected String lastName;
    protected String institution;
    
    //Creates an author object
    public Author(String name)
    {
       String[] names = name.split(" ");
       firstName = names[0];
       lastName = names[1];
    }
    
    //Sets the institution of the author (not used?)
    public void setInstitution(String Ins)
    {
        institution = Ins;
    }
    
    //Used to order authors in alphabetical order by their last names
    @Override
    public int compareTo(Author other)
    {
        return lastName.compareTo(other.lastName);
    }
}

