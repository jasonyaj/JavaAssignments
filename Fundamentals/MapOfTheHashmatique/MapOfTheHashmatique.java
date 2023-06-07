import java.util.HashMap;
import java.util.Set;

public class MapOfTheHashmatique {

    // create a HashMap
    HashMap<String, String> trackList = new HashMap<String, String>();

    public String getLyrics(String track) {
        String lyric = trackList.get(track);
        return lyric;
    }

    public void getTrackLyric () {
        Set<String> keys = trackList.keySet();
        for (String key : keys) {
            System.out.println(key + ": " + trackList.get(key));
        }
    }
}