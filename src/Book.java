import java.util.Objects;

public class Book {
    private String name;
    private Author author;
    private int publicationYear;
    public Book(String name, Author author, int publicationYear) {
        this.name = name;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public void setPublicationYear(int publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }

    @Override
    public String toString() {
        return  name +" by " + author +
                " published in " + publicationYear;

    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return name.equals(book.name) && author.equals(book.author) && publicationYear==book.publicationYear;
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, author, publicationYear);
    }
}

