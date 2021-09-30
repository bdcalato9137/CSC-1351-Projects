package bookstore;

/**
 * Student Name: Brennen Calato
 * LSU ID: 895007806
 * Lab Section: 3
 * Assignment: Lab Assignment 5: Publication Citation
 */

public class Journal extends Publication implements Citable
{
    private int volume; 
    private int number;

    //Creates a journal object with traits inherited from the publication class, in addition to its own specific parameters that differ from Proceeding
    public Journal(String authorNames, Publisher pub, String ven, String Title, int start, int end, int dateYear, int vol, int num) 
    {
        super(authorNames, pub, ven, Title, start, end, dateYear);
        volume = vol;
        number = num;
    }
    
    //Uses Publication's Cite() method in order
    @Override
    public String Cite()
    {
        return super.Cite() + String.format("%d(%d): %d-%d, %d", volume, number, startingPage, endPage, year);
    }
    
    
}

