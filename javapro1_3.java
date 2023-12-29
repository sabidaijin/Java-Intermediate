// 早稲田太郎さんの時間割表を出力するプログラム(標準入力は不要)

// 各曜日・時限に履修している授業を表す多次元配列(添え字が2つ)を用意し、1つ目の添え字で時限(1限～5限)、2つ目の添え字で曜日(月曜日～金曜日)を表すものとする
// 曜日には0～4の番号をつけ、多次元配列の2つ目の添え字とする
// ループ文を使い、以下のように出力する
// 科目はどんなものでも良い(小・中・高の科目でも大学の科目でも)
// 下記の表の2限のように、曜日と科目がきれいに並んでいなくても良い(曜日の位置と科目名の位置がそろっていなくてOK)
// 授業がない曜日・時限があっても良い(授業がない曜日・時限は「なし」とすること)
// 月曜	火曜	水曜	木曜	金曜
// 1限	国語	数学	なし	社会	英語
// 2限 Javaプログラミング 英語読解 数理解析 近代史 経済学
// ...以下略...

public class javapro1_3{
    public static void main (String[] args) {
        
        String[][] lesson = {
            {"月曜","火曜","水曜","木曜","金曜"},
            {"1限","国語","数学","なし","社会","英語"},
            {"2限", "Javaプログラミング", "英語読解","数理解析", "近代史"},
            {"月曜","aa","ff","Aa","aaf"},
            {"2限", "Javaプログaラミング", "英語読解","数理解析", "近代史"}
        };

        
        
    for (int i = 0; i < 5; i++) {
        for (int j = 0; j < 5; j++) {
            System.out.print(lesson[i][j]+"");}
        System.out.println();

}}}

