package Modifiers;

public class TestBank {
	public static void main(String[] args) {
		Bank b = new Bank();
		
		b.addnewaccount();
		b.getDeposits();
		b.getwithdraw();
		b.checkbalance();
	}
}