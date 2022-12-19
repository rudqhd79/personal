package project2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

import project2.SeatFee.BasePrice;
import project2.SeatFee.BeanBag;

public class EX2 {

	// HashMap은 배열이란게 존재하지 않기 때문에 LinkedHashMap을 써준다
	public static ArrayList<LinkedHashMap<String, Customer>> hashs = new ArrayList<>();
	public static LinkedHashMap<String, Customer> hash1 = new LinkedHashMap<>();
	public static LinkedHashMap<String, Customer> hash2 = new LinkedHashMap<>();
	public static LinkedHashMap<String, Customer> hash3 = new LinkedHashMap<>();
	public static LinkedHashMap<String, Customer> hash4 = new LinkedHashMap<>();
	public static LinkedHashMap<String, Customer> hash5 = new LinkedHashMap<>();

	/*--------------------------------------------------------------------------------------*/
	public static void main(String[] args) {

//		Scanner scan = new Scanner(System.in);
//		String str = scan.next();
		Customer customer = new Customer();

		/*--------------------------------------------------------------------------------------*/
		// hashmap을 이용하여 좌석을 만들자
		hashs.add(hash1);
		hashs.add(hash2);
		hashs.add(hash3);
		hashs.add(hash4);
		hashs.add(hash5);

		hash1.put("A1", customer);
		hash1.put("A2", customer);
		hash1.put("A3", customer);
		hash1.put("A4", customer);
		hash1.put("A5", customer);

		hash2.put("B1", customer);
		hash2.put("B2", customer);
		hash2.put("B3", customer);
		hash2.put("B4", customer);
		hash2.put("B5", customer);

		hash3.put("C1", customer);
		hash3.put("C2", customer);
		hash3.put("C3", customer);
		hash3.put("C4", customer);
		hash3.put("C5", customer);

		hash4.put("D1", customer);
		hash4.put("D2", customer);
		hash4.put("D3", customer);
		hash4.put("D4", customer);
		hash4.put("D5", customer);

		hash5.put("E1", customer);
		hash5.put("E2", customer);
		hash5.put("E3", customer);
		hash5.put("E4", customer);
		hash5.put("E5", customer);

		// 자리가 있으면 번호값
		// 자리가 없으면 "X"
//		for (HashMap<String, Customer> h : hashs) {
//			for (int i = 0; i < h.size(); i++) {
//					System.out.print("\t" + h.get(i) + " \t ");
//			}
//			System.out.println();
//		}

		/* for(Map.Entry<String, Customer> e : h.entrySet()) */
		/* Map.Entry<String, Customer> e =new Map.Entry<String, Customer>(); */
//		for (HashMap<String, Customer> h : hashs) {
//			for (int i = 0; i < h.size(); i++) {
//				System.out.print(" [  " + hashs.get(i).get(i) + "  ] " + "\t");
//			}
//			System.out.println();
//		}	
//		System.out.print(e.getValue() + "\t");

		for (LinkedHashMap<String, Customer> h : hashs) {
			for (Map.Entry<String, Customer> e : h.entrySet()) {
				System.out.print(e.getKey() + "\t");
			}
			System.out.println();
		}

		// 문자열로 입력받아 charAt()으로 하나씩 꺼내 쓰는 방법
		// 나머지와 나눗셈 연살을 통해 각 자릿수를 구하여 쓰는 방법
		// 문자열을 character 배열로 한자리씪 넣어주어 이용하는 방법

		/*
		 * BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		 * 
		 * int A = Integer.parseInt(br.readLine()); String B = br.readLine(); char[] b =
		 * B.toCharArray();
		 * 
		 * System.out.println(A * (b[2]-'0')); System.out.println(A * (b[1]-'0'));
		 * System.out.println(A * (b[0]-'0')); System.out.println(A *
		 * Integer.parseInt(B));
		 */
		/*--------------------------------------------------------------------------------------*/
	}

}
