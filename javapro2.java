// 標準入力から数を1つ入力し、その数に対応する曜日を出力するプログラム

// 曜日の名前にArrayListを利用すること
// 月曜日から日曜日までに、0から6までの番号をつけて、曜日の名前をArrayListに登録する
// 標準入力から数を1つ入力し、その数を7で割った余りを求める
// その余りに対応する曜日を標準出力に出力する
// ※条件分岐やループ文を使わずにプログラムを作ること

import java.io.*;
import java.util.ArrayList;
public class javapro2{
    public static void main (String[] args)throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        
        Integer input=Integer.valueOf(reader.readLine());
        int j =input% 7;
        ArrayList<String> daylist = new ArrayList<>();
        daylist.add("月");
        daylist.add("火");
        daylist.add("水");
        daylist.add("木");
        daylist.add("金");
        daylist.add("土");
        daylist.add("日");
        // 条件分岐を使わずともinputをそのままindexとして扱えば問題ない
        System.out.println(daylist.get(j));
          
    }}

    
