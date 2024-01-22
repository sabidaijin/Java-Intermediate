
// ; 下記の2つのクラスを持つプログラムを作ること

// ; 1つ目のクラス: 友達の情報を管理し、挨拶をするクラス
// ; フィールド: 友達の名前
// ; 2つ目のクラス: 1つ目のクラスのオブジェクトを作成し、メソッドを呼び出すクラス
// ; 自分の名前と友達の名前を標準入力で入力
// ; 1つ目のクラスのオブジェクトを作成し、友達の名前を設定
// ; 「こんにちはxxさん! 私はyyです。よろしくお願いします。」と標準出力で出力(xxは友達の名前、yyは自分の名前)
// ; 条件
// ; 1つ目のクラスのフィールドは、カプセル化をすること
import java.util.Scanner;
public class javapro_12_1 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    String name = sc.nextLine();
    String friendname = sc.nextLine();
    frienddata fc = new frienddata();
    fc.setfriendname(friendname);
    fc.greet(name);
    sc.close();
    }}
    class frienddata{
        private String friendName;
        
        public void setfriendname(String friendName){
            this.friendName = friendName;
        }
        public String getfriendname(){
            return friendName;
        }
        public void greet(String name){
            System.out.println("こんにちは"+name+"さん! 私は"+friendName+"です。よろしくお願いします。");
        }
    }



