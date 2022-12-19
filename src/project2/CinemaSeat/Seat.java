package project2.CinemaSeat;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

import project2.Customer;

public class Seat {
	static final String ROW = "━━━━━━━━━━━━━━━━━━━━━━━━━━━━━━";
	static final String VERTICAL = "│";
	// ----------------------------------------------------------------------
	public static ArrayList<LinkedHashMap<String, Customer>> hashs = new ArrayList<>();
	public static LinkedHashMap<String, Customer> hash1 = new LinkedHashMap<>();
	public static LinkedHashMap<String, Customer> hash2 = new LinkedHashMap<>();
	public static LinkedHashMap<String, Customer> hash3 = new LinkedHashMap<>();
	public static LinkedHashMap<String, Customer> hash4 = new LinkedHashMap<>();
	public static LinkedHashMap<String, Customer> hash5 = new LinkedHashMap<>();
	public static LinkedHashMap<String, Customer> hash6 = new LinkedHashMap<>();
	public static LinkedHashMap<String, Customer> hash7 = new LinkedHashMap<>();
	// ----------------------------------------------------------------------
	public static Customer customer;

	static StringBuffer buffer = new StringBuffer();
	// ----------------------------------------------------------------------

	//CGV의 좌석을 띄운다
	public static void arrangementCGV() {
		hashs.add(hash1);
		hashs.add(hash2);
		hashs.add(hash3);
		hashs.add(hash4);
		hashs.add(hash5);
		hashs.add(hash6);
		hashs.add(hash7);

		hash1.put("A1", customer.getCustomerName());
		hash1.put("A2", customer.getCustomerName());
		hash1.put("A3", customer.getCustomerName());
		hash1.put("A4", customer.getCustomerName());
		hash1.put("A5", customer.getCustomerName());
		hash1.put("A6", customer.getCustomerName());
		hash1.put("A7", customer.getCustomerName());

		hash2.put("B1", customer.getCustomerName());
		hash2.put("B2", customer.getCustomerName());
		hash2.put("B3", customer.getCustomerName());
		hash2.put("B4", customer.getCustomerName());
		hash2.put("B5", customer.getCustomerName());
		hash2.put("B6", customer.getCustomerName());
		hash2.put("B7", customer.getCustomerName());

		hash3.put("C1", customer.getCustomerName());
		hash3.put("C2", customer.getCustomerName());
		hash3.put("C3", customer.getCustomerName());
		hash3.put("C4", customer.getCustomerName());
		hash3.put("C5", customer.getCustomerName());
		hash3.put("C6", customer.getCustomerName());
		hash3.put("C7", customer.getCustomerName());

		hash4.put("D1", customer.getCustomerName());
		hash4.put("D2", customer.getCustomerName());
		hash4.put("D3", customer.getCustomerName());
		hash4.put("D4", customer.getCustomerName());
		hash4.put("D5", customer.getCustomerName());
		hash4.put("D6", customer.getCustomerName());
		hash4.put("D7", customer.getCustomerName());

		hash5.put("E1", customer.getCustomerName());
		hash5.put("E2", customer.getCustomerName());
		hash5.put("E3", customer.getCustomerName());
		hash5.put("E4", customer.getCustomerName());
		hash5.put("E5", customer.getCustomerName());
		hash5.put("E6", customer.getCustomerName());
		hash5.put("E7", customer.getCustomerName());

		hash6.put("F1", customer.getCustomerName());
		hash6.put("F2", customer.getCustomerName());
		hash6.put("F3", customer.getCustomerName());
		hash6.put("F4", customer.getCustomerName());
		hash6.put("F5", customer.getCustomerName());
		hash6.put("F6", customer.getCustomerName());
		hash6.put("F7", customer.getCustomerName());

		hash7.put("G1", customer.getCustomerName());
		hash7.put("G2", customer.getCustomerName());
		hash7.put("G3", customer.getCustomerName());
		hash7.put("G4", customer.getCustomerName());
		hash7.put("G5", customer.getCustomerName());
		hash7.put("G6", customer.getCustomerName());
		hash7.put("G7", customer.getCustomerName());

		arrangementSeat();
	}
	
	//LOTTE_CINEMA의 좌석을 띄운다
	public static void arrangementLotte() {
		hashs.add(hash1);
		hashs.add(hash2);
		hashs.add(hash3);
		hashs.add(hash4);
		hashs.add(hash5);
		hashs.add(hash6);

		hash1.put("A1", customer.getCustomerName());
		hash1.put("A2", customer.getCustomerName());
		hash1.put("A3", customer.getCustomerName());
		hash1.put("A4", customer.getCustomerName());
		hash1.put("A5", customer.getCustomerName());
		hash1.put("A6", customer.getCustomerName());

		hash2.put("B1", customer.getCustomerName());
		hash2.put("B2", customer.getCustomerName());
		hash2.put("B3", customer.getCustomerName());
		hash2.put("B4", customer.getCustomerName());
		hash2.put("B5", customer.getCustomerName());
		hash2.put("B6", customer.getCustomerName());

		hash3.put("C1", customer.getCustomerName());
		hash3.put("C2", customer.getCustomerName());
		hash3.put("C3", customer.getCustomerName());
		hash3.put("C4", customer.getCustomerName());
		hash3.put("C5", customer.getCustomerName());
		hash3.put("C6", customer.getCustomerName());

		hash4.put("D1", customer.getCustomerName());
		hash4.put("D2", customer.getCustomerName());
		hash4.put("D3", customer.getCustomerName());
		hash4.put("D4", customer.getCustomerName());
		hash4.put("D5", customer.getCustomerName());
		hash4.put("D6", customer.getCustomerName());

		hash5.put("E1", customer.getCustomerName());
		hash5.put("E2", customer.getCustomerName());
		hash5.put("E3", customer.getCustomerName());
		hash5.put("E4", customer.getCustomerName());
		hash5.put("E5", customer.getCustomerName());
		hash5.put("E6", customer.getCustomerName());

		hash6.put("F1", customer.getCustomerName());
		hash6.put("F2", customer.getCustomerName());
		hash6.put("F3", customer.getCustomerName());
		hash6.put("F4", customer.getCustomerName());
		hash6.put("F5", customer.getCustomerName());
		hash6.put("F6", customer.getCustomerName());

		arrangementSeat();
	}
	
	//MEGA_BOX의 좌석을 띄운다
	public static void arrangementMega() {
		hashs.add(hash1);
		hashs.add(hash2);
		hashs.add(hash3);
		hashs.add(hash4);
		hashs.add(hash5);

		hash1.put("A1", customer.getCustomerName());
		hash1.put("A2", customer.getCustomerName());
		hash1.put("A3", customer.getCustomerName());
		hash1.put("A4", customer.getCustomerName());
		hash1.put("A5", customer.getCustomerName());

		hash2.put("B1", customer.getCustomerName());
		hash2.put("B2", customer.getCustomerName());
		hash2.put("B3", customer.getCustomerName());
		hash2.put("B4", customer.getCustomerName());
		hash2.put("B5", customer.getCustomerName());

		hash3.put("C1", customer.getCustomerName());
		hash3.put("C2", customer.getCustomerName());
		hash3.put("C3", customer.getCustomerName());
		hash3.put("C4", customer.getCustomerName());
		hash3.put("C5", customer.getCustomerName());

		hash4.put("D1", customer.getCustomerName());
		hash4.put("D2", customer.getCustomerName());
		hash4.put("D3", customer.getCustomerName());
		hash4.put("D4", customer.getCustomerName());
		hash4.put("D5", customer.getCustomerName());

		hash5.put("E1", customer.getCustomerName());
		hash5.put("E2", customer.getCustomerName());
		hash5.put("E3", customer.getCustomerName());
		hash5.put("E4", customer.getCustomerName());
		hash5.put("E5", customer.getCustomerName());

		hash6.put("F1", customer.getCustomerName());
		hash6.put("F2", customer.getCustomerName());
		hash6.put("F3", customer.getCustomerName());
		hash6.put("F4", customer.getCustomerName());
		hash6.put("F5", customer.getCustomerName());

		hash7.put("G1", customer.getCustomerName());
		hash7.put("G2", customer.getCustomerName());
		hash7.put("G3", customer.getCustomerName());
		hash7.put("G4", customer.getCustomerName());
		hash7.put("G5", customer.getCustomerName());

		arrangementSeat();
	}

	public static void arrangementSeat() {
		for (LinkedHashMap<String, Customer> hash : hashs) {
			for (Map.Entry<String, Customer> entry : hash.entrySet()) {
					System.out.print(Seat.VERTICAL + entry.getKey() + Seat.buffer.append("\t" + Seat.VERTICAL));
					System.out.println(Seat.ROW);
				}
			}
			System.out.println();
		}
}
