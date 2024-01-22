public abstract class Customer extends User {
	int point;
	
	public abstract void order(String productID, int productAmount);
	public abstract void purchase(String productID, int productAmount); 
}
