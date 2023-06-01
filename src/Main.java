public class Main {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Owner owner = new Owner();

        cat.setName("Барсик");
        cat.setAge(5);
        owner.setName("Юлия");
        cat.setOwner(owner);

        System.out.println(cat.greet());
    }
}