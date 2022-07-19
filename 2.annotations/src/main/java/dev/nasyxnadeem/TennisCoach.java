package dev.nasyxnadeem;

import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
}
