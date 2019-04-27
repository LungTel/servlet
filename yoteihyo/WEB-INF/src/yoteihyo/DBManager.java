package yoteihyo;

import java.sql.Connection;
import java.sql.DriverManager;


public class DBManager  {

	public static Connection getConnection() {
		try {
			//org.mysql.jdbc.Driver
		    Class.forName("com.mysql.jdbc.Driver");
		    Connection con = DriverManager.getConnection(
		    		"jdbc:mysql://localhost/yoteihyo", "root", "");
			
			/** windows env
		    Class.forName("org.hsqldb.jdbcDriver");
		    Connection con = DriverManager.getConnection(
		    		"jdbc:hsqldb:hsql://localhost", "sa", "");
		    **/
			/** main env
		    Class.forName("org.mariadb.jdbc.Driver");
		    Connection con = DriverManager.getConnection(
		    		"jdbc:mariadb://localhost/yoteihyo", "XXXXXXXXXXXID", "passXXXXXXXXXX");
		    **/
			
		    return con;
		} catch (Exception e) {
			throw new IllegalStateException(e);
		}
	}


	public static void main(String[] args) throws Exception {
        Connection con = getConnection();
        System.out.println("con=" + con);
        con.close();
    }

}
