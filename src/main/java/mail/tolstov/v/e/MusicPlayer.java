package mail.tolstov.v.e;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

import java.util.Random;

@Component
public class MusicPlayer {
    @Value(value = "${musicPlayer.name}")
    private String name;
    @Value(value = "${musicPlayer.volume}")
    private int volume;
    private Music music1;
    private Music music2;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music1,
                       @Qualifier("musicBean") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public void playMusic(GenreOfMusic genreOfMusic) {
        int random = new Random().nextInt(3);
        if (genreOfMusic == GenreOfMusic.CLASSICAL) {
            System.out.println(music1.getSong().get(random));
        } else System.out.println(music2.getSong().get(random));

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
