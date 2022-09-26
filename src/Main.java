public class Main {
    public static void putBook(Book books[], Book book) {
        for (int i = 0; i < books.length; i++) {
            if (books[i] == null) {
                books[i] = book;
                break;
            }
        }
    }
    public static void printArray(Book books[]){
        for (int i = 0; i < books.length; i++) {
            if (books[i] != null) {
                System.out.println(books[i].getAuthor().getAuthorSurname()+" "+ books[i].getAuthor().getAuthorName()
                        +": "+books[i].getName()+": "+ books[i].getPublicationYear() );
            }


        }
    }

    public static void main(String[] args) {
        Author kaverin = new Author("Leonid", "Kaverin");
        Author strugatskiyB = new Author("Boris", "Strugatskiy");
        Book twoCaptains = new Book("Two captains", kaverin, "1992");
        Book mondayStartsOnSaturday = new Book("Monday starts on Saturday", strugatskiyB, "2000");
        System.out.println("twoCaptains.getAuthor() = " + twoCaptains.getAuthor().getAuthorName() + " " + twoCaptains.getAuthor().getAuthorSurname());
        ;
        System.out.println("mondayStartsOnSaturday.getPublicationYear() = " + mondayStartsOnSaturday.getPublicationYear());
        mondayStartsOnSaturday.setPublicationYear("2001");
        System.out.println("mondayStartsOnSaturday.getPublicationYear() = " + mondayStartsOnSaturday.getPublicationYear());
        Book[] booksArray = new Book[5];
        putBook(booksArray, twoCaptains);
        putBook(booksArray, mondayStartsOnSaturday);
        printArray(booksArray);

        Library lib = new Library(3);
        lib.putBook(mondayStartsOnSaturday);
        lib.printArray();
        lib.printByName("Monday starts on Saturday");
        lib.changeYearByName("Monday starts on Saturday", "2015");
        lib.printArray();



    }
}