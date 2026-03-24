package ticket;
public class CleaningTicket extends ticket {
    private String type;
    public CleaningTicket(int id, String title, String desc, String loc, String type) {
        super(id, title, desc, loc);
        this.type = type;
    }
    @Override
    public double priorityScore() {
        if (description.toLowerCase().contains("trash")) {
            return 10.0;
        }
        return 6.0;
    }
}