package bookstore;

/**
 * Student Name: Brennen Calato
 * LSU ID: 895007806
 * Lab Section: 3
 * Assignment: Lab Assignment 5: Publication Citation
 */


import java.util.ArrayList;
import java.util.Collections;

enum Publisher {ELSEVIER, SPRINGER, IEEE, TAYLORFRANCIS, WILEY, ACM};
/**
 *
 * @author bcalat1
 */
public class Publication implements Citable, Comparable<Publication>
{
    private ArrayList<Author> authors;
    private Publisher publisher;
    private String venue;
    private String title;
    
    protected int startingPage;
    protected int endPage;
    protected int year;
    
    //Creates a publication object that holds much of the information from the publications.txt
    //It also sorts the authors in the author array by their last names
    public Publication(String authorNames, Publisher pub, String ven, String Title, int start, int end, int dateYear)
    {
        authors = new ArrayList<>();
        String[]author = authorNames.split(",");
        for (String auths : author) {
            authors.add(new Author(auths));
        }
        Collections.sort(authors);
        
        publisher = pub;
        venue = ven;
        title = Title;
        startingPage = start;
        endPage = end;
        year = dateYear;
        
    }
    //This method arranges the citations of the publications in order by last name of the first author,
    //the venue, or the year in that order of priority
    @Override
    public int compareTo(Publication other)
    {
        if(authors.get(0).lastName.compareTo(other.authors.get(0).lastName) !=0 )
            return authors.get(0).lastName.compareTo(other.authors.get(0).lastName);
        else if(venue.compareTo(other.venue) != 0)
            return venue.compareTo(other.venue);
        else
            return Integer.compare(year, other.year);
    }
    
    //Creates the common base of citations for both journal and proceeding citations
    @Override
    public String Cite()
    {
        String cite = "";
        
        //for(int i = 0; i < authors.size(); i++)
        String authorsList = "";
        Collections.sort(authors);
        
        int n = 1;
        for(Author r: authors)
        {
            if(n < authors.size())
                authorsList += r.firstName.toUpperCase().charAt(0) + ". " + r.lastName + ", ";
            else
            {
                authorsList += "and " + r.firstName.toUpperCase().charAt(0) + ". " + r.lastName +", ";
            }
            n++;
        }
            String acro = "";
            String[] venues = venue.split(" ");
            for (String vens : venues) 
            {
                acro += vens.charAt(0);
            }
            cite += " " + authorsList + "\"" + title + "\", " + venue + "(" + acro.toUpperCase() + "), " + publisher + ", ";
            return cite;  
    }
}

