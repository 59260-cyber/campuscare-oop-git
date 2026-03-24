package ticket;

public class maintenanceTicket extends ticket {
    private String type;

    public maintenanceTicket(int id, String title, String desc, String loc, String type) {
        super(id, title, desc, loc);
        this.type = type;
    }

    @Override
    public double priorityScore() {
        if (location.toLowerCase().contains("lab")) {
            return 9.0;
        }
        return 5.0;
    }
}