package uebung8;

import java.util.ArrayList;

/**
 * Klasse zum Anlegen eines Floor-Objekts, das verschiede Flat-Objekte in 
 * einer ArrayList speichern kann.
 * 
 * @author Johannes Keller
 * @version 1.0
 */
public class Floor {
	private String floor;
	private double area;
	private double circulation;
	private double useableArea;
	private ArrayList <Flat> flatList;
	
	/**
	 * Kontruktor f�r neuen Floor mit �bergebener Fl�che
	 */
	public Floor(String floor, double area){
		this.floor = floor;
		this.area = area;
		this.circulation = area * 0.2;
		this.useableArea = area - circulation;
		flatList = new ArrayList<>();
	}
	
	/**
	 * Methode zum Anlegen eines neuen Flat-Objektes mit �bergebenen Parametern, das in der ArrayList flatList 
	 * eines Floor-Objekts gespeichert wird
	 * 
	 * @param user
	 * @param area 
	 * @param numberRooms 
	 * @return boolean 
	 */		
	public boolean createFlat(String user, double area, int numberRooms) {
		Flat flat = new Flat (user, area, numberRooms);
		if (checkArea(flat) && checkNumberRooms(flat)) {
			addFlat(flat);
			System.out.println("Flat created.");
			System.out.println("--------------------------------");
			return true;
		} else {
			System.out.println("Flat could not be created!");
			System.out.println("--------------------------------");
			return false;
		}		
	}
	
	/**
	 * Methode zum Hinzuf�gen eines Flat-Objektes zu einer ArrayList eines Floors
	 * @param user
	 * @param area 
	 * @param numberRooms 
	 * @return boolean 
	 */		
	public void addFlat(Flat flat) {
		this.flatList.add(flat);
	}
	
	/**
	 * Methode zum Hinzuf�gen eines Flat-Objektes zu einer ArrayList eines Floors
	 * @param user
	 * @param area 
	 * @param numberRooms 
	 * @return boolean 
	 */			
	public boolean deleteFlat(int id) {
		for (int i=0; i<flatList.size(); i++) {
			if ((flatList.get(i) != null)&& (flatList.get(i).getId()== id)) {
				flatList.remove(flatList.get(i));
				return true;
			}
		}
		System.out.println("Flat " + id + " does not exist!");
		return false;
	}

	/**
	 * Methode �berpr�ft, ob es in einem Floor-Objekt genug Fl�che f�r ein Flat-Objekt gibt
	 * @param flat
	 * @throws IllegalArgumentException
	 * @return boolean 
	 */		
	public boolean checkArea(Flat flat) {
		System.out.println("Creating flat no " + flat.getId());
		System.out.println(flat.getUser());
		System.out.println("Area left: " + getRestArea() + "m�");
		if (flat.getArea()< 0) throw new IllegalArgumentException("Flat area must be bigger than 0!");
		else {
			if (flat.getArea() <= this.getRestArea()) {
				return true;
			} else {
				System.out.println ("Not enough area left!");
				return false;
			}
		}
	}
	
	/**
	 * Methode �berpr�ft, ob ein Flat-Objekt genug Fl�che f�r die gew�nschte Anzahl an Zimmern besitzt
	 * @param flat
	 * @throws IllegalArgumentException
	 * @return boolean 
	 */		
	public boolean checkNumberRooms(Flat flat) {
		if (flat.getNumberRooms()<= 0) throw new IllegalArgumentException("Number of rooms must be at least 1!");
		else {
			System.out.println("Rooms possible: " + (int)((flat.getArea() - flat.getMinCircsize())/flat.getMinRoomsize()));
			if (flat.getNumberRooms() * flat.getMinRoomsize() + flat.getMinCircsize() <= flat.getArea()) {
				return true;
			} else {
				System.out.println ("Not enough area left!");
				return false;
			}
		}
	}
	
	/**
	 * Methode berechnet verf�gbare Restfl�che in einem Floor-Objekt (abz�glich Verkehrsfl�chen)
	 * @return flatArea 
	 */		
	public double getRestArea() {
		double flatArea = useableArea;
		for (int i=0; i<flatList.size(); i++) {
			flatArea = flatArea - flatList.get(i).getArea();
		}
		return flatArea;
	}
	
	/**
	 * Methode berechnet gesamte Nutzfl�che in einem Floor-Objekt (abz�glich Verkehrsfl�chen)
	 * @return useableArea 
	 */		
	public double getUseableArea() {
		return useableArea;
	}
	
	/**
	 * Methode gibt Kerndaten zur Floor-Objekt und enthaltenen Flat-Objekten zur Konsole aus
	 */		
	public void floorOutline() {
		StringBuilder sb = new StringBuilder();
		sb.append("Floor : " + floor + "\n");
		sb.append("Total area: " + area + "m�"+ "\n");
		sb.append("Circulation area: " + circulation + "m�"+ "\n");
		sb.append("Useable area: " + useableArea + "m�"+ "\n");
		sb.append("Area left: " + getRestArea() + "m�"+ "\n");
		sb.append("--------------------------------"+ "\n");
		for (int i=0; i<flatList.size(); i++) {
			sb.append(flatList.get(i).toString()+ "\n");
			sb.append("--------------------------------"+ "\n");
		}
		System.out.println(sb.toString());
	}
}
