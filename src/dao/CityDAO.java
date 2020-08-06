package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import model.City;
import utility.ConnectionManager;

public class CityDAO {
	public City getCityByName(String name) throws Exception {
		String sql = "select * from CITY2";
		PreparedStatement ps = ConnectionManager.getConnection().prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			if(name.equals(rs.getString("name"))) {
				System.out.println(rs.getLong(1) + " " + rs.getString(2));
			}
		}
		
		return null;
	}
	
	public void createCity (City city) throws Exception {
		Connection con = ConnectionManager.getConnection();
		String sql = "insert into CITY2(ID, NAME)VALUES(?,?)";
		PreparedStatement st = con.prepareStatement(sql);

		
		st.setLong(1, city.getCityld());
		st.setString(2, city.getCityName());
		
		st.executeUpdate();
		
		con.close();
	}
	
}
