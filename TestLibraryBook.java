import java.util.Scanner;

/**
 * Lab08a
 * @author Eylul Badem
 * @version 13.12.2020
*/ 
public class TestLibraryBook 
{
    
    public static void main(String[]args) {
        
        Scanner scan = new Scanner(System.in);
    
        // properties
       
        LibraryBook book1;
        LibraryBook book2;
        String again = "Y";
        String answer2;
        
        // constructors
        
        // Books in the library
        book1 = new LibraryBook( "The Great Gatsby", "Scott Fitzgerald");
        book2 = new LibraryBook( "Life Of Pi", "Yann Martel");
        
        // program code
        while ( again.equals("Y"))
        { 
            System.out.println();
            System.out.println( "Do you want to borrow or return a book? borrow/return");
            answer2 = scan.next();
            
            // 1-Use loan method if the user wants to borrow a book
            if ( answer2.equals( "borrow"))
            {
                System.out.println();
                System.out.println( "Which book do you want to borrow? book1/book2");
                String answer = scan.next();
        
                if ( answer.equals("book1"))
                { 
                    book1.loan(book1);
                }
                else if ( answer.equals("book2"))
                {
                    book2.loan(book2);
                }
            }
            
            // 2-Use return method if the user wants to return a book
            else if ( answer2.equals( "return"))
            {
                System.out.println();
                System.out.println( "Which book do you want to return? book1/book2");
                String answer = scan.next();
        
                if ( answer.equals("book1") && book1.getTimesLoaned()>0)
                { 
                    book1.returnBook(book1);
                    System.out.println( "Book returned! Thanks.");
                }
                else if ( answer.equals("book2") && book2.getTimesLoaned()>0)
                {
                    book2.returnBook(book2);
                    System.out.println( "Book returned!");
                }
                else
                {
                    // Print out an error message if the user tries to return without borrowing
                    System.out.println();
                    System.out.println( "You can't return a book you don't have :(");
                }
                
            }

            // 3-Ask the user if the user wants to make another transaction or not & get the answer
            System.out.println();
            System.out.println( "Do you want to make another transaction? Y/N");
            again = scan.next();
        }
        
        // 4-Print out a goodbye message if the user says no
        System.out.println( "Ok then, enjoy your books!");

        scan.close();
    }
}
