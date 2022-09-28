import java.util.Arrays;

public class Library {

    private Book[] booksArray;
    Library(int length){
        this.booksArray =new Book [length];
    }

    public void putBook(Book book) {
        for (int i = 0; i < this.booksArray.length; i++) {
            if (this.booksArray[i] == null) {
                this.booksArray[i] = book;
                break;
            }
        }
    }
    public void printArray(){
        for (int i = 0; i < booksArray.length; i++) {
            if (booksArray[i] != null) {
                System.out.println(booksArray[i].getAuthor().getAuthorSurname()+" "+booksArray[i].getAuthor().getAuthorName()
                        +": "+booksArray[i].getName()+": "+ booksArray[i].getPublicationYear() );
            }


        }
    }
    public void printByName(String name){
        for (int i = 0; i < booksArray.length; i++) {
            if (booksArray[i].getName()==name){
                System.out.println(name+ " by "+ booksArray[i].getAuthor().getAuthorName()+" "+booksArray[i]
                        .getAuthor().getAuthorSurname()+" was published in "+booksArray[i].getPublicationYear());
                break;
            }
        }
    }
    public void changeYearByName(String name, int newYear){
        for (int i = 0; i < booksArray.length; i++) {
            if (booksArray[i].getName()==name){
                this.booksArray[i].setPublicationYear(newYear);
                break;
            }

            }
    }

    @Override
    public String toString() {
        String Books = "";
        for (int i = 0; i < booksArray.length; i++) {
          Books = Books + booksArray[i].toString() + "\n";
        }
        return "Library: "+"\n" + Books;
    }
}
