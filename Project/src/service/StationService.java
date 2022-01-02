package service;

import entity.Station;
import entity.Bike;
import service.BikeService;
import property.Properties;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;


public class StationService {
	//add new station
	public boolean addNewStation(Station station) throws SQLException {
		Station st = new Station();
		Connection connection = Properties.getConnection();
		String query = "insert into station(name, location, image)" + "value(?, ?, ?)";
		PreparedStatement preparedStatement =  connection.prepareStatement(query, Statement.RETURN_GENERATED_KEYS);
		preparedStatement.setString(1, st.getName());
		preparedStatement.setString(2, st.getLocation());
	//	preparedStatement.setString(3,st.getImage()); can function rieng
		
		preparedStatement.executeUpdate();
		ResultSet res = preparedStatement.getGeneratedKeys();
		connection.close();
		return true;	
	}
	

	
	//get bike quantity
		public int getBikeQuantity() throws SQLException {
			return 0;
			
		}
	
	//get list station (not finished)
	public List getListAllStation() throws SQLException {
		Statement stm = Properties.getConnection().createStatement();
        ResultSet res = stm.executeQuery("select * from station");
        ArrayList medium = new ArrayList<>();
        while (res.next()) {
            Station station = new Station();
                station.setId(res.getInt("id"));
                station.setName(res.getString("name"));
                station.setLocation(res.getString("location"));
                station.setImage(res.getString("image"));
            medium.add(station);
        }
        return medium;
	}
	
	//not finished
	public Station getStationById(int id) throws SQLException {
		String sql = "SELECT * FROM station ;";
        Statement stm = Properties.getConnection().createStatement();
        ResultSet res = stm.executeQuery(sql);
        while(res.next()) {
        	Station station = new Station();
        	station.setId(res.getInt("id"));
            station.setName(res.getString("name"));
            station.setLocation(res.getString("location"));
            station.setImage(res.getString("image"));
        }
		return null;
	}


}
