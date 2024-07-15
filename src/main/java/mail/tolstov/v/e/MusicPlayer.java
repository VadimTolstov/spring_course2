package mail.tolstov.v.e;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

//@Component
public class MusicPlayer {
    @Value(value = "${musicPlayer.name}")
    private String name;
    @Value(value = "${musicPlayer.volume}")
    private int volume;
    private List<Music> musicList;

    public MusicPlayer(List<Music> musicList) {
        this.musicList = musicList;
    }

    public void playMusic() {
        int random = new Random().nextInt(3);
        int randomMusic = new Random().nextInt(3);
        System.out.println(musicList.get(random).getSong().get(randomMusic));

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}
