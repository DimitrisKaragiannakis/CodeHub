public class BookTest {
    public static void main(String[] args) {

        //create 2 books

        Book book1 = new Book("Java for beginners", 22);
        Book book2 = new Book("Carreer Shifter", 37);

        //method isRepeatingSummary
        System.out.println("Book 1 has repeating characters: " + book1.isRepeatingSummary());
        System.out.println("Book 2 has repeating characters: " + book2.isRepeatingSummary());

        //method  showPagesToRead
        System.out.println("Pages to read for Book 1:");
        book1.showPagesToRead();

        System.out.println("Pages to read for Book 2:");
        book2.showPagesToRead();

    }
}
