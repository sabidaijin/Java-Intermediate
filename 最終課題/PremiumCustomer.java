public class PremiumCustomer extends PrivateCustomer {
	public void purchase(int productPrice, int productAmount) {
		int totalPrice = productPrice * productAmount;
		int point = (int)(totalPrice * 0.05);
		this.point = point;
	}
}
