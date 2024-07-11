import java.util.Scanner;

interface issue_a_book{
    void addBook();
    void issueBook();
    void returnBook();
}
class Main extends Book implements issue_a_book{
    Book b1 = new Book("To Kill a Mockingbird","Fictional, Southern Gothic, Coming-of-Age","Harper Lee",1960);
    Book b2 = new Book("Harry Potter and the Sorcerer's Stone","Fantasy","J.K. Rowling",1997);
    Scanner sc = new Scanner(System.in);
    public void addBook(){
        Book newBook = new Book();
        System.out.println("Enter Book's Name");
        newBook.bookName=sc.nextLine();
        System.out.println("Enter Book's Genre");
        newBook.bookGenre=sc.nextLine();
        System.out.println("Enter Book's Author Name");
        newBook.author=sc.nextLine();
        System.out.println("Enter Book's Published Year");
        newBook.publishedYear=sc.nextInt();
        System.out.println("Book's added successfully");
    }
    public void issueBook(){
        System.out.println("Book 1");
        b1.displayBook();
        System.out.println("Book 2");
        b2.displayBook();
        System.out.println("Choose a book number");
        int choice = sc.nextInt();
        if(choice ==1){
            System.out.println("Enter current Month in numbers");
            b1.issueMonth = sc.nextInt();
            b1.returnDeadlineMonth=b1.issueMonth+1;
            System.out.println("Book issued successfully");
        }
        else if(choice ==2){
            System.out.println("Enter current Month");
            b2.issueMonth = sc.nextInt();
            b2.returnDeadlineMonth=b2.issueMonth+1;
            System.out.println("Book issued successfully");
        }
        else{
            System.out.println("Book not available");
        }
    }
    public void returnBook(){
        System.out.println("Choose a book number");
        int choice = sc.nextInt();
        System.out.println("Enter current Month in numbers");
        int returnMonth= sc.nextInt();
        if(choice ==1 && (b1.returnDeadlineMonth==returnMonth || b1.issueMonth==returnMonth)){
            System.out.println("Book 1 returned successfully");
        }
        else if (choice ==2 && (b2.returnDeadlineMonth==returnMonth || b2.issueMonth==returnMonth)) {
            System.out.println("Book 2 returned successfully");
        }
        else{
            int fine = (choice==1)?Math.abs(b1.returnDeadlineMonth-returnMonth)*100 :Math.abs(b2.returnDeadlineMonth-returnMonth)*100;
            System.out.println("Pay Fine : Rs "+fine);
        }
    }
    public static void main(String args[]){
        Main library=new Main();
        System.out.println("Add a book");
        library.addBook();
        System.out.println("Issue a Book");
        library.issueBook();
        System.out.println("Return a Book");
        library.returnBook();
    }
}