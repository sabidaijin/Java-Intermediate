// javapro8_2

// 標準入力で入力された文字列が、文章の中に存在するかを、ナイーブ法で検索するプログラム

// ※検索対象の文章を、あらかじめ準備しておくこと(自分で作成しても、何かをコピーしたものでも、どちらでも良い)
import java.util.*;

public class javapro8_2_bruteforce{
    public static void main(String[] args) {
    // 標準入力で文字列を受け取る
    Scanner sc = new Scanner(System.in);
    String pattern =sc.nextLine();
    sc.close();
    
    // 検索対象の文字列を作成する
    String text="こんにちは山本ひろき。できることは早めにやるがモットーです";
    // 検索処理をつくる
    int j=0;
    int i=0;
    while(true){
        // 終了条件①:パターンの最後の文字列が一致している時
        if (pattern.charAt(j)==text.charAt(i) && j==pattern.length()-1){
            System.out.println("発見");
            break;
        }
        // 終了条件②：探索値iがtextの最後まで来た時
        if(i==text.length()-1){
            System.out.println("発見できず");
            break;
        }
        // 合致時処理
        if(pattern.charAt(j)==text.charAt(i)){
            j++;
            i++;
        }
        // 非合致時処理
        if(pattern.charAt(j)!=text.charAt(i)){
            i=i-j+1;
            j=0;
            
        }
    }
}

}