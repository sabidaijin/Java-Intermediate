// 以下の2つのファイルのデータについて、1つのファイルにまとめる処理

// 1つ目のファイル
// ファイルのありか(文字コード: Shift JIS): StudentData-1-shiftjis.csv
// ファイルのありか(文字コード: UTF-8): StudentData-1-utf8.csv
// 2つ目のファイル
// ファイルのありか(文字コード: Shift JIS): StudentData-2-shiftjis.csv
// ファイルのありか(文字コード: UTF-8): StudentData-2--utf8.csv
// ※ファイルは、「学籍番号,氏名,住所」の形式のcsvファイルであり、学籍番号でソートされている
import java.io.FileReader;
import java.io.IOException;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;


public class javapro9_3 {
    public static void main(String[] args) {
        try{
        // ファイルを読み込む
        FileReader file1 = new FileReader("StudentData-1-utf8.csv");
        CSVReader csv1 = new CSVReader(file1);

        // Open the second CSV file for reading
        FileReader file2 = new FileReader("StudentData-2-utf8.csv");
        CSVReader csv2 = new CSVReader(file2);
        
        
        String []data1=csv1.readNext();
        String []data2=csv2.readNext();
        String []fulldata=new String[10];
        int i=0;
        while(!data1[i].isEmpty()){
            
            // 読み込んだファイルの学籍番号をそれぞれ取得する
            // 取得したものを比べて小さい方をリストに代入する
            // 代入した方のファイルを一つ読み込む
            for(int c=0;c<data1[0].length();c++){
                if(data1[0].charAt(c)>data2[0].charAt(c)){
                    fulldata[i]=data2[0]+data2[1];
                    data2=csv2.readNext();
                    continue;
                }
                else if(data2[0].charAt(c)>data1[0].charAt(c)){
                    fulldata[i]=data1[0];
                    data1=csv1.readNext();
                    continue;
                }
        }
 
    }
    csv1.close();
    csv2.close();
    }catch(IOException e){
        System.out.println("CSVの読み取りに失敗しました");
    }catch(CsvValidationException e){
        System.out.println("CSVの読み取りに失敗しました");
    }
}
}




    

