
public class Main {
    
    public static void main(String [] args)
    {
        User user=new User("Elif","Ateş","4566",25);
        Student student=new Student("Murat","Bakırtaş","4566",25,"333");
        Instructor instructor=new Instructor("Büşra","Atalar","4566",25,"222");
    
        System.out.println(student.getAge() +" "+ student.getName() + " "+student.getLastName());
        System.out.println(instructor.getAge() +" " +instructor.getName() + " "+instructor.getLastName());
        
        
        UserManager userManager=new UserManager();
        InstructorManager instructorManager=new InstructorManager();
        StudentManager studentManager=new StudentManager();
        
        studentManager.add(student);
        instructorManager.add(instructor);
        
         studentManager.delete(student);
         instructorManager.delete(instructor);
         
          
    
    
    }
    
    
}
