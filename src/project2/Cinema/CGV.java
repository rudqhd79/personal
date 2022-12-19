package project2.Cinema;

import project2.CinemaSeat.Seat;

public class CGV{
	public static final int SELECT_C = 0;
	public static final int ADULT = 15000;
	public static final int KID = 10000;
	
	// 좌석 메소드 만들기
	public static void showSeat() {
		Seat.arrangementCGV();
	}
	
}
