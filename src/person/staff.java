package person;
public class staff extends person {
    private String department;
    public staff(int id, String name, String email, String department) {
        super(id, name, email);
        this.department = department;
    }
    public String getDepartment() {
        return department;
    }
}