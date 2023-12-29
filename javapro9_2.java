// javapro9_2


// public class javapro9_2 {
//     public static void main(String[] args) {
        
//         csvを読み取る

//         csvの一行目を読み込む
//         sumのkeyに一行目の日付を,valueに計算結果をを入れる

//         もしもまだ読み込んでないのがあったら

//         csvの二行目を読み込む
//         その値の中で必要な部分を抽出する

//         dayに日付、salesに売り上げを代入する

//         もしkeyとdayが異なっていたら
//         sumを出力して

//         抽出した値をsumに代入する
        
//         そうでなければ
//         抽出した値をsumに加算する
    
        
//     }

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class javapro9_2 {
    public static void main(String[] args) {
        String csvFile = "BreadSale-utf8.csv"; // CSVファイルのパス
        Map<String, Integer> sum = new HashMap<>();

        try (BufferedReader br = new BufferedReader(new FileReader(csvFile))) {
            String line;
            br.readLine(); // 一行目（ヘッダー）をスキップ

            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                String day = values[0];
                int sales = Integer.parseInt(values[2])*Integer.parseInt(values[3]);

                // 日付が異なる場合、合計を出力して新しい日付のデータを開始
                if (!sum.containsKey(day)) {
                    if (!sum.isEmpty()) {
                        System.out.println(sum); // 現在の合計を出力
                    }
                    sum.clear();
                    sum.put(day, sales);
                } else {
                    // 同じ日付の場合、売上を加算
                    sum.put(day, sum.get(day) + sales);
                }
            }
            // 最後の日付の合計を出力
            if (!sum.isEmpty()) {
                System.out.println(sum);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
