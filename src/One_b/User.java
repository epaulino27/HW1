package One_b;
import java.util.ArrayList;
import java.util.List;

public class User {
    String username;
    List<Playlist> playlists = new ArrayList<Playlist>();

    User(String username){
        this.username = username;
    }

    public Playlist createPlaylist(String name, String type){
        switch(type){
            case "rock": case "Rock":
                System.out.println("Adding rock playlist now.");
                return new RockPlaylist(name);
            case "pop": case "Pop":
                System.out.println("Adding pop playlist now.");
                return new PopPlaylist(name);
            case "jazz": case "Jazz":
                System.out.println("Adding jazz playlist now.");
                return new JazzPlaylist(name);
            default:
                System.out.println("Adding playlist now.");
                return new Playlist();
        }
    }

    public void deletePlaylist(Playlist playlist){
        System.out.println("Deleting playlist now.");
        playlists.remove(playlist);
        return;
    }

    public void addSongToPlaylist(Playlist playlist, Song song){
        System.out.println("Adding song to playlist now.");
        playlist.addSong(song);
    }

    public void removeSongFromPlaylist(Playlist playlist, Song song){
        playlist.removeSong(song);
    }
}
