package Main;

import Ferry.Ferry;
import WheeledTransport.WheeledTrans;
import Metro.Metro;
import Monowheel.Monowheel;
import TrainTram.Train;
import TrainTram.Tram;
import AircWWIIAirp.Aircraft;
import AircWWIIAirp.WWIIAirplane;

public class Main {

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
			
			
			System.out.println();
			
			System.out.println("=============================================");
			//Test equality two objects from different classes
			System.out.println("Test equality W3 and A3");
			System.out.println(W3.equals(A3));
			
			//Test equality two objects from the same classes
			System.out.println("Test equality A1 and A3");
			System.out.println(A1.equals(A3));
			
			
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
			
			
			Object [] arr2 = new Object[15];
			
			arr2[0] = T1;
			arr2[1] = T2;
			arr2[2] = M1;
			arr2[3] = M2;
			arr2[4] = Tr1;
			arr2[5] = Tr2;
			arr2[6] = F1;
			arr2[7] = F1;
			arr2[8] = Mo1;
			arr2[9] = Mo2;
			arr2[10] = Mo3;
			arr2[11] = Tr3;
			//arr2[12] = W1;
			//arr2[13] = W2;
			//arr2[14] = W3;
			
			
			System.out.println("=============================================");
			System.out.println("findLeastAndMostExpensiveAircraft in arr");
			findLeastAndMostExpensiveAircraft(arr);
			
		}
		
		
		public static void findLeastAndMostExpensiveAircraft(Object[] arr) {
		    int count = 0;
		    double maxPrice = 0.0;
		    double minPrice = Double.MAX_VALUE;
		    Aircraft maxAc = null; 
		    Aircraft minAc = null;  

		    for (int i = 0; i < arr.length; i++) {
		        if (arr[i] instanceof Aircraft) {
		            count++;

		            Aircraft ac = (Aircraft) arr[i];

		            try {
		                double price = ac.getPrice();

		                if (price > maxPrice) {
		                    maxPrice = price;
		                    maxAc = ac;
		                }
		                if (price < minPrice) {
		                    minPrice = price;
		                    minAc = ac;
		                }
		            } catch (Exception e) {
		                // handle exceptions in using getPrice()
		                System.out.println("Error getting price for Aircraft: " + e.getMessage());
		                e.printStackTrace();
		            }
		        }
		    }

		    if (count == 1) {
		        System.out.println("The Only Aircraft found = " + maxAc);
		    } else if (count == 0) {
		        System.out.println("No Aircraft found");
		    } else {
		        System.out.println("The most expensive price aircraft = " + maxAc);
		        System.out.println("The least price aircraft = " + minAc);
		    }
		}
	}
