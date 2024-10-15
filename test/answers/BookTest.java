public class BookTest {
    public static void main(String[] args) {
        Book book1 = new Book("The big catalogue of all green animals ever existed", 55 );
        Book book2 = new Book("Exciting new recipes for people who want something quick an easy", 52);

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
