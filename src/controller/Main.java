package controller;

import utility.ConnectionManager;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.Connection;

import dao.CityDAO;
import dao.TeamDAO;
import model.Team;
import model.City;

public class Main{
	public static void main(String[] args) throws Exception {
		Connection con = null;
		try {
			con = ConnectionManager.getConnection();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		BufferedReader inp = new BufferedReader (new InputStreamReader(System.in));
		System.out.println("Enter the name of the team: ");
		String name = inp.readLine();
		System.out.println("Enter the name of the coach: ");
		String coach = inp.readLine();
		System.out.println("Enter the name of the city id: ");
		Long cityId = Long.parseLong(inp.readLine());
		System.out.println("Enter the name of the city name: ");
		String cityName = inp.readLine();
		
		City city = new City(cityId, cityName);
		Team team = new Team(name, coach, city);
		
		TeamDAO teamdao = new TeamDAO(); 
		teamdao.createTeam(team);
		
		CityDAO citydao = new CityDAO();
		citydao.createCity(city);
		
		System.out.println("The team and city details");
		teamdao.getTeamByName(team.getName());
		citydao.getCityByName(city.getCityName());
		
		con.close();
	}
}
