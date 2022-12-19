package project2;

public class Customer {
	private Customer customerName; // 회원, 비회원 (둘 다 사용)
	private int customerId; // 회원 아이디 (회원 전용)
	private int customerNumber; // 회원, 비회원 (둘 다 사용하여 정보 찾을 수 있다)

//	private ArrayList<Seat> seat = new ArrayList<>();

	public Customer(Customer customerName, int customerId, int customerNumber) {
		this.customerName = customerName;
		this.customerId = customerId;
		this.customerNumber = customerNumber;
	}

	public Customer getCustomerName() {
		return this.customerName;
	}

	public int getCustomerId() {
		return customerId;
	}

	public int getCustomerNumber() {
		return customerNumber;
	}

}
