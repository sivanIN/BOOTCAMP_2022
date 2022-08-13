package day4Assignment2;

public class Money {

	private String currency;
	private Float amount;
	
	public Money() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Money(String currency, Float amount) {
		super();
		this.currency = currency;
		this.amount = amount;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public Float getAmount() {
		return amount;
	}
	public void setAmount(Float amount) {
		this.amount = amount;
	}
	@Override
	public String toString() {
		return "Money [currency=" + currency + ", amount=" + amount + "]";
	}
	
	
}
