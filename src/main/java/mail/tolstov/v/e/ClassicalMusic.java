package mail.tolstov.v.e;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.List;

@Component
@Scope("singleton")
public class ClassicalMusic implements Music {
    @PostConstruct
    private void doMyInit(){
        System.out.println("Doing my initialization ClassicalMusic");
    }
    @PreDestroy
    private void doMyDestroy(){
        System.out.println("Doing my destruction ClassicalMusic");
    }
    @Override
    public List<String> getSong() {
        return List.of("Hungarian Rhapsody", "An American in Paris", "The Man I Love");
    }
}
