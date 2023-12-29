// javapro7_2

// ある正の整数がnのときの値がf(n)の場合に、下記の条件を満たすf(n)の値を求めるプログラム

// nの値が1のときf(1) = 1
// nの値が2のときf(2) = 1
// nの値が3以上のときf(n) = f(n-2) + f(n-1)
// 条件
// nの値は標準入力で入力すること
// 再帰を使うこと

import java.util.Scanner;


public class javapro7_2_fibonacci{
public static int cul(int n){
    // 3未満と3以上で分けて３以上の時は
    if(n<3){
        return 1;}
    else{
        
        return cul(n-1)+cul(n-2);
    }

    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    int n=sc.nextInt();
    sc.close();
    
    int result=cul(n);
    System.out.println(result);
    

}
}