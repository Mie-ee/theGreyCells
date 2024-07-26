package org.example;

import java.util.ArrayList;
import java.util.List;

public class Library {
  private List<Book> books;

  public Library() {
    this.books = new ArrayList<>();
  }

  public void addBook(Book book) {
    books.add(book);
  }

  public List<Book> searchByTitle(String title) {
    List<Book> result = new ArrayList<>();
    for (Book book : books) {
      if (book.getTitle().toLowerCase().contains(title.toLowerCase())) {
        result.add(book);
      }
    }
    return result;
  }

  public List<Book> searchByYear(int publishYear) {
    List<Book> result = new ArrayList<>();
    for (Book book : books) {
      if (book.getPublishYear() == publishYear) {
        result.add(book);
      }
    }
    return result;
  }

  @Override
  public String toString() {
    return "Library{" +
        "books=" + books +
        '}';
  }
}