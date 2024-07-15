package mail.tolstov.v.e;

import java.util.List;

public class RapMusic implements Music {
    @Override
    public List<String> getSong() {
        return List.of("Take five", "lal ala", "ye ye");
    }
}
