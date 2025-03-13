package ObserverPattern;

import java.util.ArrayList;
import java.util.List;

public class Manager implements Subject{

    private final List<Observer> observers;
    private String location;
    private String songName;
    private String timeStart;

    public Manager(){
        observers = new ArrayList<>();
    }

    public String getLocation() {
       return location;
    }

    public String getSongName() {
       return songName;
    }

    public String getTimeStart() {
       return timeStart;
    }

    public void changeSchedule(String location, String songName, String timeStart) {
        this.location = location;
        this.songName = songName;
        this.timeStart = timeStart;
        notifyObservers();
    }

    @Override
    public void addObserver(Observer o) {
        if (!observers.contains(o)) {
            observers.add(o);
        }
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        System.out.println("\nUpdate Schedule List:");
        for (Observer o : observers) {
            o.update();
        }
    }
}
