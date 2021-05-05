
public class User {
    private String name;
    private String lastName;
    private String tc;
    private int age;

    public User(String name, String lastName, String tc, int age) {
        this.name = name;
        this.lastName = lastName;
        this.tc = tc;
        this.age = age;
    }

  
    public String getName() {
        return name;
    }

   
    public void setName(String name) {
        this.name = name;
    }

  
    public String getLastName() {
        return lastName;
    }

   
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

   
    public String getTc() {
        return tc;
    }

    
    public void setTc(String tc) {
        this.tc = tc;
    }

   
    public int getAge() {
        return age;
    }

   
    public void setAge(int age) {
        this.age = age;
    }

    
    
    
}
