package project2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.HashMap;

import project2.SeatFee.BasePrice;
import project2.SeatFee.BeanBag;

public class EX {
	
	public static void main(String[] args) throws NumberFormatException, IOException {
		
		//세로 배열	(i는 세로, j는 가로)
/*		int arr[][] = new int[5][5];
		
		for (int i = 0; i < arr.length; i++) {
			int num = i +1;
				for(int j = 0; j < arr.length; j++) {
					arr[j][i] = num;
					num += 1;
					System.out.print(arr[j][i] + "\t");
				}
				System.out.println();
		}	*/
		
		//가로 배열 (i는 세로, j는 가로)
/*		int arr[][] = new int[7][7];
		
		for (int i = 0; i < arr.length; i++) {
			int num = 1;
			for (int j = 0; j <arr[i].length; j++) {
				arr[i][j] = num++;
				
				System.out.print(arr[i][j] +"\t");
			}
			System.out.println();
		}	*/
		
		//3차원 배열
/*		int arr[][][] = new int[3][5][5];
		int num = 1;
		
		for (int i = 0; i <arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				for(int k = 0; k < arr[i][j].length; k++) {
					System.out.print(num + "\t");
					num ++;
				}
				System.out.println();
			}
			System.out.println();
		}	*/
		
		//ArrayList 2차원 배열 생성
		
		//i(세로 생성)
/*		ArrayList<String> datas = new ArrayList<String>();
		
		//j(가로 생성)
		ArrayList<String> data1 = new ArrayList<String>();
		data1.add("1, 2, 3");
		data1.add("4");
		data1.add("5");
		
		ArrayList<String> data2 = new ArrayList<String>();
		data2.add("6");
		data2.add("7, 8");
		data2.add("9, 10");
		
		ArrayList<String> data3 = new ArrayList<String>();
		data3.add("11, 12, 13");
		data3.add("14");
		data3.add("15");
		
		datas.addAll(data1);
		datas.addAll(data2);
		datas.addAll(data3);
		
		System.out.println("everything:  " + datas.toString());
		System.out.println("everything:  " + datas.size());
		System.out.println("everything:  " + datas.indexOf(data1.get(1)));
		System.out.println("everything:  " + datas.set(5, null));	*/
		
/*		ArrayList<String> datas = new ArrayList<String>();
		
		//j(가로 생성)
		ArrayList<String> data1 = new ArrayList<String>();
		data1.add("1, 2, 3");
		data1.add("4");
		data1.add("5");
		
		ArrayList<String> data2 = new ArrayList<String>();
		data2.add("6");
		data2.add("7, 8");
		data2.add("9, 10");
		
		ArrayList<String> data3 = new ArrayList<String>();
		data3.add("11, 12, 13");
		data3.add("14");
		data3.add("15");
		
		datas.addAll(data1);
		datas.addAll(data2);
		datas.addAll(data3);
		
		System.out.println("everything:  " + dataxs.toString());
		System.out.println("everything:  " + datas.size());
		System.out.println("everything:  " + datas.indexOf(data1.get(1)));
		System.out.println("everything:  " + datas.set(5, null));	*/
		
		
//		for (int i = 1; i <datas.size(); i++) {
//			
//		}
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int A = Integer.parseInt(br.readLine());
		int B = Integer.parseInt(br.readLine());
		
		br.close();
		
		StringBuilder sb = new StringBuilder();
		
		sb.append(A * (B%10));
		sb.append('\n');

		sb.append(A * (B%10/100));
		sb.append('\n');
		
		sb.append(A * (B%100));
		sb.append('\n');
		
		sb.append(A * B);
		
		System.out.println(sb);
		
	}
}
