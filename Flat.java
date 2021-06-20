package uebung8;

/**
 * Klasse zum Anlegen eines Flat-Objekts, das eine ID, einen Fl�cheninhalt, 
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
	 * Kontruktor f�r neues Flat-Objekt mit �bergabeparametern
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
	 * Methode gibt Kerndaten zur Flat-Objekt als String zur�ck
	 * @return String
	 */		
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("Flat ID: " + getId()+ "\n");
		sb.append("Owner: " + getUser()+ "\n");
		sb.append("Size: " + getArea() + " m�"+ "\n");
		sb.append("Number of rooms: " + getNumberRooms());
		return sb.toString();
	}
	
	/**
	 * Getter f�r area
	 * @return area
	 */	
	public double getArea() {
		return area;
	}
	/**
	 * Setter f�r area
	 * @param area
	 */	
	public void setArea(double area) {
		this.area = area;
	}
	
	/**
	 * Getter f�r numberRooms
	 * @return numberRooms
	 */	
	public int getNumberRooms() {
		return numberRooms;
	}
	
	/**
	 * Setter f�r numberRooms
	 * @param numberRooms
	 */
	public void setNumberRooms(int numberRooms) {
		this.numberRooms = numberRooms;
	}
	
	/**
	 * Getter f�r minRoomsize
	 * @param minRoomSize
	 */
	public double getMinRoomsize() {
		return minRoomSize;
	}
	
	/**
	 * Getter f�r minCircsize (minimale Erschlie�ungsfl�chen in einer Wohnung)
	 * @param minCircsize
	 */
	public double getMinCircsize() {
		return minCircSize;
	}
	
	/**
	 * Getter f�r user
	 * @return user
	 */
	public String getUser() {
		return user;
	}
	
	/**
	 * Setter f�r user
	 * @param user
	 */
	public void setUser(String user) {
		this.user = user;
	}
	
	/**
	 * Getter f�r id
	 * @return id
	 */
	public int getId() {
		return id;
	}
	
	/**
	 * Setter f�r idCounter (Z�hlt die IDs der Wohnungen automatisch hoch)
	 * @param idCounter
	 */
	public static void setIdCounter(int idCounter) {
		Flat.idCounter = idCounter;
	}
}
