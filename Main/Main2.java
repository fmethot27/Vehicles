package Main;
import Ferry.Ferry;
import Metro.Metro;
import Monowheel.Monowheel;
import TrainTram.Train;
import TrainTram.Tram;
import WheeledTransport.WheeledTrans;
import AircWWIIAirp.Aircraft;
import AircWWIIAirp.WWIIAirplane;

public class Main2 {

	private static Object[] copyTheObjects(Object[] arr) {
	    
		Object[] copy = new Object[arr.length];
	    
		try {
	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] instanceof WheeledTrans) {
	                copy[i] = new WheeledTrans((WheeledTrans) arr[i]);
	            } else if (arr[i] instanceof Train) {
	                copy[i] = new Train((Train) arr[i]);
	            } else if (arr[i] instanceof Metro) {
	                copy[i] = new Metro((Metro) arr[i]);
	            } else if (arr[i] instanceof Tram) {
	                copy[i] = new Tram((Tram) arr[i]);
	            } else if (arr[i] instanceof Monowheel) {
	                copy[i] = new Monowheel((Monowheel) arr[i]);
	            } else if (arr[i] instanceof Ferry) {
	                copy[i] = new Ferry((Ferry) arr[i]);
	            } else if (arr[i] instanceof Aircraft) {
	                copy[i] = new Aircraft((Aircraft) arr[i]);
	            } else if (arr[i] instanceof WWIIAirplane) {
	                copy[i] = new WWIIAirplane((WWIIAirplane) arr[i]);
	            }
	        }
	    
		} catch (RuntimeException e) {
	        System.out.println("Exception happened during object copying: " + e.getMessage());
	        e.printStackTrace();
	    }
	    return copy;
	}
		
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Train T1 = new Train(60,"montreal","toronto");
		System.out.println(T1);
		
		Train T2 = new Train(70,"vancouver","toronto");
		System.out.println(T2);
		
		Train T3 = new Train(60,"montreal","toronto");
		System.out.println(T3);
		
		
		System.out.println();
		
		
		Metro M1 = new Metro(20);
		System.out.println(M1);
		
		Metro M2 = new Metro(30);
		System.out.println(M2);
	
		Metro M3 = new Metro(20);
		System.out.println(M3);
		
		
		System.out.println("=============");
		
		
		Tram Tr1 = new Tram(20);
		System.out.println(Tr1);
		
		Tram Tr2 = new Tram(20);
		System.out.println(Tr2);
	
		Tram Tr3 = new Tram(30);
		System.out.println(Tr3);
	
		
		System.out.println("=============");
		
		
		Ferry F1 = new Ferry(200.0, 200.0);
		System.out.println(F1);
		
		Ferry F2 = new Ferry(300.0, 300.0);
		System.out.println(F2);
		
		Ferry F3 = new Ferry(200.0, 300.0);
		System.out.println(F3);
		
		
		System.out.println("=============");
		
		
		Monowheel Mo1 = new Monowheel(1);
		System.out.println(Mo1);
		
		Monowheel Mo2 = new Monowheel(4);
		System.out.println(Mo2);
		
		Monowheel Mo3 = new Monowheel(1);
		System.out.println(Mo3);
		
		
		System.out.println("=============");
		
		
		Aircraft A1 = new Aircraft(20000, 20000);
		System.out.println(A1);
		
		Aircraft A2 = new Aircraft(30000,30000);
		System.out.println(A2);
		
		Aircraft A3 = new Aircraft(10000,20000);
		System.out.println(A3);
		
		
		System.out.println("=============");
		
		
		WWIIAirplane W1 = new WWIIAirplane(20000, 20000,true);
		System.out.println(W1);
		
		WWIIAirplane W2 = new WWIIAirplane(3000,3000, false);
		System.out.println(W2);
		
		WWIIAirplane W3 = new WWIIAirplane(20000, 20000,true);
		System.out.println(W3);
		
		Object [] arr = new Object[15];
		arr[0] = T1;
		arr[1] = T2;
		arr[2] = M1;
		arr[3] = M2;
		arr[4] = Tr1;
		arr[5] = Tr2;
		arr[6] = F1;
		arr[7] = F1;
		arr[8] = Mo1;
		arr[9] = Mo2;
		arr[10] = A1;
		arr[11] = A2;
		arr[12] = W1;
		arr[13] = W2;
		arr[14] = W3;
		
		Object[] copiedArray = copyTheObjects(arr);
		System.out.println("=============================================");
		System.out.println("original array");
		for (int i = 0; i < arr.length; i++) {
		    System.out.println(arr[i]);
		}
		System.out.println("=============================================");
		System.out.println("Copiec array");
		for (int i = 0; i < copiedArray.length; i++) {
		    System.out.println(copiedArray[i]);
		}
	}

}
