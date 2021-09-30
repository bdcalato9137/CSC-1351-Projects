package bookstore;

/**
 * Student Name: Brennen Calato
 * Lab Section: 3
 * Assignment: Lab Assignment 5: Publication Citation
 */

public class Proceeding extends Publication implements Citable
{
    private String City;

    //Creates a Proceeding object with parameters inherited from the Publication class
    //along with its own parameters that are different from journal, in order to be cited
    public Proceeding(String authorNames, Publisher pub, String ven, String Title, int start, int end, int dateYear, String city)
    {
        super(authorNames, pub, ven, Title, start, end, dateYear);
        City = city;
    }
    
    //Used the parent class, Publication's, citation method to get the base of the scientific citation
    //while adding onto the super.Cite() with citation additions specific to Proceedings
    @Override
    public String Cite()
    {
        return super.Cite() + String.format("%s, %d, pp:%d-%d", City, year, startingPage, endPage);
    }
}

