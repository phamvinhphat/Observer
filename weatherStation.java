
public class weatherStation {
	public static void main(String[] args) {
		WeatherData weatherdata = new WeatherData();
		CurrentConditionsDisplay current = 
				new CurrentConditionsDisplay(weatherdata);
		
		weatherdata.setMeasurements(30, 65, 30.4f);
		weatherdata.setMeasurements(82, 70, 29.2f);
		weatherdata.setMeasurements(78, 90, 29.4f);
	}
}
