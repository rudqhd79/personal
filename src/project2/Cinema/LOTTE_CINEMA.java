package project2.Cinema;

import project2.CinemaSeat.Seat;

public class LOTTE_CINEMA {
	public static final int SELECT_L = 1;
	public static final int ADULT = 12000;
	public static final int KID = 9000;

	// 좌석 메소드 만들기
	public static void showSeat() {
		Seat.arrangementLotte();
	}

}
