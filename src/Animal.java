public class Animal {
    private String name;
    private Integer age;

    public Animal(String nombre, Integer edad) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void fly() {
        System.out.println("Yo vuelo.");
    }

    public void swim() {
        System.out.println("Yo nado.");
    }
}
