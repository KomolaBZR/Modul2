package com.company;

public class Book implements Comparable<Book>{
    private String author;
    private String title;
    private int publicationDate;

    public Book(String author, String title, int publicationDate) {
        this.author = author;
        this.title = title;
        this.publicationDate = publicationDate;
    }

    public String getAuthor() {
        return author;
    }

    public String getTitle() {
        return title;
    }

    public int getPublicationDate() {
        return publicationDate;
    }

    @Override
    public String toString() {
        return "Book {" +
                "author ='" + author + '\'' +
                ", title ='" + title + '\'' +
                ", publicationDate =" + publicationDate +
                '}';
    }
    public int compareTo(Book person){
        return this.author.compareTo(person.author);
    }

}
