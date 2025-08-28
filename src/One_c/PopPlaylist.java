package One_c;

import java.util.ArrayList;
import java.util.List;

public class PopPlaylist implements Playlist {
    //attributes
    String name;
    static List<Song> songs = new ArrayList<Song>();

    //constructor
    public PopPlaylist(String name) {
        this.name = name;
    }

    //getters
    public String getName() {
        return name;
    }

    public static List<Song> getSongs() {
        for(Song play: songs) {
            System.out.println(play.GetTitle());
        }
        return songs;
    }

    //setters
    public void addSong(Song song){
        System.out.println("Adding song to pop playlist now.");
        songs.add(song);
        return;
    }

    //other methods
    public void removeSong(Song song){
        System.out.println("Removing song from pop playlist now.");
        songs.remove(song);
        return;
    }

    public void playAllSongs(){
        System.out.println("Now Playing: ");
        for(Song play: songs){
            System.out.println(play.GetTitle() + " by " + play.GetArtist() + ", " + play.GetDuration());
        }
        return;
    }
}
