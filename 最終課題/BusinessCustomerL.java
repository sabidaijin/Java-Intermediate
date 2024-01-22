public class BusinessCustomerL extends BusinessCustomer{
	public void purchase(int productPrice, int productAmount) {
		int totalPrice = productPrice * productAmount;
		int point = (int)(totalPrice * 0.08);
		this.point = point;
	}

}
