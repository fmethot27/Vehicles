package AircWWIIAirp;

import java.util.Objects;

public class WWIIAirplane extends Aircraft {

	private boolean twinEngine;
	//twin engine (boolean type), which indicates whether or not the plane has a twin engine
	private long SN;
	private long SNCounter = 80000;
	
	public WWIIAirplane() {//default constructor
		super();
	}

	
    public WWIIAirplane(double price, double maximumElevation,boolean twinEngine) {//parameterized 
        
    	super(price,maximumElevation);
    	
    	this.twinEngine = twinEngine;
        
        SN = SNCounter;
		
		SNCounter ++;  
    }
    
    public WWIIAirplane(WWIIAirplane A) {// copy constructor 
    	
    	WWIIAirplane A1 = new WWIIAirplane ();
    	
    	A1.twinEngine = A.twinEngine;
    }
    
    
    public long getSN() {
		return SN;
    }


	public boolean isTwinEngine() {
		return twinEngine;
	}


	public void setTwinEngine(boolean twinEngine) {
		this.twinEngine = twinEngine;
	}
    
	public long getNextSerialNumber() {
		return SN;
	}


	@Override
	public String toString() {
		return super.toString() + "TwinEngine = " + twinEngine;
	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(twinEngine);
		return result;
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		WWIIAirplane other = (WWIIAirplane) obj;
		return twinEngine == other.twinEngine;
	}
    
}
