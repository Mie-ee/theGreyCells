package org.example;

public class Book {

  //Bookの情報を管理
  //idは自動的に振り分け

  private static int nextID = 1;
  private String id;
  private String title;
  private int year;

  public Book(String title, int year) {
    this.id = String.format("A%04d", nextID++);
    this.title = title;
    this.year = year;
  }

  public String getId() {
    return id;
  }

  public String getTitle() {
    return title;
  }

  public int getYear() {
    return year;
  }

  @Override
  public String toString() {
    return "Book{" +
        "ID='" + id + '\'' +
        ", title='" + title + '\'' +
        ", publishYear=" + year +
        '}';
  }
}
