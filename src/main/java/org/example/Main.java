package org.example;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) {
    Library library = new Library();

    //Scannerで数字入力
    //使いたい機能の条件分岐
    while (true) {
      System.out.println(Color.yellow + "Welcome to The Grey Cells Library" + Color.end);
      System.out.println(
          Color.yellow + "Please enter a number to choose the function." + Color.end);
      System.out.println(Color.back + "1.Search by Title" + Color.end);
      System.out.println(Color.back + "2.Search by Published Year" + Color.end);
      System.out.println(Color.back + "3.Search by ID" + Color.end);
      System.out.println(Color.back + "4.Quit" + Color.end);
      System.out.println(Color.back + "0.Show Library" + Color.end);

      Scanner intScanner = new Scanner(System.in);
      try {
        int num = intScanner.nextInt();
        //終了処理
        if (num == 4) {
          System.out.println("Thanks for Using.");
          break;
        }
        List<Book> searchResult = new ArrayList<>();
        switch (num) {
          case 1:
            System.out.println(
                Color.yellow + "Please enter the title you want to search." + Color.end);
            Scanner titleScanner = new Scanner(System.in);
            searchResult = library.searchByTitle(titleScanner.nextLine());
            break;
          case 2:
            System.out.println(
                Color.yellow + "Please enter the publish year you want to search." + Color.end);
            Scanner yearScanner = new Scanner(System.in);
            searchResult = library.searchByYear(yearScanner.nextInt());
            break;
          case 3:
            System.out.println(
                Color.yellow + "Please enter the ID you want to search." + Color.end);
            Scanner idScanner = new Scanner(System.in);
            searchResult = library.searchByID(idScanner.nextLine());
            break;
          case 0:
            System.out.println("All books in the library:");
            searchResult = library.getAllBooks();
              System.out.println(library);
            break;

          //0~4以外の数字が入力された時の処理
          default:
            System.out.println("Please choose from 0~4");
            System.out.println();
            continue;
        }
        //見つかる/見つからない時の条件分岐
        if (searchResult.isEmpty()) {
          System.out.println(Color.red +"No book found."+ Color.end);
        } else {
          System.out.println("Search result:");
          for (Book book : searchResult) {
            System.out.println(book);
          }
        }
      }
      //数字以外が入力された時の例外処理
      catch (InputMismatchException e) {
        System.out.println(Color.red + "Sorry. Please enter a number." + Color.end);
      }
    }
  }
}