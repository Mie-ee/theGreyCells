package org.example;

public class Book {
  private String ID;
  private String title;
  private int publishYear;

  public Book( String ID, String title,int publishYear) {
    this.ID = ID;
    this.title = title;
    this.publishYear = publishYear;
  }

  public String getID() {
    return ID;
  }
  public String getTitle() {
    return title;
  }

  public int getPublishYear() {
    return publishYear;
  }
  @Override
  public String toString() {
    return "Book{" +
            "ID='" + ID + '\'' +
            ", title='" + title + '\'' +
            ", publishYear=" + publishYear +
            '}';
  }
}
