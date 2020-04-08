import javax.xml.crypto.Data;
import java.sql.ResultSet;
import java.sql.SQLException;

public class AlbumController {
    private ResultSet myRs;
    private Database database;
    public AlbumController(Database database){
        this.database = database;
    }
    public void create(String name, int artistId, int releaseYear) throws SQLException {
        database.stmt.executeUpdate("insert into albums(id,name,artist_id,release_year) values(1,'" + name + "'," + artistId + "," + releaseYear + ")");
    }
    public void findByArtist(int artist_id) throws SQLException {
        myRs = database.stmt.executeQuery("select * from albums where artist_id=" + artist_id);
        while(myRs.next()){
            System.out.println(myRs.getString(1) + " " + myRs.getString(2) + " " + myRs.getString(4));
        }
    }
}
