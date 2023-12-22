package AircWWIIAirp;

public class Aircraft {
private static long SrlNumCount = 200;
	protected double price;
	private double MaxHeight;
	private long SrlNum;
	
	
	public Aircraft(Aircraft arr) {
		
		price = 750000;
		MaxHeight = 35000;
		SrlNum = getNextSerialNumber();
	}
	
		public Aircraft(double pr, double mh) {
		price = pr;
		MaxHeight = mh;
		SrlNum = getNextSerialNumber();

	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double pr) {
		this.price = pr;
	}

	public double getMaxHeight() {
		return MaxHeight;
	}

	public void setMaxHeight(double mh) {
		MaxHeight = mh;
	}

	public long getNextSerialNumber() {
		return SrlNumCount++;
	
	}
	@Override
	public String toString() {
		return "Aircraft :\n Price = " + price + "\n Maximum Height = " + MaxHeight + "\n Serial Number = " + SrlNum;
	}
	
	
}
