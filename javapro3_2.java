import java.io.*;

public class javapro3_2 {
    public static void main (String[] args) {    
        try{
        String str;
        String answer;
        int i=1;

        FileReader fr = new FileReader("名前：山本ひろき.txt");
        BufferedReader reader = new BufferedReader(fr);
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
        // まだ読み込めるのがある限り実行
        while(reader.ready()){
            // アンサーが０の時だけ出力をする
            System.out.println(i + "行目を出力しますか？（YES:0,NO:else）");
            answer = input.readLine();
            if("0".equals(answer)){
                str=reader.readLine();
                System.out.println(str);
            }
            i=i+1;
            }
        str=reader.readLine();
        System.out.println(str);
        
        fr.close();
        reader.close();
        
    
    }


        catch(IOException e){
            System.err.println("入力されたファイルは存在しません");
        }
    }
}





