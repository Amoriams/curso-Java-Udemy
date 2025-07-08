package entities;

public class Pet {
    public String name;
    public String type;
    public int age;

    public String presentation(){
        if (age <= 1) {
            return "Hi! I'm " + name + ", a " + type + ", and I'm  " + age + " year old!";
        } else {
        return "Hi! I'm " + name + ", a " + type + ", and I'm " + age + " years old!";
        }
    }
}
