package mail.tolstov.v.e;

import org.springframework.stereotype.Component;

public class RapMusic implements Music {
    @Override
    public String getSong() {
        return "99 problems";
    }
}
