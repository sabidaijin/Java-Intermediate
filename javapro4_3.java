import java.io.*;
import java.util.*;

public class javapro4_3{
    public static void main (String[] args) {   
        
        int value;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        Random rand = new Random();
        ArrayList<Integer> randomList = new ArrayList<>();
        

        try{
            for(int i=0;i<1000;i++){
                randomList.add(rand.nextInt(1000));
            Collections.sort(randomList);}

        System.out.println("探したい数字を入力して");
        value=Integer.valueOf(input.readLine());
        
        if (Collections.binarySearch(randomList,value)==-1){
            System.out.println("ないです");
        } 
        else{
            System.out.println("あります");
        }

        }
    catch(IOException e ){}}}
