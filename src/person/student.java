package person;
public class student extends person {
    private String program;
    private int semester;
    public student(int id, String name, String email, String program, int semester) {
        super(id, name, email);
        this.program = program;
        this.semester = semester;
    }
    public String getProgram() {
        return program;
    }
    public int getSemester() {
        return semester;
    }
}