package One_c;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //set up
        System.out.println("Please allow one moment for program setup: ");

        System.out.println();

        //add user
        User user1 = new User("placeholder_username");

        //add songs
        // rock
        Song rock1 = new Song("Bohemian Rhapsody", "Queen", 5.55, "rock", "idk");
        user1.library.add(rock1);
        Song rock2 = new Song("Dead Flowers", "Cover Guns N'Roses", 4.14, "rock", "idk");
        user1.library.add(rock2);
        Song rock3 = new Song("Smells Like Teen Spirit", "Nirvana", 5.01, "rock", "idk");
        user1.library.add(rock3);
        Song rock4 = new Song("Paranoid", "Black Sabbath", 2.52, "rock", "idk");
        user1.library.add(rock4);
        Song rock5 = new Song("Highway to Hell", "Ac/DC", 3.28, "rock", "idk");
        user1.library.add(rock5);
        //pop
        Song pop1 = new Song("Firework", "Katy perry", 3.48, "pop", "happy");
        user1.library.add(pop1);
        Song pop2 = new Song("Blinding Lights", "The Weeknd", 3.20, "pop", "happy");
        user1.library.add(pop2);
        Song pop3 = new Song("Dancing Queen", "ABBA", 3.51, "pop", "happy");
        user1.library.add(pop3);
        Song pop4 = new Song("Shake it Off", "Taylor Swift", 3.39, "pop", "happy");
        user1.library.add(pop4);
        Song pop5 = new Song("Uptown Funk", "Bruno Mars", 4.30, "pop", "happy");
        user1.library.add(pop5);
        //jazz
        Song jazz1 = new Song("So What", "Miles Davis", 9.22, "jazz", "sad");
        user1.library.add(jazz1);
        Song jazz2 = new Song("All of Me", "Billie Holiday", 3.06, "jazz", "sad");
        user1.library.add(jazz2);
        Song jazz3 = new Song("Take Five", "Dave Brubeck", 5.24, "jazz", "sad");
        user1.library.add(jazz3);
        Song jazz4 = new Song("My Favorite Things", "John Coltrane", 13.41, "jazz", "sad");
        user1.library.add(jazz4);
        Song jazz5 = new Song("Round Midnight", "Thelonious Monk", 6.45, "jazz", "sad");
        user1.library.add(jazz5);

        System.out.println();

        //add playlists
        Playlist rock_city = user1.createPlaylist("rock_city", "rock");
        Playlist pop_meadow =  user1.createPlaylist("pop_meadow", "pop");
        Playlist jazz_lake = user1.createPlaylist("jazz_lake", "jazz");

        System.out.println();

        //add songs to playlists
        //rock
        user1.addSongToPlaylist(rock_city, rock1);
        user1.addSongToPlaylist(rock_city, rock2);
        user1.addSongToPlaylist(rock_city, rock3);
        user1.addSongToPlaylist(rock_city, rock4);
        user1.addSongToPlaylist(rock_city, rock5);
        //pop
        user1.addSongToPlaylist(pop_meadow, pop1);
        user1.addSongToPlaylist(pop_meadow, pop2);
        user1.addSongToPlaylist(pop_meadow, pop3);
        user1.addSongToPlaylist(pop_meadow, pop4);
        user1.addSongToPlaylist(pop_meadow, pop5);
        //jazz
        user1.addSongToPlaylist(jazz_lake, jazz1);
        user1.addSongToPlaylist(jazz_lake, jazz2);
        user1.addSongToPlaylist(jazz_lake, jazz3);
        user1.addSongToPlaylist(jazz_lake, jazz4);
        user1.addSongToPlaylist(jazz_lake, jazz5);

        System.out.println();

        //start user interaction
        System.out.println("Program Setup Complete!");

        boolean active = true;
        while(active){
            System.out.println();

            //give options
            System.out.println("Would you like to see: ");
            System.out.println("1. Song recommendations by genre.");
            System.out.println("2. Songs by genre.");
            System.out.println("3. Songs by mood.");
            System.out.println("4. All songs.");
            System.out.println("Please input the number to see that option or type E to exit.");

            //handle input
            Scanner sc = new Scanner(System.in);
            String input = sc.next();

            //option execution
            switch(input){
                case "1": case "2":
                    System.out.println("Which genre? (rock, pop, jazz)");
                    String request1 = sc.next();
                    user1.listByGenre(request1);
                    break;
                case "3":
                    System.out.println("Which mood? (sad, happy, idk)");
                    String request2 = sc.next();
                    user1.listByMood(request2);
                    break;
                case "4":
                    //not working
                    user1.showAllSongs();
                    break;
                case "E": case "e":
                    return;
                default:
                    System.out.println("I'm sorry I don't recognize this input. Please try again.");
                    break;
            }
        }
    }
}