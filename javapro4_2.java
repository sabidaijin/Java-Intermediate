import java.io.*;
import java.util.*;

public class javapro4_2{
    public static void main (String[] args) {   
        int point;
        int inputpoint;
        BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        Random rand = new Random();
        try{
        point =rand.nextInt(9)+1;
        System.out.println("1~10までであなたの予想を入力してね");
        inputpoint=Integer.parseInt(input.readLine());

        if(point == inputpoint){
            System.out.println("あたり");}
        else{
            System.out.println("はずれ");}
        
        System.out.println("正解は"+point+"でした！");
        }
        catch(IOException e){}}}