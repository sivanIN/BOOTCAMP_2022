package day2;

public class MobileDetails {
	
	public static void main(String[] args) {
		Mobile mobile = new Mobile("Poco", "M3", 16, "5px", 6);
		
		System.out.println(mobile);
		mobile.setModel("M4");
		System.out.println(mobile);
		System.out.println(mobile.getModel());
	}

}
