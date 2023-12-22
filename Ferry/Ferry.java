package Ferry;

public class Ferry {
	private static long SrlNumCount = 70000;
	private double MaxSpeed;
	private double MaxWeight;
	private long SrlNum;
	
	public Ferry() {
		
		MaxSpeed = 70;
		MaxWeight = 13000;

	}
	
	public Ferry(double ms, double mw) {
		MaxSpeed = ms;
		MaxWeight = mw;
		SrlNum = getNextSerialNumber();
	}
	
	public Ferry(Ferry f) {
		
		MaxSpeed = f.MaxSpeed;
		MaxWeight = f.MaxWeight;
	}

	public double getMaxSpeed() {
		return MaxSpeed;
	}

	public void setMaxSpeed(double ms) {
		MaxSpeed = ms;
	}

	public double getMaxWeight() {
		return MaxWeight;
	}

	public void setMaxWeight(double mw) {
		MaxWeight = mw;
	}
	  public static long getNextSerialNumber() {
	        return SrlNumCount++;
	  }
	@Override
	public String toString() {
		return "Maximum Speed = " + MaxSpeed + "\n Maximum Weight = " + MaxWeight + "\n Serial number = " + SrlNum;
	}
	
	
}
