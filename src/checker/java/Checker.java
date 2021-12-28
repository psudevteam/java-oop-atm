package src.checker.java;

import java.util.Scanner;
import src.transaction.java.Transaction;

public class Checker {
  static void O(String newData){
    System.out.print(newData);
  }

  static void toInt(String newData){
    Integer.parseInt(newData);
  }

  public Checker(){

    Scanner sc = new Scanner(System.in);

    Transaction fenny = new Transaction("Fenny Oktaviani", 30000000, "123456", "4433220011");
    Transaction maulana = new Transaction("Maulana Sodiqin", 30000000, "110301", "4466110301");
    Transaction kirwan = new Transaction("Kirwan Herdiansyah", 30000000, "121314", "112233445");

    String fen = "4433220011";
    String mul = "4466110301";
    String kir = "112233445";

    O("Masukkan Pin Anda : ");
    String currentPin = sc.nextLine();

    int p = Integer.parseInt(currentPin);

    if (p == Integer.parseInt(fenny.getAccountPin())) {

      O("1.Cek Saldo\n2.Transfer\nSilahkan Pilih : ");
      String choices = sc.nextLine();
      int b = Integer.parseInt(choices);

      if (b == 1){
        O("Hallo " + fenny.getAccountHolder() + "\n");
        O("Sisa Saldo anda : " + fenny.getBallance());
      }

      else if (b == 2){
        O("Silahkan Masukkan Jumlah Uang yang ingin di Transfer : ");
        String amount = sc.nextLine();
        int c = Integer.parseInt(amount);

        O("\nSilahkan Masukkan No Rekening Tujuan : ");
        String select = sc.nextLine();

        if (select.equals(fen) && !select.equals(mul) && !select.equals(kir)){
          O("\nNomor rekening yang anda masukkan tidak valid!");

        }

        else if (select.equals(mul)) {
          O("Anda akan mentransfer sejumlah Rp." + amount + " Kepada " + maulana.getAccountHolder() + " Dengan Nomor Rekening " + mul + "\n");
          O("Transfer Berhasil!\n");
          fenny.transferBallance(c);
          O("Sisa Saldo anda adalah : Rp." + fenny.getBallance());
        }

        else if (select.equals(kir)) {
          O("Anda akan mentransfer sejumlah Rp." + amount + " Kepada " + kirwan.getAccountHolder() + " Dengan Nomor Rekening " + kir + "\n");
          O("Transfer Berhasil!\n");
          fenny.transferBallance(c);
          O("Sisa Saldo anda adalah : Rp." + fenny.getBallance());
        }

      }

    }

    else if (p == Integer.parseInt(maulana.getAccountPin())) {

        O("1.Cek Saldo\n2.Transfer\nSilahkan Pilih : ");
        String choices = sc.nextLine();
        int b = Integer.parseInt(choices);

        if (b == 1){
          O("Hallo " + maulana.getAccountHolder() + "\n");
          O("Sisa Saldo anda : " + maulana.getBallance());
        }

        else if (b == 2){
          O("Silahkan Masukkan Jumlah Uang yang ingin di Transfer : ");
          String amount = sc.nextLine();
          int c = Integer.parseInt(amount);

          O("\nSilahkan Masukkan No Rekening Tujuan : ");
          String select = sc.nextLine();

          if (select.equals(mul) && !select.equals(fen) && !select.equals(kir)){
            O("\nNomor rekening yang anda masukkan tidak valid!");

          }

          else if (select.equals(fen)) {
            O("Anda akan mentransfer sejumlah Rp." + amount + " Kepada " + fenny.getAccountHolder() + " Dengan Nomor Rekening " + fen + "\n");
            O("Transfer Berhasil!\n");
            maulana.transferBallance(c);
            O("Sisa Saldo anda adalah : Rp." + maulana.getBallance());
          }

          else if (select.equals(kir)) {
            O("Anda akan mentransfer sejumlah Rp." + amount + " Kepada " + kirwan.getAccountHolder() + " Dengan Nomor Rekening " + kir + "\n");
            O("Transfer Berhasil!\n");
            fenny.transferBallance(c);
            O("Sisa Saldo anda adalah : Rp." + fenny.getBallance());
          }
      }
    }

    else if (p == Integer.parseInt(kirwan.getAccountPin())) {

        O("1.Cek Saldo\n2.Transfer\nSilahkan Pilih : ");
        String choices = sc.nextLine();
        int b = Integer.parseInt(choices);

        if (b == 1){
          O("Hallo " + kirwan.getAccountHolder() + "\n");
          O("Sisa Saldo anda : " + kirwan.getBallance());
        }

        else if (b == 2){
          O("Silahkan Masukkan Jumlah Uang yang ingin di Transfer : ");
          String amount = sc.nextLine();
          int c = Integer.parseInt(amount);

          O("\nSilahkan Masukkan No Rekening Tujuan : ");
          String select = sc.nextLine();

          if (select.equals(kir) && !select.equals(fen) && !select.equals(mul)){
            O("\nNomor rekening yang anda masukkan tidak valid!");

          }

          else if (select.equals(fen)) {
            O("Anda akan mentransfer sejumlah Rp." + amount + " Kepada " + fenny.getAccountHolder() + " Dengan Nomor Rekening " + fen + "\n");
            O("Transfer Berhasil!\n");
            maulana.transferBallance(c);
            O("Sisa Saldo anda adalah : Rp." + maulana.getBallance());
          }

          else if (select.equals(mul)) {
            O("Anda akan mentransfer sejumlah Rp." + amount + " Kepada " + maulana.getAccountHolder() + " Dengan Nomor Rekening " + mul + "\n");
            O("Transfer Berhasil!\n");
            kirwan.transferBallance(c);
            O("Sisa Saldo anda adalah : Rp." + kirwan.getBallance());
          }
      }
    }

    else {
      O("Pin yang anda masukan salah!\nTerimakasih telah menggunakan ATM ini");
    }

  }
}
