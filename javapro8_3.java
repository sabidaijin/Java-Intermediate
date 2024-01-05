// ; // javapro8_3
// ; ある金額を、硬貨(1円, 5円, 10円, 50円, 100円, 500円)でおつりがないように支払うとき、できるだけ少ない枚数で支払うには、何円玉を何枚出せばよいかを計算するアルゴリズムを文章で記述し、あわせてプログラムを作成すること
// ; Ex. 720円の品物を買うときには、500円玉1枚, 100円玉2枚, 50円玉0枚, 10円玉2枚, 5円玉0枚, 1円玉0枚を出す

// ; 条件
// ; アルゴリズムを文章で書いてプログラムと一緒に提出すること(プログラム内に記述するか、別のファイルに記述するか、どちらでも良い)
// ; 支払う金額は標準入力で入力すること
// ; 金額は何円玉を何枚出すかを標準出力に出力すること(500円玉を何枚、100円玉を何枚、と列挙すること)
import java.util.*;
        // できるだけ少ない枚数で商品価格と一致させたい=できるだけ大きい貨幣を利用して支払いを行いたい
        // 商品価格を大きい貨幣で割っていくことを繰り返す
        // 最終的に商品価格%貨幣==0になったら終了する。
public class javapro8_3{
    public static void main(String[] args) {
        // 商品価格を入力する
        Scanner sc = new Scanner(System.in);
        int price=sc.nextInt();
        sc.close();        
        int i =0;

        int []coin ={500,100,50,5,1};
        int []result=new int[6];
        while(i<coin.length||price>0){
            // もしも割ることができたらカウントを一つプラスする
            if(price/coin[i]>0){
                result[i]++;
                price=price-coin[i];
            }
            else if(price<coin[i]){
                i++;}
        }
        for(i=0;i<coin.length;i++){
        System.out.println(coin[i]+"円:"+result[i]+"回");
        }
    }




    }
