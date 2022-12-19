package project2.Cinema;

import java.util.ArrayList;

import project2.Customer;

//싱글톤
public class TicketingMachine {
	public double seatFee;
	TicketingMachine ticket;
	
	// 영화관에 티켓머신은 하나뿐
	// ------------영화관---------------
	CGV cgv;
	LOTTE_CINEMA lotte;
	MEGA_BOX mega;
	// ------------영화관---------------
	
	private ArrayList<Customer> customer = new ArrayList<>(); // String으로 만들것

	public TicketingMachine() {
	}

	// 생성자 생성 메소드
	public TicketingMachine getTicketingMachine() {
		if (ticket == null) {
			ticket = new TicketingMachine();
		}
		return ticket;
	}

	// adult는 어른 명 수, kid는 아이 명 수,
	// choice는 CGV, LOTTE_CINEMA, MEGA_BOX 중 택 1
	// answer는 열(A: BeanBag, B, C: Economy, D: Couple, E: VIP)선택
	// 열마다 적용되는 가격의 수가 다르기 때문에 넣어주었다
	public int calcSeatFee(int adult, int kid, String answer, int choiceCinema) {
		double adultResult = 0;
		double kidResult = 0;
		
		if (answer.equals("A")) {
			this.seatFee = 1.5;
		} else if (answer.equals("B") || answer.equals("C")) {
			this.seatFee = 1;
		} else if (answer.equals("D")) {
			this.seatFee = 1.2;
		} else if (answer.equals("E")) {
			this.seatFee = 2;
		} else {
			System.out.println("잘못 입력 하셨습니다." + "\n" + "다시 입력해주세요.");
		}
		
		if (choiceCinema == 1) {
			adultResult = CGV.ADULT * adult * this.seatFee;
			kidResult = CGV.KID * kid * this.seatFee;
		} else if (choiceCinema == 2) {
			adultResult = LOTTE_CINEMA.ADULT * adult * this.seatFee;
			kidResult = LOTTE_CINEMA.KID * kid * this.seatFee;
		} else if (choiceCinema == 3) {
			adultResult = MEGA_BOX.ADULT * adult * this.seatFee;
			kidResult = MEGA_BOX.KID * adult * this.seatFee;
		} else {
			System.out.println("잘못 입력 하셨습니다." + "\n" + "다시 입력해주세요.");
		}
		return (int) (adultResult + kidResult);
	}

	public ArrayList<Customer> getCustomer() {
		return customer;
	}

	public void setCustomer(ArrayList<Customer> customer) {
		this.customer = customer;
	}

}
