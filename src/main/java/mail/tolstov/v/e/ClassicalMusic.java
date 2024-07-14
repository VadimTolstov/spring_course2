package mail.tolstov.v.e;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClassicalMusic implements Music {
    @Override
    public List<String> getSong() {
        return List.of("Hungarian Rhapsody", "An American in Paris", "The Man I Love");
    }
}
