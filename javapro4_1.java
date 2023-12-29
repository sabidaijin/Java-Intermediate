import java.io.*;

public class javapro4_1{
    public static void main (String[] args) {   
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        int JM=0;
        double AMint=0.0;
        double rate=0.0;
        double AM=0.0;
        double re=0.0;
        try{
        System.out.println("計算したい日本円を入力してください");
        JM=Integer.parseInt(input.readLine());
        System.out.println("ドルの為替レートを入力してください");
        rate=Double.parseDouble(input.readLine());
        AM=JM*rate;
        AMint=Math.floor(AM);
        re=(AM-AMint)/rate;

        System.out.println("ドルにした場合"+AMint+"ドルと"+re+"円になりました");
        }catch (IOException e) {
            e.printStackTrace();
        }
        
    }}
