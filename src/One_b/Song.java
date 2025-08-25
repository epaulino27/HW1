package One_b;

public class Song {
    //attribute setup
    String title;
    String artist;
    double duration;

    //constructor
    Song(String title, String artist, double duration){
        this.title = title;
        this.artist = artist;
        this.duration = duration;
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
}
