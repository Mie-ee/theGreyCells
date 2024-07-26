package org.example;

public class Main {
  public static void main(String[] args) {
    Library library = new Library();

    Book book1 = new Book("A001", "The Mysterious Affair at Styles", 1920);
    Book book2 = new Book("A002", "Murder on the Orient Express", 1934);
    Book book3 = new Book("A003", "Death on the Nile", 1937);

    library.addBook(book1);
    library.addBook(book2);
    library.addBook(book3);

    System.out.println("All books in the library:");
    System.out.println(library);

    System.out.println("\nSearch by title 'Murder':");
    System.out.println(library.searchByTitle("Murder"));

    System.out.println("\nSearch by year 1937:");
    System.out.println(library.searchByYear(1937));
  }
}