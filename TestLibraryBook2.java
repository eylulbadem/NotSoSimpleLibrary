import java.util.Scanner;

/**
 * Lab08a
 * @author Eylul Badem
 * @version 21.12.2020
*/ 
public class TestLibraryBook2 
{
    
    public static void main(String[]args) {
        
        Scanner scan = new Scanner(System.in);
    
        // properties
       
        LibraryBook book1;
        LibraryBook book2;
        LibraryBook book3;

        // constructors
        
        // Books in the library
        book1 = new LibraryBook( "The Great Gatsby", "Scott Fitzgerald");
        book2 = new LibraryBook( "Life Of Pi", "Yann Martel");
        book3 = new LibraryBook( "The Great Gatsby", "Scott Fitzgerald");
        
        // program code
        
        System.out.println( "--------- COMPARING INSTANCES USING == ----------");
        System.out.println();
        
        // Compare two references to a single object using ==
        System.out.println( " 1)two references to a single object");
        if ( book1 == book1)
        {
            System.out.println( "Same!");
        }
        else 
        {
            System.out.println( "Different!");
        }
        System.out.println();
        
        // Compare two references to two individual objects with different properties using ==
        System.out.println( " 2) two references to two individual objects with different properties");
        if ( book1 == book2)
        {
            System.out.println( "Same!");
        }
        else 
        {
            System.out.println( "Different!");
        }
        System.out.println();
        
        // Compare two references to two individual objects with identical relevant properties using ==
        System.out.println( " 3) two references to two individual objects with identical relevant properties");
        if ( book1 == book3)
        {
            System.out.println( "Same!");
        }
        else 
        {
            System.out.println( "Different!");
        }
        System.out.println();
        System.out.println();
        
        System.out.println( "--------- COMPARING INSTANCES USING .equals ----------");
        System.out.println();
        
        // Compare two references to a single object using .equals
        System.out.println( " 1) two references to a single object");
        if ( book1.equals(book1))
        {
            System.out.println( "Same!");
        }
        else 
        {
            System.out.println( "Different!");
        }
        System.out.println();
        
        // Compare two references to two individual objects with different properties using .equals
        System.out.println( " 2) two references to two individual objects with different properties");
        if ( book1.equals(book2))
        {
            System.out.println( "Same!");
        }
        else 
        {
            System.out.println( "Different!");
        }
        System.out.println();
        
        // Compare two references to two individual objects with identical relevant properties using .equals
        System.out.println( " 3) two references to two individual objects with identical relevant properties");
        if ( book1.equals(book3))
        {
            System.out.println( "Same!");
        }
        else 
        {
            System.out.println( "Different!");
        }
        
        scan.close();
    }
}
