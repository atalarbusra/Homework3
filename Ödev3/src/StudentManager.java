
public class StudentManager extends UserManager{
    
    
     public void add(User user) {
        System.out.println("Student "+" "+user.getName()+ " " + user.getLastName() + " " +"eklendi...");
    }
    
    public void delete(User user) {
           System.out.println("Student "+" "+user.getName()+ " " + user.getLastName() + " " +"silindi...");
       }
    
}
