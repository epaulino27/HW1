package One_b;
import java.util.ArrayList;

import static com.sun.beans.introspect.ClassInfo.clear;

public class User {
    String username;
    ArrayList<Playlist> playlists = new ArrayList<Playlist>();

    public Playlist createPlaylist(String name, String type){
        switch(type){
            case "rock": case "Rock":
                return new RockPlaylist(name);
            case "pop": case "Pop":
                return new PopPlaylist(name);
            case "jazz": case "Jazz":
                return new JazzPlaylist(name);
            default:
                return new Playlist();
        }
    }

    public void deletePlaylist(Playlist playlist){
        clear();
    }

    public void addSongToPlaylist(Playlist playlist, Song song){
        playlist.addSong(song);
    }

    public void removeSongFromPlaylist(Playlist playlist, Song song){
        playlist.removeSong(song);
    }
}
