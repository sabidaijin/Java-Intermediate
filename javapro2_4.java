// キーを学籍番号、値を英語の試験の得点とするHashMapを用意し、標準入力から入力された学籍番号に対応する英語の得点を出力するプログラム

// 学籍番号は、「1XnnY1001～1XnnY1200」の範囲(200人分の学籍番号)をループ分で作成すること
// 得点は、「(int) (Math.random() * 100)」の式(乱数を発生させる式)の値とすること

import java.io.*;
import java.util.HashMap;
public class javapro2_4{
    public static void main (String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        HashMap <String,Double> testmap= new HashMap<String,Double>();
        Integer number=0;
        String student= "1XnnY";
        String studentnumber="";
        String input="";
        Double point=0.0;
        Integer i=0;

        try{


            for(i=0;i<200;i++){
                // 学籍番号は、「1XnnY1001～1XnnY1200」の範囲
                number = 1001+i;
                studentnumber=student+number;

                System.out.println(studentnumber);
                // テストの点数はランダムに
                point=Math.random()*100;
                // ここでhashmap(辞書)を作成
                testmap.put(studentnumber,point);
                System.out.println(studentnumber);}

            input=reader.readLine();
            // 入力に合わせて辞書からvalueを取り出す
            System.out.println(testmap.get(input));}

        catch(IOException e)
        { e.printStackTrace(); }
    
    }}