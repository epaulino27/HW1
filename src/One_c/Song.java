package One_c;

public class Song {
    //attribute setup
    String title;
    String artist;
    double duration;
    String genre;
    String mood;

    //constructor
    Song(String title, String artist, double duration, String genre, String mood){
        this.title = title;
        this.artist = artist;
        this.duration = duration;
        this.genre = genre;
        this.mood = mood;
    }

    //getters
    public String GetTitle(){
        return title;
    }
    public String GetArtist(){
        return artist;
    }
    public double GetDuration(){
        return duration;
    }
    public String GetGenre(){
        return genre;
    }
    public String GetMood(){
        return mood;
    }

    //display method
    public String toString(){
        return GetTitle() + "by " + GetArtist() + " , " + GetDuration() + " minutes long. Genre: " + GetGenre() + ", Mood: " + GetMood();
    }
}
