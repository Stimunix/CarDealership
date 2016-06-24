
public class UsedCar extends Car{
	private long miles;
	
	public UsedCar(String make, String model, int year, double price, long miles) {
		super(make, model, year, price);
		this.miles = miles;
	}
	
	public void setMiles(long miles) {
		this.miles = miles;
	}
	
	public long getMiles() {
		return miles;
	}
}
