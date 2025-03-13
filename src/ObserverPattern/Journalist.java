package ObserverPattern;

public class Journalist implements Observer, Display {

    static int counter = 0;
    private final Manager manager;
    private String location;
    private String timeStart;
    private final int index;

    public Journalist(Manager manager){
        this.manager = manager;
        this.manager.addObserver(this);
        this.index = counter;
        counter++;
    }

    @Override
    public void update() {
        location = manager.getLocation();
        timeStart = manager.getTimeStart();
        displayUpdate();
    }

    @Override
    public void displayUpdate(){
        System.out.printf("Journalist[%d] => Location: %s, TimeStart: %s\n",index,location,timeStart);
    }


}
