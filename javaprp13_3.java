// 授業の資料のBook、Magazine、Libraryクラスのプログラムを写して、標準出力の結果が本当に違うかどうか確認すること

// 配列の個数は5個程度で、プログラム内でタイトルや巻・号数を代入すること
// ファイル入力ではなく、プログラム内で値を入力して良い
// 配列の1つ1つの要素で、BookクラスのオブジェクトとMagazineクラスのオブジェクトを作り分けること
// Ex. 配列の0番目はBookクラス、1番目はMagazineクラス、2番目はBookクラス、...のように分けること


public class javaprp13_3 {
    // Libraryクラス（ファイル名とややこしいので変更）
    public static void main(String[] args) {
        Book entry[] = new Book[2];
        entry[0] = new Book();
        Magazine mag= new Magazine();
        mag.volume=1;
        mag.number=2;
        entry[1]=mag;
        entry[0].title="Java入門";
        entry[0].author="山田太郎";
        entry[1].title="magazine";
        entry[1].author="山田2郎";
        System.out.println(entry[0].getTitle());
        System.out.println(entry[1].getTitle());

    }
}

class Book{
    String title,author;
    public String getTitle(){
        return title;
    }
}
class Magazine extends Book{
    int volume;
    int number;

    public String getTitle(){
        String magTitle = title+volume+"-"+number;
        return magTitle;
    }
}

