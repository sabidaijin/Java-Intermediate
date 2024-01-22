// 下記のようなコンビニの商品・備品管理プログラム

// コンビニの商品は、大きく分けて食品と日用品である
// 食品と日用品は、商品名と定価、在庫の個数の情報を持っている
// 食品を販売するときは、税率0.08%で売値を計算する
// 日用品を販売するときは、税率0.1%で売値を計算する
// 備品は、備品名と在庫の個数の情報を持っている
// ※備品: 商品ではなく、店員や客がコンビニで利用する物品(主に消耗品とし、ボールペンやセロハンテープ、紙コップ、メモ用紙、紙袋など)

// プログラムの動作
// プログラムの機能: 1. 商品の販売, 2. 在庫の更新, 3. 在庫の表示
// 「1. 商品の販売」では、客が購入する商品を入力すると、売値を計算して標準出力で出力し、その商品の在庫を1つ減らす
// 「2. 在庫の更新」では、在庫を更新したい商品・備品を入力し、更新する個数(増えるのであればプラスの数、減るのであればマイナスの数)を入力すると、在庫が更新される
// 「3. 在庫の表示：では、在庫を表示したい商品・備品を選択し、現在の在庫を標準出力で出力する
// プログラムの開始時に、3つの機能のうちのどれを行うかを選択し、選択されたものに応じて、必要な商品や備品選択する
// 商品や備品の名前・値段・在庫数の情報は、プログラム内に記述して良い(食品・日用品・備品とも5種類ずつくらい)
// ※機能や商品・備品をどのように選択するかは特に指定しない(機能や商品・備品に番号を付けて扱っても良いし、名前を入力する形でも良いし、他でも良い)

// 条件
// 抽象クラス、インタフェース、オーバーライド、ポリモーフィズムのテクニックを使うこと(どこで使えるかも自分で考えること)
// どのような抽象クラス、具象クラス、インタフェース、メソッドやフィールド変数が必要かを自分で考えること
// Copyright (C) Junko Shirogane, Waseda University 2022, All rights reserved.

import java.util.HashMap;
import java.util.Scanner;

public class javapro13_4 {
    public static void main(String[] args) {
        // コンビニの商品クラス→継承した食品クラス、日用品クラス
        // 備品クラスは別に作る
        // それぞれに共通したメソッドである、売る、在庫を更新する、在庫を表示するをインターフェースで作る

        // データ構造はハッシュマップで作る
        // ハッシュマップのキーは商品名、値は商品クラスのオブジェクト
        HashMap <String,stock> items = new HashMap<String,stock>();
        foods apple = new foods();
        apple.price = 100;
        apple.amount = 10;
        items.put("apple",apple);

        dailygoods tissue = new dailygoods();
        tissue.price = 200;
        tissue.amount = 10;
        items.put("tissue",tissue);


        sundries ballpen= new sundries();
        ballpen.amount = 10;
        items.put("ballpen",ballpen);

        // 入力（どの機能を行うのか）
        Scanner sc = new Scanner(System.in);
        System.out.println("機能を選択してください");
        
        
        // その後、１だったら商品名を入力してもらう
        System.out.println("商品名を入力してください");
        // その商品の売値を計算して標準出力で出力し、その商品の在庫を1つ減らす
        items.get(input).sell(input,1);
        // ２だったら在庫名と個数を入力してもらう
        System.out.println("在庫名と増減数を入力してください");
        items.get(input).update(input,input2);
        // ３だったら在庫名を入力してもらう
        System.out.println("在庫名を入力してください");
        items.get(input).display(input);

    }}


/**
 * items
 */
public interface items {

    int price;
    abstract int sell(String itemname,int num);
    

}
class stock{
   
    String name;
    int amount;
    
    void update(String itemname,int num){
        amount += num;
        
    }
    int  display(String itemname){
        return amount;
    
    }

}
class foods extends stock implements items{
    int tax = 0.08;
    int sell(String itemname,int num){
        int sellprice = price*(1+tax/100)*num;
        stock -= num;
        return sellprice;
    }
}
class dailygoods extends stock implements items{
    int tax = 0.1;
    int sell(String itemname,int num){
        int sellprice = price*(1+tax/100)*num;
        stock -= num;
        return sellprice;
    }
}   
class sundries extends stock{
    
    }
}