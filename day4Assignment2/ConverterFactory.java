package day4Assignment2;

public class ConverterFactory {
	
	Money Source;
	
	public ConverterFactory(Money source) {
		super();
		Source = source;
	}

	public String convertedValue(String conveter) {
		double convert = 0;
		
		if(conveter.matches("EUR") && Source.getCurrency().matches("INR") || conveter.matches("INR") && Source.getCurrency().matches("EUR")) {
			RupeeEuroConverter rupeeEuroConverter = new RupeeEuroConverter();
			convert = rupeeEuroConverter.convert(Source);
			
			
		}
		else if(conveter.matches("USD") && Source.getCurrency().matches("INR") || conveter.matches("INR") && Source.getCurrency().matches("USD")) {
			RupeeDollarConverter rupeeDollarConverter = new RupeeDollarConverter();
			convert = rupeeDollarConverter.convert(Source);
			
			
		}
		else if(conveter.matches("EUR") && Source.getCurrency().matches("USD") || conveter.matches("USD") && Source.getCurrency().matches("EUR")) {
			DollarEuroConverter dollarEuroConverter = new DollarEuroConverter();
			convert = dollarEuroConverter.convert(Source);
			
			
		}
		return " " + convert;
	}

}
