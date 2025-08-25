package One_b;
import java.util.ArrayList;

public class Playlist {
    String name;
    ArrayList<Song> Playlist = new ArrayList<Song>();

    public void addSong(Song song){
        Playlist.add(song);
        return;
    }

    public void removeSong(Song song){
        Playlist.remove(song);
        return;
    }

    public void playAllSongs(){
        System.out.println("Now Playing: All your songs at once!");
        return;
    }
}
