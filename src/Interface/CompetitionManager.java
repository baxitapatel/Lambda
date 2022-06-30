package Interface;


import java.util.ArrayList;
import java.util.List;

public class CompetitionManager {

    public static void main(String[] args) {
        List<Performer> allParticipants = getAllParticipants();
        for (Performer performer : allParticipants){
            performer.perform();

        }


    }
    public static List<Performer> getAllParticipants(){
        List<Performer> performers = new ArrayList<>();
        SalsaPerformer salsaPerformer = new SalsaPerformer();
        Singer singer = new Singer();
        AerobicPerformance aerobicPerformance = new AerobicPerformance();
        performers.add(salsaPerformer);
        performers.add(singer);
        performers.add(aerobicPerformance);
        return performers;
    }
}
