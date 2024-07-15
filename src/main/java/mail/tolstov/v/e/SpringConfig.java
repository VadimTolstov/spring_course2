package mail.tolstov.v.e;

import org.springframework.context.annotation.*;

import java.util.Arrays;
import java.util.List;

@Configuration
//@ComponentScan("mail.tolstov.v.e")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    @Bean
    @Scope("prototype")
    public ClassicalMusic classicalMusic() {
        return new ClassicalMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public RapMusic rapMusic() {
        return new RapMusic();
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(List.of(new RapMusic(), new RockMusic(), new ClassicalMusic()));
    }

    //можно так создать лист для решения
    @Bean
    public List<Music> musicList() {
        // Этот лист неизменяемый (immutable)
        return Arrays.asList(classicalMusic(), rockMusic(), rapMusic());
    }

}
