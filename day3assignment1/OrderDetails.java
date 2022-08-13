package day3assignment1;

public class OrderDetails {

	public static void main(String[] args) {

		Order order = new Order("shankar", "hosing colony", "online", 101, "maggi" ,1,23);
		Order order2 = new Order("ramya", "Builtin colony", "cash", 102, "rice" ,1.5,25);
		System.out.println(order.toString()    +"\n"+ "Total Bill Amount:" + order.calculateBill(order.getUnit_price(), order.getQuantity()));
		System.out.println(order2.toString()    +"\n"+ "Total Bill Amount:" + order2.calculateBill(order2.getUnit_price(), order2.getQuantity()));



	}

}
