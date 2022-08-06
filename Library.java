import java.util.Scanner;
import java.util.ArrayList;
/**
 * Lab08b
 * @author Eylul Badem
 * @version 21.12.2020
*/ 

public class Library {
    
    Scanner scan = new Scanner(System.in);
    LibraryBook book;
    
    // variables 
    
    static ArrayList<LibraryBook> library = new ArrayList<LibraryBook>();

    // methods
    
    // A method to check if the library is empty or not
    public boolean isEmpty()
    {
        if ( library.size() == 0)
        {
            return true;
        }
        else
        { 
            return false;
        }
    }
    
    // A method to print out the books in the library as string if there are any
    public String toString()
    {
        if ( library.size() == 0)
        {
            return ( "Sorry, there are no books in the library! :(");
        }
        else
        {
            return ("books: " + library);
        }
    }
    
    // A method to find a book by typing its title from the library
    public static String findByTitle( String title) {

            String title2;
            int result = 0;
            int count = 0;
            int size = library.size();
            while ( count < size)
            {
                LibraryBook book5 = library.get(count);
                title2 = book5.getTitle();
                count = count + 1;
                if ( title2.equals(title))
                {
                    result = 1;
                }
            }
            if ( result == 1)
            {
                System.out.println();
                return ( "Found the book!");
            }
            else
            {
                System.out.println();
                return ( "Sorry, I don't have that book!");
            }
        }
    
        // A method to remove the wanted book from the library
    public static boolean remove(LibraryBook book)
    {
        if ( book == null)
        {
            return false;
        }
        else
        {
            return Library.remove( book);
        }
    }
}

