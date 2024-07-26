package org.example;

import java.util.ArrayList;
import java.util.List;

public class Library {

  private List<Book> books;

  public Library() {
    books = new ArrayList<>();
    initializeBooks();
  }

  //Book情報格納、初期化
  private void initializeBooks() {
    addBook("The Mysterious Affair at Styles", 1920);
    addBook("Murder on the Orient Express", 1934);
    addBook("Death on the Nile", 1937);
    addBook("The Big Four", 1927);
    addBook("The Murder of Roger Ackroyd", 1926);
    addBook("The A.B.C. Murders", 1936);
    addBook("Murder in Mesopotamia", 1936);
    addBook("The Man in the Brown Suit", 1924);
    addBook("The Mystery of the Blue Train", 1928);
    addBook("Three Act Tragedy", 1934);
    addBook("Hercule Poirot’s Christmas", 1938);
    addBook("Evil Under the Sun", 1941);
    addBook("Five Little Pigs", 1942);
    addBook("After the Funeral", 1953);
    addBook("Cat Among the Pigeons", 1959);
    addBook("The Clocks", 1963);
    addBook("Curtain: Poirot’s Last Case", 1975);
  }

  public void addBook(String title, int year) {
    Book newBook = new Book(title, year);
    books.add(newBook);
  }

  //Book情報検索機能
  public List<Book> searchByTitle(String title) {
    List<Book> searchResult = new ArrayList<>();
    String formattedTitle = title.toLowerCase().replaceAll("\\s+", "");
    for (Book book : books) {
      String formattedBookTitle = book.getTitle().toLowerCase().replaceAll("\\s+", "");
      if (formattedBookTitle.contains(formattedTitle)) {
        searchResult.add(book);
      }
    }
    return searchResult;
  }

  public List<Book> searchByYear(int year) {
    List<Book> result = new ArrayList<>();
    for (Book book : books) {
      if (book.getYear() == year) {
        result.add(book);
      }
    }
    return result;
  }

  public List<Book> searchByID(String id) {
    List<Book> result = new ArrayList<>();
    for (Book book : books) {
      if (book.getId().equals(id)) {
        result.add(book);
      }
    }
    return result;
  }

  //Libraryの本一覧を行分け表示
  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    for (Book book : books) {
      sb.append(book).append("\n");
    }
    return sb.toString();
  }
}