package entities;

public class Register {
    public String name;
    public int age;
    public String profession;

 public String presentation(){
     return "Hello, my name is " + name + ", I'm " + age + " years old and I'm " + profession;
 }

}
