import java.util.Scanner;

/**
 * Lab08a
 * @author Eylul Badem
 * @version 21.12.2020
*/ 

public class LibraryBook {

    // properties
    
    String	title;
    String author;
    String dueDate = "12.12.20";
    int	timesLoaned = 0;
    
    // constructors
    
    public LibraryBook( String theTitle, String theAuthor) {
        title = theTitle;
        author = theAuthor;
    }
    
    public LibraryBook( LibraryBook book2) {
        this.title = book2.title;
        this.author = book2.author;
    }
    
    Scanner scan = new Scanner(System.in);

    // methods
    
    // Have methods to get the book's values
    public String getTitle() { 
        return title;
    }
    
    public String getAuthor() { 
        return author;
    }
    
    public String getDueDate() { 
        return dueDate;
    }

    public int getTimesLoaned() {
        return timesLoaned;
    }
    
    // Have a method to set the due date as the librarian wishes
    public void setDueDate( String someText) { 
        dueDate = someText;
    }
    
    // Have a method to add 1 to the total number of borrowing for that book
    public void increaseTimesLoaned() { 
        timesLoaned = timesLoaned + 1;
    }

    // Have a method to check if the book is borrowed or not
    public boolean onLoan() {
        boolean result;
        
        if ( onLoan())
        {
            result = true;
        }
        else
        {
            result = false;
        }
        return result;
    }
    
    // Have a method to borrow the wanted book and set the values as that book's values
    public void loan(LibraryBook book)
    {
        book.setDueDate("22.01.2021");
        String bookTitle = book.getTitle();
        String author = book.getAuthor();
        String dueDate = book.getDueDate();
        book.increaseTimesLoaned();
        int timesLoaned = book.getTimesLoaned();
            
        // Print out the information to let the user know
        System.out.println( "Borrowing succesful!");
        System.out.println( "You borrowed: " + bookTitle);
        System.out.println( "By: " + author);
        System.out.println( "Due Date: " + dueDate);
        System.out.println( "Total borrowing: " + timesLoaned);
    }
    
    // Have a method to return the wanted book
    public void returnBook(LibraryBook book)
    {
        timesLoaned = timesLoaned - 1;
    }
    
    public String toString() {
        return title + "";
    }
    
    // Add an .equals method
    public boolean equals(LibraryBook anotherBook)
    {
        LibraryBook book1;
        book1 = new LibraryBook( "The Great Gatsby", "Scott Fitzgerald");
        String author1 = book1.getAuthor();
        String author2 = anotherBook.getAuthor();
        String title1 = book1.getTitle();
        String title2 = anotherBook.getTitle();
        
        if ( author1 == author2 && title1 == title2)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
        
    // Add a method to check if the book has the same title with another wanted book
        public boolean hasSameTitle(LibraryBook anotherBook)
        {
            LibraryBook book1;
            book1 = new LibraryBook( "The Great Gatsby", "Scott Fitzgerald");
            String title1 = book1.getTitle();
            String title2 = anotherBook.getTitle();
            if ( title1 == title2)
            {
                return true;
            }
                else
            {
                return false;
            }
        }
        
    // Add a method to check if the book has the same author with another wanted book    
        public boolean hasSameAuthor(LibraryBook anotherBook)
        {
            LibraryBook book1;
            book1 = new LibraryBook( "The Great Gatsby", "Scott Fitzgerald");
            String author1 = book1.getTitle();
            String author2 = anotherBook.getTitle();
            if ( author1 == author2)
            {
                return true;
            }
                else
            {
                return false;
            }
        }
    
}

