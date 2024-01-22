public abstract class BusinessCustomer extends Customer{
	protected String CorporateName;
	protected int Businesstype;
	
	public void order(String productID, int productAmount) {
		System.out.println("法人宅急便");
		System.out.println(address);
		System.out.println(CorporateName + "御中");
		System.out.println("商品をお届け致します。ご購入ありがとうございます。");
		System.out.println("商品ID:"+product ID+" "+productAmount+"個")
	}
	
	public abstract void purchase(int productPrice, int productAmount);
}