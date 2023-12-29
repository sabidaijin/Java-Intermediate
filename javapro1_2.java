import java.io.*;
import java.util.ArrayList;
public class javapro1_2{
    public static void main (String[] args){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<Integer> inputs = new ArrayList<>();
        Integer sum=0;
        try{
            while(true){
                // 入力を受け取ってからintに変換/
                Integer input= Integer.valueOf(reader.readLine());
                    // 入力が0以下だったら終わり
                    if(input<0){
                        break;
                    }
                inputs.add(input);
                }
                
            for(int i=0;i<inputs.size();i++)
                {
                sum=sum+inputs.get(i);
                }
            System.out.println(inputs.size());

            System.out.println(sum);}

            catch (IOException e){}


            }}
    
    
            