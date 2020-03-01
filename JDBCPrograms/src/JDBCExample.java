import java.sql.*;
public class JDBCExample {

	// JDBC driver name and database URL
	 static final String JDBC_DRIVER = "oracle.jdbc.driver.OracleDriver";  
	 static final String DB_URL = "jdbc:oracle:thin:@localhost:1521:XE";

	 //  Database credentials
	 static final String USER = "hr";
	 static final String PASS = "hr";
	 
	public static void main(String[] args) {
		Connection conn = null;
		Statement stmt = null;
		try{
		    //STEP 2: Register JDBC driver
		    Class.forName(JDBC_DRIVER);

		    //STEP 3: Open a connection
		    System.out.println("Connecting to a selected database...");
		    conn = DriverManager.getConnection(DB_URL, USER, PASS);
		    System.out.println("Connected database successfully...");
		    
		    //STEP 4: Execute a query
		    System.out.println("Creating statement...");
		    stmt = conn.createStatement();

		    String sql = "SELECT * from aliens";
		    ResultSet rs = stmt.executeQuery(sql);
		    //STEP 5: Extract data from result set
		    while(rs.next()){
		       //Retrieve by column name
		       System.out.print("ID: " + rs.getInt("alienid"));
		       System.out.print(", Age: " + rs.getInt("alienage"));
		       System.out.print(", Name: " + rs.getString("alienname"));
		       System.out.println();
		    }
		    rs.close();
		    System.out.println("Connection closed");
		 }catch(SQLException se){
		    //Handle errors for JDBC
		    se.printStackTrace();
		 }catch(Exception e){
		    //Handle errors for Class.forName
		    e.printStackTrace();
		 }finally{
		    //finally block used to close resources
		    try{
		       if(stmt!=null)
		          conn.close();
		    }catch(SQLException se){
		    }// do nothing
		    try{
		       if(conn!=null)
		          conn.close();
		    }catch(SQLException se){
		       se.printStackTrace();
		    }//end finally try
		 }//end try

	}

}

