import java.io.*;

public class javapro1{
    public static void main (String[] args)throws IOException{
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String input= reader.readLine();

        String branch = input.substring(0, 1);
        int year = Integer.valueOf(input.substring(1,3));
        String personalNumber=input.substring(4);
        
        // 支店の出力です
    
        switch(branch){
            case "A":
                System.out.println("入会した支店:"+branch+"支店");
            break;

            case "B":
                System.out.println("入会した支店:" +branch+"支店");
            break;
            
            case "C":
                System.out.println("個人の番号:"+branch+"支店");
            break;
                
        }
        // 入会年の処理
        if (year > 23){
            System.out.println("入会した年:"+"19"+year);

        }else{
             System.out.println("入会した年:"+"20"+year);
        }
        int index=0;

        // 個人番号のかしら文字が0にならないように調整する
        // パーソナルナンバーのsubstring(0)が0でなくなるまで一文字ずつ消していく
        while(index<personalNumber.length() && personalNumber.substring(0)!="0"){
            personalNumber=personalNumber.substring(1);
            index+=1;
        }
        System.out.println("個人の番号:"+personalNumber);


        

    }
}



// // 入力A190001
// 一つ目の値をスイッチで分けて入会した店舗を出す
// 二つ目、三つ目の値を受け取って19+もしくは20+で西暦を出す

// 後ろ四つを個人番号として出力する