import java.util.Scanner;
import java.util.ArrayList;
/**
 * Lab08b
 * @author Eylul Badem
 * @version 21.12.2020
*/ 
public class LibraryTest 
{
    public static void main(String[]args) {
        
        Scanner scan = new Scanner(System.in);
    
        // properties

        LibraryBook book;
        LibraryBook book3;
        LibraryBook book4;
        String title;
        String again = "Y";
        String answer2 = "y";
        String answer3;
        String result2;
        boolean check;
        
        // constructors

        ArrayList<LibraryBook> library;
        library = new ArrayList<LibraryBook>();
        
        // Books which already exist in the library
        book3 = new LibraryBook( "Pride and Prejudice", "Jane Austen");
        book4 = new LibraryBook( "Frankenstein", "Mary Shelley");
        
        // program code
        
        // 1- Print out a welcome message
        System.out.println( "Welcome to my library!");
    
        library.add( book3);
        library.add( book4);
        
        while ( again.equals("Y"))
        {
            if ( again.equals("Y"))
        { 
            // 2- Print out the main menu for user to choose from
            System.out.println();
            System.out.println( "------------");
            System.out.println( "Show");
            System.out.println( "Find");
            System.out.println( "Add");
            System.out.println( "Exit");
            System.out.println( "------------");
            System.out.println( "Select:");
            answer2 = scan.next();
            
            // 3- Use methods to do the wanted transaction according to the user's selection
            if ( answer2.equals( "Show"))
            { 
                System.out.println( library);
            }
            else if ( answer2.equals( "Find"))
            {
                System.out.println();
                System.out.println( "Title of the book you are looking for: ");
                title = scan.next();
                result2 = Library.findByTitle( title);
            
                if ( result2.equals( "Found the book!"))
                {
                    check = true;
                }
                else 
                {
                    check = false;
                }
                
            if ( check == true )
                {
                    System.out.println( "------------");
                    System.out.println( "Loan");
                    System.out.println( "Return");
                    System.out.println( "Remove"); 
                    System.out.println( "Exit Back");
                    System.out.println( "------------");
                    System.out.println( "Select:");
                    answer3 = scan.next();
                    
                    if ( answer3.equals( "Loan"))
                    {
                        int result = 0;
                        int count = library.size();
                        while ( count > 0 )
                        {
                            String title2 = library.get(count).getTitle();
                            count = count - 1;
                            if ( title2.equals(title))
                            {
                                book = library.get(count);
                                book.loan(book);
                            }
                        }
                        //book.loan(book)
                    }
                    else if ( answer3.equals( "Return"))
                    {
                        System.out.println( "Which book do you want to return?");
                        title = scan.next();
                        int result = 0;
                        int count = library.size();
                        while ( count > 0 )
                        {
                            String title2 = library.get(count).getTitle();
                            count = count - 1;
                            if ( title2.equals(title))
                            {
                                book = library.get(count);
                                if ( book.getTimesLoaned() > 0)
                                { 
                                    book.returnBook(book);
                                    System.out.println( "Book returned! Thanks.");
                                }
                                else
                                {
                                    //Print out an error message if the user tries to return without borrowing
                                    System.out.println();
                                    System.out.println( "You can't return a book you don't have :(");
                                }
                            }
                        }
                    }
                    else if ( answer3.equals( "Remove"))
                    {
                        System.out.println( "Which book do you want to remove?");
                        title = scan.next();
                        int result = 0;
                        int count = library.size();
                        while ( count > 0 )
                        {
                            String title2 = library.get(count).getTitle();
                            count = count - 1;
                            if ( title2.equals(title))
                            {
                                book = library.get(count);
                                if (  check == true)
                                { 
                                    Library.remove(book);
                                    System.out.println( "Book removed!");
                                }
                                else
                                {
                                    //Print out an error message if the user tries to return without borrowing
                                    System.out.println();
                                    System.out.println( "You can't remove a book which doesn't exist");
                                }
                            }
                        }
                    }

                    else if ( answer3.equals( "Exit Back"))
                    {
                        // Exit back to the main menu by asking if the user wants to make another transaction
                    }
                }
                else
                {
                    System.out.println( "Couldn't find the book in this library");
                }
            }
            else if ( answer2.equals( "Add"))
            {
                System.out.println();
                System.out.println( "Title of the book you want to add: ");
                String theTitle = scan.next();
                System.out.println( "Author of the book you want to add: ");
                String theAuthor = scan.next();
                LibraryBook book1 = new LibraryBook( theTitle, theAuthor);
                library.add( book1);
            }
            else if ( answer2.equals( "Exit"))
            {
            }
            else
            {
                System.out.println();
                System.out.println( "This was not an option");
            }
        
            // 4- Ask the user if the user wants to make another transaction or not & get the answer
            System.out.println();
            System.out.println( "Do you want to make another transaction? Y/N");
            again = scan.next();
            
            if ( again.equals("N"))
            {
                System.out.println();
                System.out.println( "Ok then, enjoy your books!");
            }
            else if ( !again.equals("N") && !again.equals("Y"))
            {
                System.out.println();
                System.out.println( "This was not an option");
                System.out.println();
                System.out.println( "Do you want to make another transaction? Y/N");
                again = scan.next();
            }
        }
        }

        scan.close();
    }
}