package fi.agileo.carproject;
import fi.agileo.carproject.domain.*;
import fi.agileo.carproject.domain.Ajaja.Ajotapa;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        
        Ajaja ajaja1 = new Ajaja(null,"Mika", Ajotapa.AGGRESSIIVINEN);
		Ajaja ajaja2 = new Ajaja(null,"Manu",Ajotapa.RAUHALLINEN);
		Ajaja ajaja3 = new Ajaja(null,"Mikko",Ajotapa.TAVALLINEN);
		
		Moottori moottori1 = new Moottori(2,2,1);
		Moottori moottori2 = new Moottori(1,2,2);
		Moottori moottori3 = new Moottori(3,2,3);
		
		Auto auto1 = new Auto("BMW","532",230,moottori1,ajaja1);
		Auto auto2 = new Auto("VW","Golf",200,moottori2,ajaja2);
		Auto auto3 = new Auto("Toyota","Almera",210,moottori3,ajaja3);
		
	
			

		
	
		System.out.println(auto1.toString());
		System.out.println(auto2.toString());
		System.out.println(auto3.toString());
	
		
		
    }
}
