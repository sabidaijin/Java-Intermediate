public class BusinessCustomerG extends BusinessCustomer{
	public void purchase(int productPrice, int productAmount) {
		int totalPrice = productPrice * productAmount;
		int point = (int)(totalPrice * 0.02);
		this.point = point;
	}
}
