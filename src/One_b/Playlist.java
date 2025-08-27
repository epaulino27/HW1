package One_b;
import java.util.ArrayList;
import java.util.List;

public class Playlist {
    String name;
    List<Song> Playlist = new ArrayList<Song>();

    public void addSong(Song song){
        System.out.println("Adding song to playlist now.");
        Playlist.add(song);
        return;
    }

    public void removeSong(Song song){
        System.out.println("Removing song from playlist now.");
        Playlist.remove(song);
        return;
    }

    public void playAllSongs(){
        for(Song play: Playlist){
            System.out.println(play.GetTitle() + " by " + play.GetArtist() + ", " + play.GetDuration());
        }
        return;
    }
}
