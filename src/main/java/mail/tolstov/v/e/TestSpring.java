package mail.tolstov.v.e;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(SpringConfig.class);
        var music = context.getBean(MusicPlayer.class);
        music.playMusic();

        System.out.println(music.getName());
        System.out.println(music.getVolume());
        context.close();
    }
}
