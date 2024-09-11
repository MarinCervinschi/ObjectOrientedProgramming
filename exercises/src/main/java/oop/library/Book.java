package oop.library;

import java.util.Objects;

public class Book extends Item {
    int pages;

    public Book(String title, int year, int pages) {
        super(title, year);
        this.pages = pages;

    }

    @Override
    public String toString() {
        return "Book{" +
                "pages=" + pages +
                ", title='" + title + '\'' +
                ", year=" + year +
                '}';
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return pages == book.pages;
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(pages);
    }
}
