// javapro7_4_bublesort

// バブルソートのプログラム

// ※乱数で1000個の数を作成して、並べ替えをする数とすること

import java.util.ArrayList;
import java.util.Random;


public class javapro7_4_bublesort{
public static int cul(ArrayList<Integer> list,int k){
    // バブルソートをする関数
    // int k 入れ替えする回数
    // int temp　入れ替えるときに一時的に入れる変数
    if(k>=list.size()){
        return 0;
    }
    
    for(int i=0;i<list.size()-k;i++)
        if(i<list.size()){
            if(list.get(i)>list.get(i+1)){
                
                int tempo=list.get(i);
                list.set(i,list.get(i+1));
                list.set(i+1,tempo);}
            else{continue;}}

    return cul(list,k+1);

    
}


public static void main(String[] args) {
    Random r = new Random();
    ArrayList <Integer> list = new ArrayList<>();
    for(int i=0;i<1000;i++){
        int value;
        value=r.nextInt(Integer.MAX_VALUE);
        list.add(value);
    }
    cul(list,1);
    System.out.print(list);
    
}}


