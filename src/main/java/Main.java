package src.main.java;
import java.util.Scanner;
import src.checker.java.Checker;

public class Main {
  public static void main(String[] args){
    char pilihan='y';
    Scanner scan = new Scanner(System.in);

    while(pilihan=='y'){ 
      Checker satu = new Checker();
      System.out.print("\nTransaksi lagi(y/n) = ");
      pilihan=scan.next().charAt(0);
    }
  }
}
