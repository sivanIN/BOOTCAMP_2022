package day4Assignment2;

public class RupeeEuroConverter implements Converter  {
	
	Money source;

	@Override
	public double convert(Money source) {
		float amount = source.getAmount();
		double convertedAmount;
		if(source.getCurrency().matches("EUR") ) {
			convertedAmount =  amount * 79.98;
		}else {
			convertedAmount =  amount / 79.98;
		}
		return convertedAmount;
	}
	
	

}
