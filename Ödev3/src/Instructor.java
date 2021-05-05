
public class Instructor extends User{
    
    private String instructorNumber;

    public Instructor( String name, String lastName, String tc, int age ,String instructorNumber) {
        super(name, lastName, tc, age);
        this.instructorNumber = instructorNumber;
    }

    public String getInstructorNumber() {
        return instructorNumber;
    }

    public void setInstructorNumber(String instructorNumber) {
        this.instructorNumber = instructorNumber;
    }
    
    
    
}
