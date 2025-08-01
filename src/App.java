public class App {
    public static void main(String[] args) {
        Animal animal1 = new Duck("Buddy", 5, "Pekín");
        System.out.println(animal1.getName());
        animal1.fly();
        animal1.swim();

        Animal animal2 = new Fish("Nemo", 3, "Payaso");
        animal2.getName();
        animal2.swim();

        Animal animal3 = new Bird("Pio", 4, "Petirojo");
        System.out.println(animal3.getName());
        animal3.fly();
    }
}
