package collectiondemo1;

public class Place {
	private String cityName;
	private int population;
	private float temp;
	
	public Place(String cityName, int population, float temp) {
		super();
		this.cityName = cityName;
		this.population = population;
		this.temp = temp;
	}
	public String getCityName() {
		return cityName;
	}
	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
	public int getPopulation() {
		return population;
	}
	public void setPopulation(int population) {
		this.population = population;
	}
	public float getTemp() {
		return temp;
	}
	public void setTemp(float temp) {
		this.temp = temp;
	}
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return cityName+" "+population+" "+temp;
	}
}
