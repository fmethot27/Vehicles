package WheeledTransport;


public class WheeledTrans {
	private static long SrlNumCount = 1;
	private int NbOfWheels;
	private double MaxSpeed;
	private long SrlNum;

	public WheeledTrans(WheeledTrans arr) {

		NbOfWheels = 4;
		MaxSpeed = 300;

	}

	public WheeledTrans(int nw, double ms) {
		
		NbOfWheels = nw;
		MaxSpeed = ms;
		SrlNum = getNextSerialNumber();
	}

//	public WheeledTrans(WheeledTrans arr) {
	//	NbOfWheels = arr.NbOfWheels;
		//MaxSpeed = arr.MaxSpeed;
	//}

	public int getNbOfWheels() {
		return NbOfWheels;
	}

	public void setNbOfWheels(int nw) {
		NbOfWheels = nw;
	}

	public double getMaxSpeed() {
		return MaxSpeed;
	}

	public void setMaxSpeed(double ms) {
		MaxSpeed = ms;
	}
	 private static long getNextSerialNumber() {
	        return SrlNumCount++;
}
	
	@Override
	public String toString() {
		return "Number of wheels = " + NbOfWheels + "\n Maximum Speed = " + MaxSpeed + "\n Serial number = " + SrlNum;
	}

}
