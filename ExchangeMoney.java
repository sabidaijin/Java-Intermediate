//標準入力で日本円の金額とドルの為替レートを入力し、入力された日本円をドルに両替した時のドルの金額と余る日本円の金額を計算するプログラム

import java.io.*;

public class ExchangeMoney {
  public static void main(String[] args) {
    try {
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("日本円をドルに両替するときの金額計算をします。");
      System.out.print("日本円の金額を入力してください。> ");
      String yenStr = br.readLine(), dollerRateStr;
      int yen = 0, doller, yenChange;
      double dollerRate = 0;

      // 整数が入力されるまで入力しなおし
      // このループ文が終わった時、日本円のデータ(整数)が入力されていることを保証
      while (true) {
        try {
          yen = Integer.parseInt(yenStr);
          break;
        }
        catch(NumberFormatException nfe) {
          System.out.println("入力されたものは整数ではないので金額として扱えません。入力しなおしてください。");
          System.out.print("日本円の金額 >");
          yenStr = br.readLine();
        }
      }
      
      System.out.print("ドルの為替レートを入力してください。> ");
      dollerRateStr = br.readLine();

      // 小数が入力されるまで入力しなおし
      // このループ文が終わった時、為替レートのデータ(小数)が入力されていることを保証
      while (true) {
        try {
          dollerRate = Double.parseDouble(dollerRateStr);
          break;
        }
        catch(NumberFormatException nfe) {
          System.out.println("入力されたものは数値ではないので為替レートとして扱えません。入力しなおしてください。");
          System.out.print("ドルの為替レート >");
          dollerRateStr = br.readLine();
        }
      }
      // 小数部分の切り捨ては、Math クラスの floor メソッドが利用可能
      // floor メソッドの戻り値が double 型なので、int 型でキャスト
      doller = (int) Math.floor((double) yen / dollerRate);
      yenChange = yen - (int) Math.floor(doller * dollerRate);
      
      System.out.println("両替したドルの金額: " + doller + "ドル");
      System.out.println("日本円のおつり: " + yenChange + "円");
    }
    catch(IOException e) {
      System.out.println("標準入力ができません。");
    }
  }
}