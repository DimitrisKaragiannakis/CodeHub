// Book.java
public class Book {
    private String summary;
    private int pages;

    // attributes, con & get/set
    public Book(String summary, int pages) {
        this.summary = summary;
        this.pages = pages;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    // method is repeating
    public boolean isRepeatingSummary() {
        return Utilities.getFirstRepeatedCharacter(this.summary) != -1;
    }

    // method read pages
    public void showPagesToRead() {
        int middlePage = pages / 2;
        System.out.println("Starting from page: " + middlePage);
        Utilities.goDownToOne(middlePage);
    }
}


