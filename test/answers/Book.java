public class Book {

    private String summary;
    private int pages;

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

    public boolean isRepeatingSummary(){
        boolean repeating = false;
        Utilities util = new Utilities();
        int pos = util.getFirstRepeatedCharacter(summary);
        if(pos != -1){
            repeating = true;
        }
        return repeating;
    }

    //--------------
    public boolean isRepeatedSummary2(String summary){
        int doubleChar = new Utilities().getFirstRepeatedCharacter(summary);
        if (doubleChar == -1){
            return false;}
        else {
            return true;}
    }


    void showPagesToRead(){
        int pagesToRead = pages/2;
        Utilities util = new Utilities();
        util.goDownToOne(pagesToRead);

    }
}
