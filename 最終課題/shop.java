import java.util.HashMap;
import java.util.Scanner;

import com.opencsv.CSVReader;
import java.io.FileReader;

public class Shop {
    public static void main(String[] args) {
        HashMap<String, User> Userdata = new HashMap<String, User>();
        
        // データベースを作る
        // N」がノーマル客(個人客)、「P」がプレミアム客(個人客)、
        // 「G」が通常ビジネス客(ビジネス客)、「L」が大口ビジネス客(ビジネス客)である
        
        String[]data=new String[5];
        // csvからデータを読み込む
        String csvFile="ShoppingCustomer-shiftjis.csv";
        CSVReader reader = new CSVReader(new FileReader(csvFile));
        while ((data = reader.readNext()) != null) {
            String ID=data[0];
            String address=data[2];
            String kind=data[4];
            User user;

            switch (kind) {
                case "N":
                user = new NormalCustomer();
                    break;
                case "P":
                user = new PremiumCustomer();
                    break;
                case "G":
                user = new  BusinessCustomerG();       
                    break;
                case "L":
                user = new  BusinessCustomerL();   
                    break;
                case "M":
                    System.out.println("管理者用");
                user = new  Manager();  
                    break;                  
                default:
                    System.out.println(kind+"は不正な値です");
                    break;
            }
            if(kind!="M"){
                user.setPoint(Integer.parseInt(data[4]));}
            user.setID(ID);
            user.setAddress(address);
            Userdata.put(user.getID(),user);
        }
        reader.close();
        // 商品のデータベースを作る
        HashMap<String,Integer> itemsdata = new HashMap<String,Integer>();
        String csvFile="ShoppingItem-shiftjis.csv";
        CSVReader reader = new CSVReader(new FileReader(csvFile));
        while ((data = reader.readNext()) != null) {
            String itemID=data[0];
            Integer price= Integer.parseInt(data[2]);
            itemsdata.put(itemID,price);

        }


        System.out.println("ログインしてください");
        System.out.println("IDを入力してください");
        
        // ログイン処理
        
        Scanner sc = new Scanner(System.in);
        String ID0 = sc.nextLine();
        User user0 = Userdata.get(ID0);
        if(user0==null){
            System.out.println("IDが存在しません");
            sc.close();
            return;
        }
       else if (ID0.substring(0, 2).equals("AD")) {
            System.out.println("管理者としてログインしました");
            System.out.println("欲しい在庫名と在庫数を入力してください");

        }
        else{
            System.out.println("お客さんとしてログインしました");
            System.out.println("欲しい商品名と個数を入力してください");
        }
        String itemID = sc.nextLine();
        int amount = sc.nextInt();
        sc.close();
        // 商品を購入する処理


       
        user0.purchase(itemsdata.get(itemID),amount);
    
    }
}
