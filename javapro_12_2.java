// import java.io.File;
// import java.io.FileReader;
// import java.io.Reader;

// import java.util.*;

// import com.opencsv.CSVReader;

// public class javapro_12_2 {
//     public static void main(String[] args) {
//         // 値はCSV形式で受け取る
//       // ファイルから CSV を読み込む
//     try{
//     File file = new File("BachelarMasterData-shiftjis.csv");
//     Reader reader = new FileReader(file); // File を Reader に変換
//     CSVReader csvReader = new CSVReader(reader);

//         // hashmapで値を保持する
//         HashMap <String,String> StudentData = new HashMap<String,String>();
        

//         // 読み込んだCSVデータを配列に格納し、学生の種類に応じてインスタンスを分ける
//         String[] data;
//         while ((data = csvReader.readNext()) != null) {
//         if (data[1].equals("1")) {
//             UniversityStudent us = new UniversityStudent();
//             us.setStudentId(data[0]);
//             us.id = data[1];
//             us.name = data[2];
//             StudentData.put(data[1], us.getStudentId());
//         } else if (data[1].equals("2")) {
//             GraduateStudent gs = new GraduateStudent();
//             gs.setStudentId(data[0]);
//             gs.id = data[1];
//             gs.name = data[2];
//             StudentData.put(data[1], gs.getStudentId());
//         } else {
//             System.out.println("学生の種類が不正です");
//         }
//     csvReader.close();  // CSV を閉じる
//     for(String key:StudentData.values()){
//         System.out.println(key);
//         System.out.println(StudentData.get(key));}
   
//         // ハッシュマップの中身を表示する
        
    
       
// }}
//     catch(Exception e){
//         System.out.println(e);
//     }
// }
        
//         // ハッシュマップの中身には学生の種別とオブジェクトを紐づけて入れる
//         // 例えば,1,UniversityStudentみたいな感じで・

 
    
    


// }
// abstract class Student{
//     protected String id;
//     protected String StudentId;
//     protected String name;
//     abstract void setStudentId(String id);
//     String getStudentId(){
//         return StudentId;
//     }
// }
// class UniversityStudent extends Student{
//     void setStudentId(String Studentid){
//         this.StudentId=Studentid;
//     }
    
// }

// class GraduateStudent extends Student{
//     void setStudentId(String Studentid){
//         this.StudentId="M"+Studentid;
//     }

// }