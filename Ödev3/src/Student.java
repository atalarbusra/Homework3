
public class Student extends User {

    private String studentNumber;
  
   
    
    public Student(String name, String lastName, String tc, int age,String StudentNumber) {
        super(name, lastName, tc, age);
        this.studentNumber=studentNumber;
    }

    
    public String getStudentNumber() {
        return studentNumber;
    }

    public void setStudentNumber(String studentNumber) {
        this.studentNumber = studentNumber;
    }
    
    
    
}
