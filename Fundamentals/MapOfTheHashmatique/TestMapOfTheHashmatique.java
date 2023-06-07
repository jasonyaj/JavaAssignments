import java.util.Set;
import java.util.HashMap;

public class TestMapOfTheHashmatique {
    public static void main(String[] args) {

        // Instance of MapOfTheHashmatique
        MapOfTheHashmatique map = new MapOfTheHashmatique();

        // Insert 4 track songs
        map.trackList.put("No Role Modelz", "Don't save her, she don't wanna be saved...");
        map.trackList.put("Ain't No half-steppin", "...Friday the 13th I'mma play Jason...");
        map.trackList.put("Sandstorm", "BOOM Da na na na na");
        map.trackList.put("Never Gonna Give You Up", "Never gonna let you down");

        // Print to console 1 lyric by track title
        // System.out.println(map.getLyrics("No Role Modelz")); 
        // System.out.println(map.getLyrics("Ain't No half-steppin")); 
        // System.out.println(map.getLyrics("Sandstorm")); 
        // System.out.println(map.getLyrics("Never Gonna Give You Up")); 

        // Print all the Track:Lyric
        map.getTrackLyric();
    }
}