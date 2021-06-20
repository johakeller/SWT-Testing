 
package uebung8;
/**
 * Testklasse zum Überprüfen der grundlegenden Funktionalität von Flat und Floor
 * 
 * @author Johannes Keller
 * @version 1.0
 */
public class Controller {
	
	/**
	 * Main-Methode
	 */	
	public static void main (String[] args) {
		Floor gr = new Floor("Groundlevel", 250.00);
		gr.createFlat("Tim Blocksberg", 110.50, 5);
		gr.createFlat("Regina Brodthardt", 60, 3);
		gr.createFlat("Miriam Maispflod", 29.50, 2);
		gr.createFlat("Banjomin Ruffler", 29.50, 2);
		gr.floorOutline();		
	}
	

}
