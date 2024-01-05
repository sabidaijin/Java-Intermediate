// import java.io.*;
// import com.opencsv.CSVReader;
// import com.opencsv.exceptions.CsvException;

// public class javapro5_1 {
//     public static void main(String[] args) {
//         try {
//             Integer day1 = 0, day2 = 0, day3 = 0;
//             FileReader fr = new FileReader("Shopping-utf8.txt");
//             CSVReader reader = new CSVReader(fr);

//             FileWriter fw = new FileWriter("shoppingsum.txt");
//             BufferedWriter writer = new BufferedWriter(fw);
//             PrintWriter PrintW = new PrintWriter(writer);

//             String[] nextLine;
//             while ((nextLine = reader.readNext()) != null) {
//                 // CSVの各行を解析するロジックをここに追加
//             }

//             PrintW.println("1日目の支出額は" + day1 + "でした");
//             PrintW.println("2日目の支出額は" + day2 + "でした");
//             PrintW.println("3日目の支出額は" + day3 + "でした");
//             PrintW.flush();

//             reader.close();
//             fr.close();
//             PrintW.close();
//             writer.close();
//             fw.close();

//         } catch (IOException e) {
//             System.err.println("入力されたファイルは存在しません");
//         } catch (CsvException e) {
//             System.err.println("CSVファイルの読み込みに失敗しました");
//         }
//     }
// }
