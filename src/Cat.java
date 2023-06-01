import static java.lang.System.*;

public class Cat {
    private String name;
    private int age;
    private Owner owner;


    public Cat() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public String greet() {
        return String.format("Мяу! Меня зовут %s. Мне %d года(лет). Мой владелец - %s.", name, age, owner);
    }
}
