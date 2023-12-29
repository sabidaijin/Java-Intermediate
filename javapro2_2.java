// 標準入力で友だちの名前を入力し、入力された名前をスタックに登録し、入力終了したら、登録された名前の一覧を出力するプログラム

// ※友だちの名前は「End」と入力されるまで入力を受け付けること


import java.io.*;
import java.util.ArrayDeque;
public class javapro2_2{
    public static void main (String[] args) {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayDeque <String> deque= new ArrayDeque<String>();
        
        // tryを使う範囲が難しい


        String input;
        try{
            while (true){
                // readlineを使う時は例外処理を必ずする
                input=reader.readLine();
                if (input.equals("End")) 
                    {break;} 
                    deque.add(input);
                }
            while(!deque.isEmpty())
                System.out.println(deque.pollLast());
            }
        catch(IOException e)
            { e.printStackTrace(); }}
        }
        
        

    
