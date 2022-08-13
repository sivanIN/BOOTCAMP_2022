package day4Assignment2;

public class RupeeDollarConverter implements Converter {
	
	

	
	Money source;

	@Override
	public double convert(Money source) {
		float amount = source.getAmount();
		double convertedAmount;
		if(source.getCurrency().matches("USD") ) {
			convertedAmount =  amount * 79.47;
		}else {
			convertedAmount =  amount / 79.47;
		}
		return convertedAmount;
	}

}
