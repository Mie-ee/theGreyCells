package org.example;

public class Book {
  private String title;
  private int ID;
  private int year;

  public Book(String title, int ID, int year) {
    this.title = title;
    this.ID = ID;
    this.year = year;
  }

  public String getTitle() {
    return title;
  }

  public int getID() {
    return ID;
  }

  public int getYear() {
    return year;
  }

  public String toString() {
    return title + " (" + year + "), ID: " + ID;
  }
}
