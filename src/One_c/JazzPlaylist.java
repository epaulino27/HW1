package One_c;

import java.util.ArrayList;
import java.util.List;

public class JazzPlaylist implements Playlist {
    String name;
    List<Song> songs = new ArrayList<Song>();

    public JazzPlaylist(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void addSong(Song song){
        System.out.println("Adding song to jazz playlist now.");
        songs.add(song);
        return;
    }

    public void removeSong(Song song){
        System.out.println("Removing song from jazz playlist now.");
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

    public static List<Song> getSongs() {
        for(Song play: songs) {
            System.out.println(play.GetTitle());
        }
        return songs;
    }
}

