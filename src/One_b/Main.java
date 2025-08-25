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

        //make User
        User user1 = new User();

        //make playlists
        Playlist Rock_the_World = user1.createPlaylist("Rock_the_World", "rock");
        Playlist Dont_stop_the_Pop =  user1.createPlaylist("Don't_stop_the_Pop", "pop");
        Playlist The_smoothest_ofJazz = user1.createPlaylist("The_smoothest_of_Jazz", "jazz");

        //add songs to playlists
        user1.addSongToPlaylist(Rock_the_World, rock1);
        user1.addSongToPlaylist(Rock_the_World, rock2);

        user1.addSongToPlaylist(Dont_stop_the_Pop, pop1);
        user1.addSongToPlaylist(Dont_stop_the_Pop, pop2);

        user1.addSongToPlaylist(The_smoothest_ofJazz, jazz1);
        user1.addSongToPlaylist(The_smoothest_ofJazz, jazz2);

        //display playlists
        System.out.println("Rock Playlist: Rock_the_World");

        System.out.println(rock1.GetTitle() + " by " + rock1.GetArtist() + ", " + rock1.GetDuration());
        System.out.println(rock2.GetTitle() + " by " + rock2.GetArtist() + ", " + rock2.GetDuration());
        System.out.println();

        System.out.println("Pop Playlist: Don't_stop_the_Pop");

        System.out.println(pop1.GetTitle() + " by " + pop1.GetArtist() + ", " + pop1.GetDuration());
        System.out.println(pop2.GetTitle() + " by " + pop2.GetArtist() + ", " + pop2.GetDuration());
        System.out.println();

        System.out.println("Jazz Playlist: The_smoothest_of_Jazz");

        System.out.println(jazz1.GetTitle() + " by " + jazz1.GetArtist() + ", " + jazz1.GetDuration());
        System.out.println(jazz2.GetTitle() + " by " + jazz2.GetArtist() + ", " + jazz2.GetDuration());
        System.out.println();
    }
}
