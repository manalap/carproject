package fi.agileo.carproject.domain;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.fail;
import static org.mockito.Mockito.when;

import fi.agileo.carproject.domain.Ajaja.Ajotapa;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class AjajaTest {
	
	@Mock
	Auto mockAuto;
	
	@Before
	public void setUp(){
		
		when(mockAuto.laskeNopeus()).thenReturn(100.00);
//		when(mockProfiili.muunnaHinta(anyDouble())).thenReturn(100.0);		
//		when(mockProfiili.muunnaHinta(200.0)).thenReturn(200.0);		
//		when(mockProfiili.muunnaHinta(300.0)).thenReturn(300.0);		
		
	}
	

	@SuppressWarnings("deprecation")
	@Test
	public void test() {
		
	Ajaja testattava = new Ajaja(mockAuto, "spede spele",Ajotapa.TAVALLINEN);
	
	assertEquals(0.00001 ,testattava.aja(0.000),0.00001);
	assertEquals( 35,testattava.aja(0.5),0.0001);
	assertEquals( 70,testattava.aja(1.0),0.0002);
	assertEquals( 0.0,testattava.aja(-1.0),0.03);
	assertEquals( 385,testattava.aja(5.5),0.009);
	
		
		
	}
	
	@Test
	public void testAjajaAgg() {
		
		Ajaja testattava = new Ajaja(mockAuto, "spede spele",Ajotapa.AGGRESSIIVINEN);
		
		assertEquals(0.00 ,testattava.aja(0.000),0.00001);
		assertEquals( 50,testattava.aja(0.5),0.0001);
		assertEquals( 100,testattava.aja(1.0),0.0002);
		assertEquals( 0.0,testattava.aja(-1.0),0.03);
		assertEquals( 50050,testattava.aja(500.5),0.009);
		
			
			
		}
		
		
		

	
	
	

}
