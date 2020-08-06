package model;

public class City {
	Long cityld; 
	String cityName;
	
	//Constructor for City class
	public City(Long cityld, String cityName) {
		this.cityld = cityld;
		this.cityName = cityName;
	}
	
	//Getter and Setters for City class fields
	public Long getCityld() {
		return cityld;
	}

	public void setCityld(Long cityld) {
		this.cityld = cityld;
	}

	public String getCityName() {
		return cityName;
	}

	public void setCityName(String cityName) {
		this.cityName = cityName;
	}
}

