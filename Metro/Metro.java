package Metro;

import TrainTram.Train;

public class Metro extends Train {
	private static long SrlNumCount = 25000;
	private int NbOfStops;
	private long SrlNum;

	public Metro() {
		NbOfStops = 12;

	}

	public Metro(int ns) {
		NbOfStops = ns;
		SrlNum = getNextSerialNumber();
	}

	public Metro(Metro m) {
		NbOfStops = m.NbOfStops;
	}

	public int getNbOfStops() {
		return NbOfStops;
	}

	public void setNbOfStops(int nbOfStops) {
		NbOfStops = nbOfStops;
	}
	 public static long getNextSerialNumber() {
	        return SrlNumCount++;
}
	
	@Override
	public String toString() {
		return "Metro : \n Number of stops = " + NbOfStops + "\n Serial number = " + SrlNum + "\n Number of vehicles = "
				+ getNbOfVehicle() + "\n Start = " + getStart() + "\n Destination = " + getDestination()
				+ "\n Serial number = " + SrlNum + "\n Number of wheels = " + (getNbOfWheels()*getNbOfVehicle()) + "\n Maximum Speed = "
				+ getMaxSpeed();
	}

}
