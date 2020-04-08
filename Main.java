import java.sql.SQLException;

public class Main {
    public static void main(String args[]) throws SQLException, ClassNotFoundException {
        Database myDB = Database.getInstance();
        ArtistController myArtC = new ArtistController(myDB);
        myArtC.create("Kendrick Lamar","USA");
        myArtC.findByName("Kendrick Lamar");

        AlbumController myAlbumC = new AlbumController(myDB);
        myAlbumC.create("ToPimpAButterfly",1,2015);
        myAlbumC.findByArtist(1);
    }
}
