import java.sql.*;

public class Database {
    public Connection con;
    public Statement stmt;
    public ResultSet rs;
    private Database(){ //private constructor for Singleton
    };
    private static Database database = new Database();
    public static Database getInstance(){
        return database;
    }
    public void init(){
        try{
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:MusicAlbums:1521:xe","dba_user","sql");
            stmt=con.createStatement();
           // rs=stmt.executeQuery("select * from PROFESORI");
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
    public void close() throws SQLException {
        con.close();
    }
}
