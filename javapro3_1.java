import java.io.*;

public class javapro3_1 {
    public static void main (String[] args) {    
        try{
        FileReader fr = new FileReader("名前:山本ひき");
        BufferedReader reader = new BufferedReader(fr);
        fr.close();
        reader.close();}
        catch(IOException e){
            System.err.println("入力されたファイルは存在しません");
        }



}
}
