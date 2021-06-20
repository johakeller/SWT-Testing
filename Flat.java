package uebung8;

/**
 * Klasse zum Anlegen eines Flat-Objekts, das eine ID, einen Flächeninhalt, 
 * einen User und eine Anzahl an Zimmern als Attribute besitzt
 * 
 * @author Johannes Keller
 * @version 1.0
 */
public class Flat {
	
	private static int idCounter = 0;
	private int id;
	private double area;
	private String user;
	private int numberRooms;
	private final double minRoomSize = 10.00; 
	private final double minCircSize = 5.00; 
	
	/**
	 * Kontruktor für neues Flat-Objekt mit Übergabeparametern
	 * @param user
	 * @param area
	 * @param numberRooms
	 * 
	 */
	public Flat(String user, double area, int numberRooms){
		setIdCounter(idCounter + 1);
		this.id = idCounter;
		this.setArea(area);
		this.setUser(user);
		this.setNumberRooms(numberRooms);	
	}
	
	/**
	 * Methode gibt Kerndaten zur Flat-Objekt als String zurück
	 * @return String
	 */		
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Flat ID: " + getId()+ "\n");
		sb.append("Owner: " + getUser()+ "\n");
		sb.append("Size: " + getArea() + " m²"+ "\n");
		sb.append("Number of rooms: " + getNumberRooms());
		return sb.toString();
	}
	
	/**
	 * Getter für area
	 * @return area
	 */	
	public double getArea() {
		return area;
	}
	/**
	 * Setter für area
	 * @param area
	 */	
	public void setArea(double area) {
		this.area = area;
	}
	
	/**
	 * Getter für numberRooms
	 * @return numberRooms
	 */	
	public int getNumberRooms() {
		return numberRooms;
	}
	
	/**
	 * Setter für numberRooms
	 * @param numberRooms
	 */
	public void setNumberRooms(int numberRooms) {
		this.numberRooms = numberRooms;
	}
	
	/**
	 * Getter für minRoomsize
	 * @param minRoomSize
	 */
	public double getMinRoomsize() {
		return minRoomSize;
	}
	
	/**
	 * Getter für minCircsize (minimale Erschließungsflächen in einer Wohnung)
	 * @param minCircsize
	 */
	public double getMinCircsize() {
		return minCircSize;
	}
	
	/**
	 * Getter für user
	 * @return user
	 */
	public String getUser() {
		return user;
	}
	
	/**
	 * Setter für user
	 * @param user
	 */
	public void setUser(String user) {
		this.user = user;
	}
	
	/**
	 * Getter für id
	 * @return id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Setter für idCounter (Zählt die IDs der Wohnungen automatisch hoch)
	 * @param idCounter
	 */
	public static void setIdCounter(int idCounter) {
		Flat.idCounter = idCounter;
	}
}
