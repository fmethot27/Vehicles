package TrainTram;

import WheeledTransport.WheeledTrans;

public class Train extends WheeledTrans {
private static long SrlNumCount = 10000;
	private int NbOfVehicle;
	private String Start;
	private String Destination;
	private long SrlNum;

	public Train() {

		NbOfVehicle = 12;
		Start = "Montreal";
		Destination = "New York";
				
	}

	public Train(int nv, String St, String Dt) {
		NbOfVehicle = nv;
		Start = St;
		Destination = Dt;
		SrlNum = getNextSerialNumber();
	}

	public Train(Train t) {
		NbOfVehicle = t.NbOfVehicle;
		Start = t.Start;
		Destination = t.Destination;

	}

	public int getNbOfVehicle() {
		return NbOfVehicle;
	}

	public void setNbOfVehicle(int nv) {
		NbOfVehicle = nv;
	}

	public String getStart() {
		return Start;
	}

	public void setStart(String St) {
		Start = St;
	}

	public String getDestination() {
		return Destination;
	}

	public void setDestination(String Dt) {
		Destination = Dt;
	}
	public static long getNextSerialNumber() {
        return SrlNumCount++;
	}
        
        
	@Override
	public String toString() {
		return "Train : \n Number of Vehicle = " + NbOfVehicle + "\n Start = " + Start + "\n Destination = " + Destination + "\n Serial Number = "
				+ SrlNum + "\n Number of wheels = " + (getNbOfWheels()*NbOfVehicle) + "\n Maximum Speed = " + getMaxSpeed();
	}
}
	
