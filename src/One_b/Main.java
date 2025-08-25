package One_b;

public class Main {
    public static void main(String[] args) {
        //rock
        Song rock1 = new Song("Bohemian Rhapsody", "Queen", 5.55);
        Song rock2 = new Song("Dead Flowers", "Cover Guns N'Roses", 4.14);

        //pop
        Song pop1 = new Song("Firework", "Katy perry", 3.48);
        Song pop2 = new Song("Blinding Lights", "The Weeknd", 3.20);

        //jazz
        Song jazz1 = new Song("So What", "Miles Davis", 9.22);
        Song jazz2 = new Song("All of Me", "Billie Holiday", 3.06);

        //make playlists
        Playlist Rock_the_World = User.createPlaylist("Rock_the_World", "rock");
        Playlist Dont_stop_the_Pop =  User.createPlaylist("Don't_stop_the_Pop", "pop");
        Playlist The_smoothest_ofJazz = User.createPlaylist("The_smoothest_of_Jazz", "jazz");

        //add songs to playlists
        User.addSongToPlaylist(Rock_the_World, rock1);
        User.addSongToPlaylist(Rock_the_World, rock2);

        User.addSongToPlaylist(Dont_stop_the_Pop, pop1);
        User.addSongToPlaylist(Dont_stop_the_Pop, pop2);

        User.addSongToPlaylist(The_smoothest_ofJazz, jazz1);
        User.addSongToPlaylist(The_smoothest_ofJazz, jazz2);

        //display playlists

    }
}
