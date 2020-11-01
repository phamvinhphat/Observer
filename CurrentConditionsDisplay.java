



import java.util.Observable;
import java.util.Observer;

public class CurrentConditionsDisplay implements ObServer, DisphayElement {
	private float temperature;
	private float humidity;
	 Subject weatherData;
	
	public CurrentConditionsDisplay(Subject weatherData) {
		this.weatherData = weatherData;
		weatherData.registerObserver((Observer) this);
	}

	@Override
	public void display() {
		// TODO Auto-generated method stub
		System.out.println("Current condutions:"+temperature
				+"F degrees and"+humidity + "% humidity");
		
	}

	@Override
	public void update(float temp, float humidity, float pressure) {
		// TODO Auto-generated method stub
		this.temperature = temperature;
		this.humidity = humidity;
		display();
	}
	






	

}
