package Tests;

import java.awt.List;
import java.util.ArrayList;

import org.junit.Test;

import junit.framework.TestCase;

public class BazeDeDateTest extends TestCase {

	@Test
	public void test() {
		 Hotel hotel1 = new Hotel("hotel1","Eforie Nord", "Strada Marii", 60);
		 Hotel hotel2= new Hotel("hotel2","Eforie sud", "Strada Oceanului", 34);
		 Hotel hotel3 = new Hotel("hotel3","Eforie est", "Strada Valurilor", 44);
		 Hotel hotel4 = new Hotel("hotel4","Eforie vest", "Strada Mea",15 );
		 Hotel hotel5  = new Hotel("hotel5","Eforie centru", "Strada Ta", 90);
		 
		 Oferta oferta1 = new Oferta( 500," nasol" ,1 );
		 Oferta oferta2 = new Oferta(450 ," e ok" ,2);
		 Oferta oferta3 = new Oferta(333 ,"bine man" , 3);
		 Oferta oferta4 = new Oferta(750, "acceptabil" , 4);
		 Oferta oferta5 = new Oferta(666 , "decent" , 5);
		 
		 oferta1.setHotel(hotel1);
		 oferta2.setHotel(hotel1);
		 oferta3.setHotel(hotel2);
		 oferta4.setHotel(hotel3);
		 oferta5.setHotel(hotel1);
		 
		 hotel1.setOferte(oferta1);
		 hotel1.setOferte(oferta2);
		 hotel1.setOferte(oferta5);
		 hotel2.setOferte(oferta3);
		 hotel3.setOferte(oferta4);
		 
		 BazaDeDate.getInstance().addOferts(oferta1,oferta2,oferta3,oferta4,oferta5);
		 
		 
		 ArrayList<Oferta> expectedResult = new ArrayList<Oferta>();
		 
		 expectedResult.add(oferta1);
		 expectedResult.add(oferta2);
		 expectedResult.add(oferta5);
		 ArrayList<Oferta> result = new ArrayList<Oferta>();
		 try {
			result = BazaDeDate.getInstance().getHotelOferts(hotel1);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		 assertEquals(expectedResult,result);
		 
		 
		 
		 
		 
	//	 getInstance().add
		 
	}

}
