

import java.io.*;

public class javapro3_4 {
    public static void main (String[] args) {    
        try{
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("フォルダネームを入力してください");
            String folderName = input.readLine();

            File folder = new File(folderName);
            
            while(!folder.isDirectory()){
                System.out.println("正しいフォルダネームを入力してください");
                folderName = input.readLine();
                folder = new File(folderName);
            }

            File [] files=folder.listFiles();
            int i=0;
            int fileNum=files.length;

            for(i=0;i<fileNum;i++){
                if(files[i].getName().endsWith("txt")){
                    FileReader fr = new FileReader(files[i]);
                    BufferedReader filereader= new BufferedReader(fr);

                    System.out.println("-----ファイル"+files[i].getName()+"------");
                    while(filereader.ready()){
                        System.out.println(filereader.readLine());
                    }
                    filereader.close();
                    fr.close();

                }
            }
        }

            catch (IOException e){}
        }
    }