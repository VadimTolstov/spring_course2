package mail.tolstov.v.e;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        var music = context.getBean(MusicPlayer.class);
        music.playMusic(GenreOfMusic.CLASSICAL);
        music.playMusic(GenreOfMusic.ROCK);

        System.out.println(music.getName());
        System.out.println(music.getVolume());
        context.close();
    }
}
