package Monowheel;

import WheeledTransport.WheeledTrans;

public class Monowheel extends WheeledTrans {
	
	private static long SrlNumCount = 55000;
	private double MaxWeight;
	private long SrlNum;

	public Monowheel() {
		MaxWeight = 300;

	}

	public Monowheel(double d) {
		MaxWeight = d;
		SrlNum = getNextSerialNumber();
	}

	public Monowheel(Monowheel m) {
		MaxWeight = m.MaxWeight;

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
		return "Monowheel : \n Maximum weight= " + MaxWeight + "\n Serial Number = " + SrlNum + "\n Number of wheels = "
				+ getNbOfWheels() + "\n Maximum speed = " + getMaxSpeed();
	}

}
