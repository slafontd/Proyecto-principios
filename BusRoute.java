public class BusRoute {
    private String name;
    private String[] schedule;

    public BusRoute(String name, String[] schedule) {
        this.name = name;
        this.schedule = schedule;
    }

    public String getName() {
        return name;
    }

    public String[] getSchedule() {
        return schedule;
    }
}
