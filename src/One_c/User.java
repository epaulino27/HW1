package One_c;

import java.util.ArrayList;
import java.util.List;

public class User {
    //attributes
    List<Playlist> playlists = new ArrayList<Playlist>();
    String username;
    List<Song> library = new ArrayList<Song>();

    //constructor
    User(String username){
        this.username = username;
        System.out.println("User Created");
        return;
    }

    //setters
    public Playlist createPlaylist(String name, String genre){
        switch(genre){
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
                System.out.println("Invalid genre, please try again.");
                return null;
        }
    }

    public void addSongToPlaylist(Playlist playlist, Song song){
        playlist.addSong(song);
    }

    //getters

    public List<Song> listByGenre(String genre){
        switch(genre){
            case "pop": case "Pop":
                return PopPlaylist.getSongs();
            case "rock": case "Rock":
                return RockPlaylist.getSongs();
            case "jazz": case "Jazz":
                return JazzPlaylist.getSongs();
            default:
                return null;
        }
    }

    public List<Song> listByMood(String mood){
        switch(mood){
            case "Happy": case "happy":
                return PopPlaylist.getSongs();
            case "idk": case "I don't know": case "IDK":
                return RockPlaylist.getSongs();
            case "sad": case "Sad":
                return JazzPlaylist.getSongs();
            default:
                return null;
        }
    }

    public List<Playlist> getPlaylists(){
        return playlists;
    }

    //display method
    public void showAllSongs() {
        for (Song show : library) {
            System.out.println(show.toString());
        }
        return;
    }

    //other methods
    public void deletePlaylist(Playlist playlist){
        playlists.remove(playlist);
        return;
    }

    public void removeSongFromPlaylist(Playlist playlist, Song song){
        playlist.removeSong(song);
        return;
    }
}
