package TrainTram;

import Metro.Metro;

public class Tram extends Metro {
	private static long SrlNumCount = 55000;
	private int YearOfCreation;
	private long SrlNum;

	public Tram() {

		YearOfCreation = 1987;
	}

	public Tram(int yc) {
		YearOfCreation = yc;
		SrlNum = getNextSerialNumber();

	}

	public Tram(Tram t) {
		YearOfCreation = t.YearOfCreation;
	}

	public int getYearOfCreation() {
		return YearOfCreation;
	}

	public void setYearOfCreation(int yc) {
		YearOfCreation = yc;
	}

	public static long getNextSerialNumber() {
		return SrlNumCount++;
	}

	@Override
	public String toString() {
		return "Tram : \n Year of creation = " + YearOfCreation + "\n Number of stops = " + getNbOfStops()
				+ "\n Serial number = " + SrlNum + "\n Number of vehicle = " + getNbOfVehicle() + "\n Start = "
				+ getStart() + "\n Destination = " + getDestination() + "\n Number of wheels = "
				+ (getNbOfWheels() * getNbOfVehicle()) + "\n Maximum Speed = " + getMaxSpeed();
	}
}