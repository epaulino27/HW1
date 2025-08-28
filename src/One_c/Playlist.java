package One_c;

import java.util.List;

public interface Playlist {
    public String getName();
    public void addSong(Song song);
    public void removeSong(Song song);
    public void playAllSongs();

    public static List<Song> getSongs() {
        return null;
    }
}


