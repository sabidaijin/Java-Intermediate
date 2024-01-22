public abstract class PrivateCustomer extends Customer {
	String name;
	
	public void order(String productID, int productAmount) {
		System.out.println("個別配達便");
		System.out.println(address);
		System.out.println(name + "様");
		System.out.println("\n商品をお届け致します。ご購入ありがとうございます。");
	}
	
	public abstract void purchase(String productID, int productAmount);
}
