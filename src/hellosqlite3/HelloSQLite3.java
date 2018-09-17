/*
* Simple code to connect to a SQLite3 database and print a single
* row from a table.
* 
* Based on http://www.sqlitetutorial.net/sqlite-java/sqlite-jdbc-driver/
*/

package hellosqlite3;
 
import java.sql.*;

public class HelloSQLite3 {
     /**
     * Connect to a sample database
     */
    public static void testCanConnect() {
        Connection conn = null;
        Statement stmt = null;
        try {
            // db parameters (assumes movies.db is in the same directory)
            String url = "jdbc:sqlite:movies.db";
            // create a connection to the database
            conn = DriverManager.getConnection(url);

            System.out.println("Connection to SQLite has been established.");

            // Ensure we can query the actors table
            stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM ACTORS LIMIT 1;");

            while ( rs.next() ) {

                String  name = rs.getString("name");

                System.out.println(String.format("Found %s", name));
            }
            
            rs.close();  
        } catch (SQLException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        testCanConnect();
    }
}