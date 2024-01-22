public class Manager extends User{

public void order(String productID, int productAmount){
	System.out.println("【在庫配達便】");
	System.out.println(address);
	System.out.println("早稲田ショッピング株式会社御中");
	System.out.println("");
	System.out.println("ご注文頂いた在庫商品をお届けします。ご利用ありがとうございます。");
	System.out.println("商品ID:"+productID+" "+productAmount+"個")
	}
	
}