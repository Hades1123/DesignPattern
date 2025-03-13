package ObserverPattern;

public class FireFly implements Observer, Display {

    static int counter = 0;
    private final Manager manager;
    private String location;
    private String songName;
    private String timeStart;
    private final int index;

    public FireFly(Manager manager){
        this.manager = manager;
        this.manager.addObserver(this);
        this.index = FireFly.counter;
        counter++;
    }

    @Override
    public void update() {
        this.location = manager.getLocation();
        this.songName = manager.getSongName();
        this.timeStart = manager.getTimeStart();
        displayUpdate();
    }

    @Override
    public void displayUpdate() {
        System.out.printf("YeuJack97[%d] => Location: %s, SongName: %s, timeStart: %s\n",index,location, songName, timeStart);
    }

}
