package mail.tolstov.v.e;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);

        musicPlayer.playMusic();
        System.out.println(musicPlayer.getName());
        System.out.println(musicPlayer.getVolume());
        System.out.println("----------------------------------------------------------------------------------------------");
        RapMusic rapMusic = context.getBean("rapMusic", RapMusic.class);
        System.out.println("Пытаемся вызвать doMyDestroy у RapMusic");
        ClassicalMusic classicalMusic =context.getBean(ClassicalMusic.class);
        context.close();
    }
}
