/**
 * A class that maintains information on a book.
 * This might form part of a larger application such
 * as a library system, for instance.
 *
 * @author (Isabella Reinn Dela Pena)
 * @version (2.10.19)
 */
class Book
{
     // The fields.
    private String author;
    private String title;
    private int pages;
    private String refNumber;
    private int borrowed;
    boolean courseText;

    /**
     * Set the author and title fields when this object
     * is constructed.
     */
    public Book(String bookAuthor, String bookTitle, int bookPages, boolean courseT)
    {
        author = bookAuthor;
        title = bookTitle;
        pages = bookPages;
        refNumber = "";
        borrowed = 0;
        courseText = courseT;
    }
    
    public String getAuthor()
    {
        return author;
    }
    
    public String getTitle()
    {
        return title;
    }
    
    public int getPages()
    {
        return pages;
    }
   
    public void setRefNumber(String ref)
    {
        if(ref.length() < 3)
            System.out.println("Error. Enter more than 3 characters");
        else
            refNumber = ref;
    }
    
    public String getRefNumber()
    {
        return refNumber;
    }
    
    public void borrow()
    {
        borrowed = borrowed + 1;
    }
    
    public int getBorrowed()
    {
        return borrowed;
    }
    
    public boolean isCourseText()
    {
        return courseText;
    }
    
    public void printDetails()
    {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Pages: " + pages);
        System.out.println("Times Borrowed: " + borrowed);
        System.out.println("Course Text? " + courseText);
        if(refNumber.length() > 0)
            System.out.println("Reference Number: " + refNumber);
        else 
            System.out.println("ZZZ");

    }
    
    public static void main(String args[])
    {
        Book book = new Book("Isabella", "Test book", 28, true);
        book.setRefNumber("H12345678");
        for(int i=0; i<10; i++)
            { 
                book.borrow();
            }
    }
}
