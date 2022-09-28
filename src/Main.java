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
        Book twoCaptains = new Book("Two captains", kaverin, 1992);
        Book mondayStartsOnSaturday = new Book("Monday starts on Saturday", strugatskiyB, 2000);
        System.out.println("twoCaptains.getAuthor() = " + twoCaptains.getAuthor().getAuthorName() + " " + twoCaptains.getAuthor().getAuthorSurname());
        ;
        System.out.println("mondayStartsOnSaturday.getPublicationYear() = " + mondayStartsOnSaturday.getPublicationYear());
        mondayStartsOnSaturday.setPublicationYear(2001);
        System.out.println("mondayStartsOnSaturday.getPublicationYear() = " + mondayStartsOnSaturday.getPublicationYear());
        Book[] booksArray = new Book[5];
        putBook(booksArray, twoCaptains);
        putBook(booksArray, mondayStartsOnSaturday);
        printArray(booksArray);

        Library lib = new Library(3);
        lib.putBook(mondayStartsOnSaturday);
        lib.printArray();
        lib.printByName("Monday starts on Saturday");
        lib.changeYearByName("Monday starts on Saturday", 2015);
        lib.printArray();
        System.out.println(kaverin);
        Author strugatkiyA = new Author("Arkadiy", "Strugatskiy");
        System.out.println(strugatkiyA.equals(strugatskiyB));
        System.out.println(twoCaptains);
        Book twoCapitans2 = new Book("Two captains", kaverin, 1992);
        System.out.println(twoCapitans2.equals(twoCaptains));

        //Повышенная сложность
        System.out.println("Authors:");
        Author stephenKing = new Author("Stephen", "King");
        Author stephenKing2 = new Author("Stephen", "King");
        Author levTolstoy = new Author("Lev", "Tolstoy");
        System.out.println("Author copies equal: " + stephenKing.equals(stephenKing2));
        System.out.println("Author copies equal by hashCode: " + (stephenKing.hashCode() == stephenKing2.hashCode()));
        System.out.println("Authors equal: " + stephenKing.equals(levTolstoy));
        System.out.println("Authors equal by hashCode: " + (stephenKing.hashCode() == levTolstoy.hashCode()));

        System.out.println(stephenKing);
        System.out.println(levTolstoy);

        System.out.println("==============================");

        System.out.println("Books:");
        Book theStand = new Book("The Stand", stephenKing, 1976);
        Book theStand2 = new Book("The Stand", stephenKing, 1976);
        Book warAndPeace = new Book("War and Peace", levTolstoy, 1869);
        System.out.println("Book copies equal: " + theStand.equals(theStand2));
        System.out.println("Book copies equal by hashCode: " + (theStand.hashCode() == theStand2.hashCode()));
        System.out.println("Books equal: " + theStand.equals(warAndPeace));
        System.out.println("Books equal by hashCode: " + (theStand.hashCode() == warAndPeace.hashCode()));
        System.out.println(theStand);
        System.out.println(warAndPeace);

        System.out.println("==============================");

        Library library = new Library(2);
        library.putBook(theStand);
        library.putBook(warAndPeace);
        System.out.println(library);
    }
}