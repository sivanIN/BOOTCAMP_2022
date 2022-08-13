package day4Assignment2;

public class DollarEuroConverter implements Converter {

	
	Money source;

	@Override
	public double convert(Money source) {
		float amount = source.getAmount();
		double convertedAmount;
		if(source.getCurrency().matches("EUR") ) {
			convertedAmount =  amount * 1.01;
		}else {
			convertedAmount =  amount / 1.01;
		}
		return convertedAmount;
	}
	
}
