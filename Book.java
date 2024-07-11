class Book{
    String bookName;
    String bookGenre;
    String author;
    int publishedYear;
    int issueMonth;
    int returnMonth;
    int returnDeadlineMonth;
    public Book(){
        
    }
    public Book(String bookName,String bookGenre,String author,int publishedYear){
        this.bookName=bookName;
        this.bookGenre=bookGenre;
        this.author=author;
        this.publishedYear=publishedYear;
    }
    void displayBook(){
        System.out.println("Book Name: "+ this.bookName);
        System.out.println("Book Genre: "+this.bookGenre);
        System.out.println("Book Author: "+this.author);
        System.out.println("Book PublishedYear: "+this.publishedYear);
    }
}