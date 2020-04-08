import javax.xml.crypto.Data;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ArtistController {
    private ResultSet myRs;
    private Database database;
    public ArtistController(Database database){
        this.database = database;
    }
    public void create(String name, String country) throws SQLException, ClassNotFoundException {
        database.stmt.executeUpdate("INSERT INTO artists (id,name,country) VALUES(1,'" + name + "','" + country + "')");
    }
    public void findByName(String name) throws SQLException {
       myRs = database.stmt.executeQuery("select * from artists where name='" + name + "'");
       while(myRs.next()){
           System.out.println(myRs.getString(1) + " " + myRs.getString(2) + " " + myRs.getString(3));
       }
    }
}
