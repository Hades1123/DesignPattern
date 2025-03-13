package ObserverPattern;

public class Main {
    public static void main(String[] args) {
        Manager manager = new Manager();
        FireFly fireFly = new FireFly(manager);
        Journalist journalist = new Journalist(manager);
        manager.changeSchedule("Quang Ngai", "Jack 5 cu", "7:00 AM 13/03/2025");
        manager.changeSchedule("Binh Dinh", "Sleepy", "7:00 AM 13/03/2025");
        Journalist journalist2 = new Journalist(manager);
        manager.changeSchedule("Quang Ninh", "Jack 5 cu", "7:00 AM 13/03/2025");

        //* Unregister()
        manager.removeObserver(journalist);
        manager.removeObserver(journalist2);
        manager.changeSchedule("Bac Ninh", "???", "7:00 AM 13/03/2025");

        //* Register()
        manager.addObserver(fireFly);
        manager.changeSchedule("Ha Noi", "???", "7:00 AM 13/03/2025");
    }
}
