package ObserverPattern;

public interface Subject {
    void removeObserver(Observer o);
    void addObserver(Observer o);
    void notifyObservers();
}
