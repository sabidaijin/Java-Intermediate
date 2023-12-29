// shoppingからデータをダウンロードして、一文字目の数字でスイッチする。/**
// 書き込みは別ファイルなのでwirteも使う



import java.io.*;

public class javapro3_3 {
    public static void main (String[] args) {    
        try{
        

        String data;
        Integer day1=0,day2=0,day3=0;

        FileReader fr = new FileReader("Shopping-utf8.txt");
        BufferedReader reader = new BufferedReader(fr);
        
        FileWriter fw= new FileWriter("shoppingsum.txt");
        BufferedWriter writer= new BufferedWriter(fw);
        PrintWriter PrintW=new PrintWriter(writer);

        // まだ読み込めるのがある限り実行
        while(reader.ready()){
            
            data = reader.readLine();
            System.out.println(data);
            int index= data.indexOf(':'); 
            System.out.println(index);
            System.out.println(data.substring(0,2));
            switch(data.substring(0,1)){
                case "1":
                System.out.println(data.substring(index+1));
                day1=day1+Integer.parseInt(data.substring(index+1));
                break;

                case "2":
                System.out.println(data.substring(index+1));
                day2=day2+Integer.parseInt(data.substring(index+1));
                break;

                case "3":
                System.out.println(data.substring(index+1));
                day3=day3+Integer.parseInt(data.substring(index+1));
                break;
            

            }
        }
        PrintW.println("1日目の支出額は"+day1+"でした");
        PrintW.println("2日目の支出額は"+day2+"でした");
        PrintW.println("3日目の支出額は"+day3+"でした");
        PrintW.flush();



        reader.close();
        fr.close();
        
        
        PrintW.close();
        writer.close();
        fw.close();


    
    }


        catch(IOException e){
            System.err.println("入力されたファイルは存在しません");
        }
    }
}





