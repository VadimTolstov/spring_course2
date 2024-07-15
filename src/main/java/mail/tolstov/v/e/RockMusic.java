package mail.tolstov.v.e;

import org.springframework.stereotype.Component;

import java.util.List;

//@Component("rockMusic")
public class RockMusic implements Music{
    @Override
    public List<String> getSong() {
        return List.of("Wind cries Mary", "Rock AAA-aaaa", "Faker faer");
    }
}
