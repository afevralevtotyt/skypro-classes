public class Book {
    private String name;
    private Author author;
    private String publicationYear;
    public Book(String name, Author author, String publicationYear) {
        this.name = name;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    public void setPublicationYear(String publicationYear) {
        this.publicationYear = publicationYear;
    }

    public String getName() {
        return name;
    }

    public Author getAuthor() {
        return author;
    }

    public String getPublicationYear() {
        return publicationYear;
    }
}
