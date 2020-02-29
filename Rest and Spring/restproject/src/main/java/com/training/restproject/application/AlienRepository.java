package com.training.restproject.application;

import java.util.ArrayList;
import java.util.List;
import java.sql.*;

public class AlienRepository {

	private static AlienRepository __AlienRepositoryObject = null;
	private List<Alien> alienList = new ArrayList<>();
	private Connection conn = null;
	private String url = "jdbc:oracle:thin:@localhost:1521:XE";
	private String username = "hr";
	private String password = "hr";
	
	private AlienRepository() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			this.conn = DriverManager.getConnection(url, username, password);
		} catch (SQLException e) {
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
	
	public Connection getConnection() {
		return conn;
	}
	
	public static AlienRepository getRepoInstance() throws SQLException {
		if(__AlienRepositoryObject == null)
			__AlienRepositoryObject = new AlienRepository();
		return __AlienRepositoryObject;
	}
	
	public void createAlien ( Alien alienObject ) {
		String sql = "insert into aliens(alienid, alienname, alienage) values(?,?,?)";
		try {
			PreparedStatement st = conn.prepareStatement(sql);
			st.setInt(1, alienObject.getAlienid());
			st.setString(2, alienObject.getAlienname());
			st.setInt(3, alienObject.getAlienage());
			
			st.executeUpdate();
		}
		catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	public void updateAlien ( Alien alienObject ) {
		String sql = "update aliens set alienname = ?, alienage = ? where alienid = ?";
		try {
			PreparedStatement st = conn.prepareStatement(sql);
			st.setString(1, alienObject.getAlienname());
			st.setInt(2, alienObject.getAlienage());
			st.setInt(3, alienObject.getAlienid());
			
			st.executeUpdate();
		}
		catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	public void deleteAlien ( int alienid ) {
		String sql = "delete from aliens where alienid='" + alienid + "'";
		try {
			conn.createStatement().executeQuery(sql);
		}
		catch (SQLException ex) {
			ex.printStackTrace();
		}
	}
	
	public List<Alien> getAliens() {
		String sql = "select alienid, alienname, alienage from aliens order by alienid";
		alienList.clear();
		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				Alien alienObject = new Alien();
				alienObject.setAlienid(rs.getInt(1));
				alienObject.setAlienname(rs.getString(2));
				alienObject.setAlienage(rs.getInt(3));
				
				alienList.add(alienObject);
			}
		}
		catch (SQLException ex) {
			ex.printStackTrace();
		}
		
		return alienList;
	}
	
	public Alien getAlien ( int alienid ) {
		String sql = "select * from aliens where alienid='" + alienid + "'";
		try {
			Statement st = conn.createStatement();
			ResultSet rs = st.executeQuery(sql);
			if(rs.next()) {
				Alien alienObject = new Alien();
				alienObject.setAlienid(rs.getInt(1));
				alienObject.setAlienname(rs.getString(2));
				alienObject.setAlienage(rs.getInt(3));
				
				return alienObject;
			}
		}
		catch (SQLException ex) {
			ex.printStackTrace();
		}
		return new Alien();
	}
}
