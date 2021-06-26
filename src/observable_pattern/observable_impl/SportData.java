package observable_pattern.observable_impl;

import java.util.Observable;

public class SportData extends Observable{

    private int awayTeamScore;
    private int homeTeamScore;

    //Observable holds the data structure now rather than SportsData


    public SportData() {
    }

    public void scoresChanged(){
        //We call setChanged() to indicate the score has changed
        setChanged();
        //NotifyObservers will check if the setChanged() is true and notify the observers
        //B/C we are not passing an object of data, it means that the observer will have to pull the data from us once notified
        notifyObservers();
    }


    public void setScore(int homeTeamScore, int awayTeamScore){
        this.homeTeamScore = homeTeamScore;
        this.awayTeamScore = awayTeamScore;
        scoresChanged();
    }

    //The observers will use getters to pull data (if we do not push the data to them)

    public int getAwayTeamScore() {
        return awayTeamScore;
    }

    public int getHomeTeamScore() {
        return homeTeamScore;
    }

}
