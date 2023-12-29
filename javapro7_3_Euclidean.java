// javapro7_3

// 標準入力で2つの整数を入力し、ユークリッドの互除法で最大公約数を求めるプログラム

// ユークリッドの互除法: 最大公約数を求めるアルゴリズム
// 2つの数のうち、大きい方を小さい方で割る
// 1. の余りが0でない場合、その余りと小さい方の数を改めて2つの数とし、1. へ戻る
// 1. の余りが0の場合、割った数が最大公約数となる

import java.util.Scanner;

public class javapro7_3_Euclidean{
public static int cul(int m,int n){
    int x;
    if(m>n){
        x=m%n;
        if(x==0)
            { return n;}
        else if(x>0){
            return cul(x,n);     
        }
    }else if(m<n){
        x=n%m;
        if(x==0)
            { return m;}
        else if(x>0){
             return cul(x,m);
        }
    }
    return m;

    }
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    try{
        int m=sc.nextInt();
        int n=sc.nextInt();
        sc.close();
        int result=cul(m,n);
        System.out.println(result);
                

    
    if (n<=0||m<=0){
        throw new IllegalArgumentException("入力エラー");
    }
    
    }catch(IllegalArgumentException e) {
        System.out.println(e.getMessage());
}}}