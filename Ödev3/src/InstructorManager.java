
public class InstructorManager extends UserManager{


    public void add(User user) {
        System.out.println("Instructor "+" "+user.getName()+ " " + user.getLastName() +" " + "eklendi.. ");
    }
    
     public void delete(User user)
    {
        System.out.println("Instructor "+" "+user.getName()+ " " + user.getLastName() + " " +"silindi.. ");
    }
    
    
}
