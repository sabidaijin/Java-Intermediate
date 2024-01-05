// javapro8_1
// 標準入力で入力された数が、数のリストの中に存在するかを、逐次探索で探索するプログラム

// ※数のリストは、乱数で作成した1000個の数とすること

import java.util.*;

public class javapro8_1_linearsearch {

    public static void main(String[] args) {
        // 標準入力を受け取る
        Scanner sc = new Scanner(System.in);

        int target = sc.nextInt();
        sc.close();
        // リストを作る
        int []randomlist= new int [10];
        Random random = new Random();
        for (int i=0;i<10;i++){
            randomlist[i]=random.nextInt(Integer.MAX_VALUE);
        }
        int result=linearsearch(randomlist,target,0);
        if(result>=0){
            System.out.println(randomlist[result]);
        }else{
            System.out.println("見つかりませんでした");
        }
    }  
    public static int linearsearch(int[]randomlist,int target,int i){
        // リストの中を逐次探索する関数を作る
        if(i==randomlist.length){
            return -1;
        }
        if(target==randomlist[i]){
            return i;
        }else{
            return linearsearch(randomlist,target,i+1);
            
        }

    }
}       

