package model;



public class Team {
	String name;
	String coach;
	City city;
	
	//Constructors for the Team class
	public Team(String name, String coach, City city) {
		this.name = name;
		this.coach = coach;
		this.city = city;
	}
	
	//Getters and setters for Team class fields
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCoach() {
		return coach;
	}

	public void setCoach(String coach) {
		this.coach = coach;
	}

	public City getCity() {
		return city;
	}

	public void setCity(City city) {
		this.city = city;
	}
}
