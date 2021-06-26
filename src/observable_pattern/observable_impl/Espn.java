package observable_pattern.observable_impl;

import java.util.Observable;
import java.util.Observer;

public class Espn implements SportBroadcaster, Observer {

    private final Observable observable;
    private int awayTeamScore;
    private int homeTeamScore;

    public Espn(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object sportDataObject) {
        if(o instanceof SportData){

            if(sportDataObject != null ){
                //TODO: Create sportDataObject to pass data.
            }

            SportData sportData = (SportData) o;
            this.awayTeamScore = sportData.getAwayTeamScore();
            this.homeTeamScore = sportData.getHomeTeamScore();
            displayScores();
        }
    }

    @Override
    public void displayScores() {
        System.out.println("Home team: " + homeTeamScore + " Away Team: " + awayTeamScore);
    }
}
