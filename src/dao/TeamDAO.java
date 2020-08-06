package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import model.City;
import model.Team;
import utility.ConnectionManager;

public class TeamDAO {
	public void createTeam(Team team) throws Exception {
		
		Connection con = ConnectionManager.getConnection();
		String sql = "insert into TEAM2(name, coach, city)VALUES(?,?,?)";
		PreparedStatement st = con.prepareStatement(sql);

		
		st.setString(1, team.getName() );
		st.setString(2, team.getCoach());
		st.setString(3, team.getCity().getCityName());
		
		st.executeUpdate();
		
		con.close();
	}

	public Team getTeamByName(String name) throws Exception {
		String sql = "select * from TEAM2";
		PreparedStatement ps = ConnectionManager.getConnection().prepareStatement(sql);
		ResultSet rs = ps.executeQuery();
		
		while(rs.next()) {
			if(name.equals(rs.getString("name"))) {
				System.out.println(rs.getString(1) + " " + rs.getString(2) + " " + rs.getString(3));
			}
		}
		
		return null;
	}

}
