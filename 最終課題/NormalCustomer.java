public class NormalCustomer extends PrivateCustomer {
	public void purchase(int productPrice, int productAmount) {
		int totalPrice = productPrice * productAmount;
		int point = (int)(totalPrice * 0.01);
		this.point = point;
	}
}
